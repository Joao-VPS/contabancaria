package conta;

import java.util.Scanner;
import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.util.Cores;

public class Menu {
	static Scanner input = new Scanner(System.in);
	static Conta conta1 = new ContaCorrente(123, 12345, "User", 10000f, 100);
	static String color = Cores.TEXT_WHITE;
	static boolean loop = true;
	
	public static void main(String[] args) {
		while (loop) {
			printMenu();
			String userInput = input.nextLine();
			
			System.out.println();
			
			menuInput(userInput);
			System.out.println("Aperte [ENTER] para continuar");
			input.nextLine();
			
			System.out.println();
		}
	}
	
	public static void menuInput(String option) {
		switch (option) {
		case "1": // Criar conta
			break;

		case "2": // Listar todas as contas
			break;

		case "3": // Buscar conta por número
			break;

		case "4": // Atualizar dados da conta
			System.out.println("Digite o número da Agência: ");
			conta1.setAgencia(input.nextInt());
			System.out.println("Digite o número da Conta: ");
			conta1.setConta(input.nextInt());
			System.out.println("Digite o tipo da conta (1 - Corrente, 2 - Poupança)");
			conta1.setTipo(input.nextInt());
			input.nextLine();
			System.out.println("Qual o nome do Titular? ");
			conta1.setTitular(input.nextLine());
			System.out.println("Digite o valor da Conta: ");
			conta1.setSaldo(input.nextFloat());
			break;

		case "5": // Apagar conta
			break;

		case "6": // Sacar
			System.out.println("Digite um valor:");
			float valorSaque = input.nextFloat();
			boolean valorValido = conta1.sacar(valorSaque);
			
			if (valorValido) {
				System.out.printf("Saque efetuado com sucesso. Novo saldo é de R$%.2f", conta1.getSaldo());
				System.out.println();
			} else {
				System.err.println("Você não tem saldo suficiente. Tente outro valor!");
			}
			
			if (input.hasNextLine()) input.nextLine();
			break;

		case "7": // Depositar
			System.out.println("Digite um valor");
			float valorDeposito = input.nextFloat();
			
			conta1.depositar(valorDeposito);
			System.out.printf("O valor de R$%.2f foi adicionado à sua conta. Seu saldo agora é de R$%.2f", valorDeposito, conta1.getSaldo());
			System.out.println();
			
			if (input.hasNextLine()) input.nextLine();
			break;

		case "8": // Transferir valores entre contas
			break;

		case "9": // Sair do aplicativo
			System.out.println("Obrigado por usar nossos serviços! Volte sempre!");
			loop = false;
			
			sobre();
			System.exit(0);
			break;

		case "0": // Ver dados da conta
			conta1.visualizar();
			break;

		case "/color":
			System.out.println("Parabéns! Você descobriu como alterar seu layout!");
			
			while (true) {
				System.out.print("Digite um número de 0 a 9 ou letra de A a F: ");
				System.out.println();
				if (setColor(input.nextLine())) break;
			}
			
			break;
		default:
			System.err.println("Opção inválida, por favor, selecione outro valor!");
		}
	}
	
	public static void printMenu() {
		System.out.println(color + "╔════════════════════════════════════════════════╗");
		System.out.println(color + "║                 BANCO DA PRAÇA                 ║");
		System.out.println(color + "╠════════════════════════════════════════════════╣");
		System.out.println(color + "║ Selecione uma das opções abaixo para continuar ║");
		System.out.println(color + "║                                                ║");
		System.out.println(color + "║1 - Criar conta                                 ║");
		System.out.println(color + "║2 - Listar todas as contas                      ║");
		System.out.println(color + "║3 - Buscar conta por número                     ║");
		System.out.println(color + "║4 - Atualizar dados da conta                    ║");
		System.out.println(color + "║5 - Apagar conta                                ║");
		System.out.println(color + "║6 - Sacar                                       ║");
		System.out.println(color + "║7 - Depositar                                   ║");
		System.out.println(color + "║8 - Transferir valores entre contas             ║");
		System.out.println(color + "║9 - Sair                                        ║");
		System.out.println(color + "║0 - Ver dados da conta                          ║");
		System.out.println(color + "╚════════════════════════════════════════════════╝");
		System.out.print("Digite uma opção: ");
	}
	
