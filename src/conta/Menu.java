package conta;

import java.util.Scanner;
import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.util.Cores;

public class Menu {
	static Scanner input = new Scanner(System.in);
	static Conta conta1 = new ContaCorrente(123, 12345, "User", 10000f, 100);
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
			System.exit(0);
			break;

		case "0": // Ver dados da conta
			conta1.visualizar();
			System.out.println("Aperte [ENTER] para continuar.");
			break;

		case "/color":
			System.out.println("Ainda não implementado totalmente... Aguarde pelas versões futuras!");
			break;
			/*System.out.println("Parabéns! Você descobriu como alterar seu layout!");
			System.out.print("Digite um número de 0 a 9: ");
			System.out.println();
			
			System.out.println("Alterando cor do layout para");
			break;*/
		default:
			System.err.println("Opção inválida, por favor, selecione outro valor!");
		}
	}
	
	public static void printMenu() {
		System.out.println("╔════════════════════════════════════════════════╗");
		System.out.println("║                 BANCO DA PRAÇA                 ║");
		System.out.println("╠════════════════════════════════════════════════╣");
		System.out.println("║ Selecione uma das opções abaixo para continuar ║");
		System.out.println("║                                                ║");
		System.out.println("║1 - Criar conta                                 ║");
		System.out.println("║2 - Listar todas as contas                      ║");
		System.out.println("║3 - Buscar conta por número                     ║");
		System.out.println("║4 - Atualizar dados da conta                    ║");
		System.out.println("║5 - Apagar conta                                ║");
		System.out.println("║6 - Sacar                                       ║");
		System.out.println("║7 - Depositar                                   ║");
		System.out.println("║8 - Transferir valores entre contas             ║");
		System.out.println("║9 - Sair                                        ║");
		System.out.println("║0 - Ver dados da conta                          ║");
		System.out.println("╚════════════════════════════════════════════════╝");
		System.out.print("Digite uma opção: ");
	}
}
