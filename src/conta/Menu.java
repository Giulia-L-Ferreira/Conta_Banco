package conta;

import java.util.Scanner;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int opcao;
		
		while(true) { 
			
			System.out.println(Cores.TEXT_RED
			+ "------------------------------------------------------");
			System.out.println("                                                      ");
			System.out.println(Cores.TEXT_RED
					+ "        Banco (de dinheiro, não de sentar)            ");
			System.out.println("                                                      ");
			System.out.println(Cores.TEXT_YELLOW  
					+ "------------------------------------------------------");
			System.out.println("                                                      ");
			System.out.println(Cores.TEXT_YELLOW 
					+ "         1. Criar conta                               ");
			System.out.println(Cores.TEXT_GREEN 
					+ "         2. Listar todas as contas                    ");
			System.out.println(Cores.TEXT_GREEN 
					+ "         3. Buscar conta por numero                   ");
			System.out.println(Cores.TEXT_CYAN  
					+ "         4. Atualizar dados da conta                  ");
			System.out.println(Cores.TEXT_CYAN  
					+  "         5. Apagar conta                              ");
			System.out.println(Cores.TEXT_BLUE 
					+  "         6. Sacar                                     ");
			System.out.println(Cores.TEXT_BLUE 
					+  "         7. Depositar                                 ");
			System.out.println(Cores.TEXT_PURPLE 
					+  "         8. Transferir valores entre contas           ");
			System.out.println(Cores.TEXT_PURPLE  
					+  "         9.Sair                                       ");
			System.out.println("                                                      ");
			System.out.println(Cores.TEXT_PURPLE 
					+  "------------------------------------------------------");
			System.out.println(Cores.TEXT_WHITE
					+  "Digite a opção desejada:                              ");
			System.out.println("                                                      ");

			opcao = ler.nextInt();
			
			if (opcao == 9) {
				System.out.println("Banco (de dinheiro, não de sentar), porque dinheiro parado não cresce! 😆");
				sobre();
				ler.close();
				System.exit(0);
			}
			
			
			switch (opcao) {
			
			case 1:
				System.out.println(Cores.TEXT_WHITE + "Criar conta \n\n");
				break;
				
			case 2:
				System.out.println(Cores.TEXT_WHITE + "Listar todas as contas \n\n");
				break;
				
			case 3:
				System.out.println(Cores.TEXT_WHITE + "Consultar dados da conta por numero \n\n");
				break;
				
			case 4:
				System.out.println(Cores.TEXT_WHITE + "Atualizar dados da conta \n\n");
				break;
				
			case 5:
				System.out.println(Cores.TEXT_YELLOW_BOLD_BRIGHT + "Apagar a conta \n\n");
				break;
				
			case 6:
				System.out.println(Cores.TEXT_WHITE + "Saque \n\n");
				break;
				
			case 7:
				System.out.println(Cores.TEXT_WHITE + "Depósito \n\n");
				break;
				
			case 8:
				System.out.println(Cores.TEXT_WHITE + "Transferência entre contas \n\n");
				break;
				
			default:
				System.out.println(Cores.TEXT_RED_BOLD_BRIGHT+ "\nOpção inválida!\n");
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
