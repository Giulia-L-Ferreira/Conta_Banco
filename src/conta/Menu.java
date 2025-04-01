package conta;

import java.io.IOException;
import java.util.Scanner;

import conta.controller.ContaController;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {

		ContaController contas = new ContaController();

		Scanner ler = new Scanner(System.in);
		int opcao, numero, agencia, tipo, aniversario;
		String titular;
		float saldo, limite;

		while (true) {

			System.out.println(Cores.TEXT_RED + Cores.ANSI_BLACK_BACKGROUND
					+ "------------------------------------------------------");
			System.out.println("                                                      ");
			System.out.println("        Banco (de dinheiro, não de sentar)            ");
			System.out.println("                                                      ");
			System.out.println(Cores.TEXT_YELLOW + "------------------------------------------------------");
			System.out.println("                                                      ");
			System.out.println("         1. Criar conta                               ");
			System.out.println(Cores.TEXT_GREEN + "         2. Listar todas as contas                    ");
			System.out.println("         3. Buscar conta por numero                   ");
			System.out.println(Cores.TEXT_CYAN + "         4. Atualizar dados da conta                  ");
			System.out.println("         5. Apagar conta                              ");
			System.out.println(Cores.TEXT_BLUE + "         6. Sacar                                     ");
			System.out.println("         7. Depositar                                 ");
			System.out.println(Cores.TEXT_PURPLE + "         8. Transferir valores entre contas           ");
			System.out.println("         9.Sair                                       ");
			System.out.println("                                                      ");
			System.out.println(Cores.TEXT_PURPLE + "------------------------------------------------------");
			System.out.println(Cores.TEXT_WHITE + "Digite a opção desejada:                              ");
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
				System.out.println("\nCriar conta");
				System.out.println("\n------------------------------------------------------");

				System.out.println("\nDigite o número da agência: ");
				agencia = ler.nextInt();
				System.out.println("\nDigite o nome do titular: ");
				ler.skip("\\R?");
				titular = ler.nextLine();

				do {
					System.out.println("\nDigite o tipo da conta");
					System.out.println("-   1 - CC  ||  2 - CP   -");
					tipo = ler.nextInt();

				} while (tipo < 1 && tipo > 2);

				System.out.println("\nDigite o saldo da conta (R$): ");
				saldo = ler.nextFloat();

				switch (tipo) {
				case 1 -> {

					System.out.println("\nDigite o limite de crédito (R$): ");
					limite = ler.nextFloat();
					contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
				}
				case 2 -> {

					System.out.println("\nDigite o dia do aniversário da conta: ");
					aniversario = ler.nextInt();
					contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
				}

				}

				keyPress();
				break;

			case 2:
				System.out.println("\nListar todas as contas");
				System.out.println("------------------------------------------------------");
				contas.listarTodas();
				keyPress();
				break;

			case 3:
				System.out.println("\nConsultar dados da conta por numero");
				System.out.println("------------------------------------------------------\n\n");

				keyPress();
				break;

			case 4:
				System.out.println("\nAtualizar dados da conta");
				System.out.println("------------------------------------------------------\n\n");

				keyPress();
				break;

			case 5:
				System.out.println(Cores.TEXT_YELLOW_BOLD_BRIGHT + "\nApagar a conta" + Cores.TEXT_RESET);
				System.out.println("------------------------------------------------------\n\n");
				
				keyPress();
				break;

			case 6:
				System.out.println("\nSaque");
				System.out.println("------------------------------------------------------\n\n");

				keyPress();
				break;

			case 7:
				System.out.println("\nDepósito");
				System.out.println("------------------------------------------------------\n\n");
				
				keyPress();
				break;

			case 8:
				System.out.println("\nTransferência entre contas");
				System.out.println("------------------------------------------------------\n\n");
				
				keyPress();
				break;

			default:
				System.out.println(Cores.TEXT_RED_BOLD_BRIGHT + "\nOpção inválida!" + Cores.TEXT_RESET);
				System.out.println("------------------------------------------------------\n\n");
				
				keyPress();
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

	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}

	}
}
