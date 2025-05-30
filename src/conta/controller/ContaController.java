package conta.controller;

import java.util.ArrayList;

import conta.model.Conta;
import conta.repository.ContaRepository;

public class ContaController implements ContaRepository {

	private ArrayList<Conta> listarContas = new ArrayList<Conta>();
	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {
		var conta = buscarNaCollection(numero);

		if (conta != null) {
			conta.visualizar();
		} else {
			System.out.println("\nA conta número " + numero +" não foi encontrada!");
		}


	}

	@Override
	public void listarTodas() {
		for (var conta : listarContas) {
			conta.visualizar();
		}

	}

	@Override
	public void cadastrar(Conta conta) {
		listarContas.add(conta);
		System.out.println("\nA Conta número " + conta.getNumero() + " foi criada com sucesso!");

	}

	@Override
	public void atualizar(Conta conta) {
		var buscarConta = buscarNaCollection(conta.getNumero());
		
		if (buscarConta != null) {
			listarContas.set(listarContas.indexOf(buscarConta), conta);
			System.out.println("\nConta numero "+ conta.getNumero()+" foi atualizada com sucesso!");
		}else {
			System.out.println("\nConta numero "+ conta.getNumero()+" não foi encontrada.");
		}

	}

	@Override
	public void deletar(int numero) {
		var conta = buscarNaCollection(numero);
		
		if(conta != null) {
			if(listarContas.remove(conta) == true)
				System.out.println("\nConta numero "+ numero +" foi deletada.");
		}else {
			System.out.println("\nConta numero "+ numero +" não foi encontrada!");
		}

	}

	@Override
	public void sacar(int numero, float valor) {
		var conta = buscarNaCollection(numero);
		
		if (conta != null) {
			
			if (conta.sacar(valor) == true)
				System.out.println("\nO saque na conta numero "+ numero +" foi efetuado com sucesso.");
		}else {
			System.out.println("\nConta numero "+ numero+" não foi encontrada!");
		}

	}

	@Override
	public void depositar(int numero, float valor) {
		var conta = buscarNaCollection(numero);
		
		if(conta != null) {
			conta.depositar(valor);
		System.out.println("\nO depósito na conta numero "+ numero +"foi efetuado.");
	}else {
		System.out.println("A conta numero "+numero+" não foi encontrada ou não é uma conta corrente.");
	}
	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		var contaOrigem = buscarNaCollection(numeroOrigem);
		var contaDestino = buscarNaCollection(numeroDestino);
		
		if(contaOrigem != null && contaDestino != null) {
			
			if(contaOrigem.sacar(valor) == true) {
				contaDestino.depositar(valor);
				System.out.println("\nA transferência foi efetuada com sucesso!");
			}else {
				System.err.println("\nA conta de origem e/ou destino não foram encontradas.");
			}
			
		}

	}

	public int gerarNumero() {
		return ++numero;
	}

	public Conta buscarNaCollection(int numero) {
		for (var conta : listarContas) {
			if (conta.getNumero() == numero) {
				return conta;
			}

		}
		return null;
	}
}