	public static boolean setColor(String value) {
		switch (value) {
		case "0":
			color = Cores.TEXT_BLACK;
			System.out.println(color + "Alterando cor do layout para PRETO");
			return true;
		case "1":
			color = Cores.TEXT_BLUE;
			System.out.println(color + "Alterando cor do layout para AZUL");
			return true;
		case "2":
			color = Cores.TEXT_GREEN;
			System.out.println(color + "Alterando cor do layout para VERDE");
			return true;
		case "3":
			color = Cores.TEXT_CYAN;
			System.out.println(color + "Alterando cor do layout para CIANO");
			return true;
		case "4":
			color = Cores.TEXT_RED;
			System.out.println(color + "Alterando cor do layout para VERMELHO");
			return true;
		case "5":
			color = Cores.TEXT_PURPLE;
			System.out.println(color + "Alterando cor do layout para ROXO");
			return true;
		case "6":
			color = Cores.TEXT_YELLOW;
			System.out.println(color + "Alterando cor do layout para DOURADO");
			return true;
		case "7":
			color = Cores.TEXT_WHITE;
			System.out.println(color + "Alterando cor do layout para CINZA CLARO");
			return true;
		case "8":
			color = Cores.TEXT_BLACK_BRIGHT;
			System.out.println(color + "Alterando cor do layout para CINZA");
			return true;
		case "9":
			color = Cores.TEXT_BLUE_BRIGHT;
			System.out.println(color + "Alterando cor do layout para AZUL CLARO");
			return true;
		case "a":
			color = Cores.TEXT_GREEN_BRIGHT;
			System.out.println(color + "Alterando cor do layout para VERDE CLARO");
			return true;
		case "b":
			color = Cores.TEXT_CYAN_BRIGHT;
			System.out.println(color + "Alterando cor do layout para CIANO CLARO");
			return true;
		case "c":
			color = Cores.TEXT_RED_BRIGHT;
			System.out.println(color + "Alterando cor do layout para VERMELHO CLARO");
			return true;
		case "d":
			color = Cores.TEXT_PURPLE_BRIGHT;
			System.out.println(color + "Alterando cor do layout para ROSA");
			return true;
		case "e":
			color = Cores.TEXT_YELLOW_BRIGHT;
			System.out.println(color + "Alterando cor do layout para AMARELO");
			return true;
		case "f":
			color = Cores.TEXT_WHITE_BRIGHT;
			System.out.println(color + "Alterando cor do layout para BRANCO");
			return true;
		case "l":
			color = Cores.TEXT_WHITE_BRIGHT;
			System.out.println(color + "Adicionando efeito NEGRITO");
			return true;
		case "n":
			color = Cores.TEXT_WHITE_BRIGHT;
			System.out.println(color + "Adicionando efeito SUBLINHADO");
			return true;
		case "r":
			color = Cores.TEXT_WHITE_BRIGHT;
			System.out.println(color + "Restaurando todas a cores para o padrão de fábrica");
			return true;
		default:
			return false;
		}
	}

	public static void sobre() {
		System.out.println(Cores.TEXT_YELLOW_BRIGHT + "╔════════════════════════════════════════════════╗");
		System.out.println(Cores.TEXT_YELLOW_BRIGHT + "║   Projeto desenvolvido por João V. P. Sabino   ║");
		System.out.println(Cores.TEXT_YELLOW_BRIGHT + "║------------------------------------------------║");
		System.out.println(Cores.TEXT_YELLOW_BRIGHT + "║E-Mail: joaovictorpuglessabino@gmail.com        ║");
		System.out.println(Cores.TEXT_YELLOW_BRIGHT + "║GitHub: github.com/Joao-VPS                     ║");
		System.out.println(Cores.TEXT_YELLOW_BRIGHT + "╚════════════════════════════════════════════════╝");
	}
}
