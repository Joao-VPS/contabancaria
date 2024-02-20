package conta;

import java.util.Scanner;
import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.util.Cores;

public class Menu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Conta conta1 = new ContaCorrente(123, 12345, "User", 10000f, 100);

		boolean running = true;
		
		while (running) {
			System.out.println("========== BANCO ==========");
			System.out.println("Selecione uma das opções abaixo para continuar:");
			System.out.println("1 - Ver dados da conta");
			System.out.println("2 - Atualizar conta");
			System.out.println("3 - Sacar");
			System.out.println("4 - Depositar");
			System.out.print("Digite uma opção: ");
			String userInput = input.nextLine();
			
			System.out.println();
			
			switch (userInput) {
			case "1":
				conta1.dadosConta();
				System.out.println("Aperte [ENTER] para continuar.");
				break;
				
			case "2":
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
				
			case "3":
				System.out.println("Digite um valor:");
				float valorSaque = input.nextFloat();
				
				if (conta1.sacar(valorSaque)) {
					System.out.printf("Saque efetuado com sucesso. Novo saldo é de R$%.2f", conta1.getSaldo());
				} else {
					System.err.println("Você não tem saldo suficiente. Tente outro valor!");
				}
				break;
				
			case "4":
				System.out.println("Digite um valor");
				float valorDeposito = input.nextFloat();
				
				conta1.depositar(valorDeposito);
				System.out.printf("O valor de R$%.2f foi adicionado à sua conta. Seu saldo agora é de R$%.2f", valorDeposito, conta1.getSaldo());
				System.out.println();
				break;
				
			default:
				System.err.println("Opção inválida!");
			}
			
			if (input.hasNextLine()) input.nextLine();
			
			System.out.println();
		}
	}
}
