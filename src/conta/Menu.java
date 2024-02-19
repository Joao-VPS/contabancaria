package conta;

import java.util.Scanner;
import conta.model.Conta;
import conta.util.Cores;

public class Menu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Conta conta1 = new Conta();

		boolean running = true;
		
		while (running) {
			System.out.println("========== BANCO ==========");
			System.out.println("Selecione uma das opções abaixo para continuar:");
			System.out.println("1 - Cadastrar conta");
			System.out.println("2 - Acessar conta");
			String userInput = input.nextLine();
			
			switch (userInput) {
			case "1":
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
			case "2":
				
				System.out.println("Exibindo dados da conta de " + conta1.getTitular());
				System.out.println("Número da Agência: " + conta1.getAgencia());
				System.out.println("Número da Conta: " + conta1.getConta());
				System.out.println("Tipo da Conta: " + conta1.getTipo());
				System.out.println("Nome do Titular: " + conta1.getTitular());
				System.out.printf("Saldo: R$%.2d", conta1.getSaldo());
				break;
			default:
				System.err.println("Opção inválida!");
			}
		}
	}
}
