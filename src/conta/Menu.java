package conta;

import java.util.Scanner;

import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int opcao;
		
		
		        
				// Teste da Classe Conta Corrente
				ContaCorrente cc1 = new ContaCorrente(1, 123, 1, "José da Silva", 0.0f, 1000.0f);
				cc1.visualizar();
				cc1.sacar(12000.0f);
				cc1.visualizar();
				cc1.depositar(5000.0f);
				cc1.visualizar();
				
		        // Teste da Classe Conta Poupança
				ContaPoupanca cp1 = new ContaPoupanca(2, 123, 2, "Maria dos Santos", 100000.0f, 15);
				cp1.visualizar();
		        cp1.sacar(1000.0f);
				cp1.visualizar();
				cp1.depositar(5000.0f);
				cp1.visualizar();
		
		
		
		while(true) { 
			
			System.out.println(Cores.TEXT_RED + Cores.ANSI_BLACK_BACKGROUND
			+ "------------------------------------------------------");
			System.out.println("                                                      ");
			System.out.println("        Banco (de dinheiro, não de sentar)            ");
			System.out.println("                                                      ");
			System.out.println(Cores.TEXT_YELLOW  
					+ "------------------------------------------------------");
			System.out.println("                                                      ");
			System.out.println("         1. Criar conta                               ");
			System.out.println(Cores.TEXT_GREEN 
					+ "         2. Listar todas as contas                    ");
			System.out.println("         3. Buscar conta por numero                   ");
			System.out.println(Cores.TEXT_CYAN  
					+ "         4. Atualizar dados da conta                  ");
			System.out.println("         5. Apagar conta                              ");
			System.out.println(Cores.TEXT_BLUE 
					+  "         6. Sacar                                     ");
			System.out.println("         7. Depositar                                 ");
			System.out.println(Cores.TEXT_PURPLE 
					+  "         8. Transferir valores entre contas           ");
			System.out.println("         9.Sair                                       ");
			System.out.println("                                                      ");
			System.out.println(Cores.TEXT_PURPLE 
					+  "------------------------------------------------------");
			System.out.println(Cores.TEXT_WHITE
					+  "Digite a opção desejada:                              ");
			System.out.println("                                                      " + Cores.TEXT_RESET);

			opcao = ler.nextInt();
			
			if (opcao == 9) {
				System.out.println("Banco (de dinheiro, não de sentar), porque dinheiro parado não cresce! 😆");
				sobre();
				ler.close();
				System.exit(0);
			}
			
			
			switch (opcao) {
			
			case 1:
				System.out.println("Criar conta \n\n");
				break;
				
			case 2:
				System.out.println("Listar todas as contas \n\n");
				break;
				
			case 3:
				System.out.println("Consultar dados da conta por numero \n\n");
				break;
				
			case 4:
				System.out.println("Atualizar dados da conta \n\n");
				break;
				
			case 5:
				System.out.println(Cores.TEXT_YELLOW_BOLD_BRIGHT + 
						"Apagar a conta \n\n" + Cores.TEXT_RESET);
				break;
				
			case 6:
				System.out.println("Saque \n\n");
				break;
				
			case 7:
				System.out.println("Depósito \n\n");
				break;
				
			case 8:
				System.out.println("Transferência entre contas \n\n");
				break;
				
			default:
				System.out.println(Cores.TEXT_RED_BOLD_BRIGHT+ 
						"\nOpção inválida!\n" + Cores.TEXT_RESET);
				break;
				
			}
			
		}
		
}

	public static void sobre() {
		
		System.out.println("\n------------------------------------------------------------");
		System.out.println("Projeto desenvolvido por: Giulia L. Ferreira                ");
		System.out.println("Gmail: lopesgiulia30@gmail.com                              ");
		System.out.println("github.com/Giulia-L-Ferreira                                ");
		System.out.println("------------------------------------------------------------");
	
	}

	
}
