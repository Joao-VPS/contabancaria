package conta;

import java.util.Scanner;

import conta.controller.ContaController;
import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;
import conta.util.Strings;

public class Menu {
	static Scanner input = new Scanner(System.in);
	static ContaController contas = new ContaController();
	static boolean loop = true;

	public static void main(String[] args) {
		while (loop) {
			System.out.println(Cores.getColorTheme() + Strings.MAIN_MENU_OPTIONS);
			System.out.print(Cores.getColorTheme() + Strings.OPTION_SELECT);
			String userInput = input.nextLine();
			System.out.println();

			menuInput(userInput);
			System.out.println(Strings.PRESS_ENTER);
			input.nextLine();

			System.out.println();
		}
	}

	public static void menuInput(String option) {
		switch (option) {
		case "1":
			cadastrarConta();
			break;

		case "2":
			contas.listarTodas();
			break;

		case "3": // Buscar conta por número
			break;

		case "4": // Atualizar dados da conta
			/*System.out.println(Strings.ASK_ACCOUNT_AGENCY);
			conta1.setAgencia(input.nextInt());
			if (input.hasNextLine())
				input.nextLine();

			System.out.println(Strings.ASK_ACCOUNT_NUMBER);
			conta1.setConta(input.nextInt());
			if (input.hasNextLine())
				input.nextLine();

			System.out.println(Strings.ASK_ACCOUNT_TYPE);
			conta1.setTipo(input.nextByte());
			if (input.hasNextLine())
				input.nextLine();

			System.out.println(Strings.ASK_ACCOUNT_OWNER);
			conta1.setTitular(input.nextLine());

			System.out.println(Strings.ASK_ACCOUNT_BALANCE);
			conta1.setSaldo(input.nextFloat());
			if (input.hasNextLine())
				input.nextLine();*/

			break;

		case "5": // Apagar conta
			break;

		case "6": // Sacar
			sacar();
			break;

		case "7": // Depositar
			depositar();
			break;

		case "8": // Transferir valores entre contas
			break;

		case "9": // Sair do aplicativo
			shutdown();
			break;

		case "0": // Ver dados da conta
			//conta1.visualizar();
			break;

		case "/color":
			System.out.println(Strings.COLOR_MENU);

			while (true) {
				System.out.println(Strings.COLOR_OPTIONS);
				if (Cores.setColorTheme(input.nextLine()))
					break;
			}

			break;
		default:
			System.err.println(Cores.getColorTheme() + Strings.OPTION_INVALID);
		}
	}

	public static void sacar() {
		System.out.println(Cores.getColorTheme() + Strings.INPUT_VALUE);
		float valorSaque = input.nextFloat();
		//boolean valorValido = conta1.sacar(valorSaque);

		//if (valorValido) {
		//	System.out.printf(Cores.getColorTheme() + Strings.WITHDRAWAL_SUCCESS, conta1.getSaldo());
		//	System.out.println();
		//} else {
		//	System.err.println(Cores.getColorTheme() + Strings.WITHDRAWAL_FAILED);
		//}

		if (input.hasNextLine())
			input.nextLine();
	}

	public static void depositar() {
		System.out.println(Cores.getColorTheme() + Strings.INPUT_VALUE);
		float valorDeposito;

		try {
			valorDeposito = input.nextFloat();
		} catch (Exception e) {
			System.out.println(Cores.getColorTheme() + Strings.INVALID_VALUE);
			return;
		}

		//conta1.depositar(valorDeposito);
		System.out.println();

		if (input.hasNextLine())
			input.nextLine();
	}

	public static void cadastrarConta() {
		int agencia = 0, aniversario;
		byte tipo = 0;
		float saldo, limite;
		String titular;

		System.out.println(Strings.MESSAGE_CREATE_NEW);

		System.out.println(Strings.ASK_ACCOUNT_AGENCY);
		while (agencia < 1 || agencia > 9999) {
			try {
				agencia = input.nextInt();
				
				if (agencia < 1 || agencia > 9999) {
					System.out.println(Strings.INVALID_AGENCY);
				}
			} catch (Exception e) {
				input.nextLine();
				System.out.println(Strings.INVALID_VALUE);
			}
		}

		System.out.println(Strings.ASK_ACCOUNT_OWNER);
		input.skip("\\R?");
		titular = input.nextLine();

		System.out.println(Strings.ASK_ACCOUNT_TYPE);
		while (tipo < 1 || tipo > 2) {
			try {
				tipo = input.nextByte();

				if (tipo < 1 || tipo > 2) {
					System.out.println(Strings.OPTION_INVALID);
				}
			} catch (Exception e) {
				input.nextLine();
				System.out.println(Strings.INVALID_VALUE);
			}
		}
		
		System.out.println(Strings.ASK_ACCOUNT_BALANCE);
		while (true) {
			try {
				saldo = input.nextFloat();
				break;
			} catch (Exception e) {
				input.nextLine();
				System.out.println(Strings.INVALID_VALUE);
			}
		}

		switch (tipo) {
			case 1 -> {
				System.out.println(Strings.ASK_ACCOUNT_LIMIT);
				while (true) {
					try { limite = input.nextFloat();
						if (limite < 0) System.out.println(Strings.INVALID_VALUE);
						else break;
					}
					catch (Exception e) {
						System.out.println(Strings.INVALID_VALUE);
						input.nextLine();
					}
				}
				contas.cadastrar(new ContaCorrente(agencia, contas.gerarNumero(), titular, saldo, limite));
			}
			case 2 -> {
				System.out.println(Strings.ASK_ACCOUNT_ANIVERSARY);
				while (true) {
					try { aniversario = input.nextInt(); break; }
					catch (Exception e) {
						System.out.println(Strings.INVALID_VALUE);
						input.nextLine();
					}
				}
				contas.cadastrar(new ContaPoupanca(agencia, contas.gerarNumero(), titular, saldo, aniversario));
			}
		}
		input.nextLine();
	}

	public static void shutdown() {
		System.out.println(Strings.GOODBYE_MESSAGE);
		loop = false;

		sobre();
		System.exit(0);
	}

	public static void sobre() {
		System.out.println(Cores.TEXT_YELLOW + "╔════════════════════════════════════════════════╗");
		System.out.println(Cores.TEXT_YELLOW + "║   Projeto desenvolvido por João V. P. Sabino   ║");
		System.out.println(Cores.TEXT_YELLOW + "║------------------------------------------------║");
		System.out.println(Cores.TEXT_YELLOW + "║E-Mail: joaovictorpuglessabino@gmail.com        ║");
		System.out.println(Cores.TEXT_YELLOW + "║GitHub: github.com/Joao-VPS                     ║");
		System.out.println(Cores.TEXT_YELLOW + "╚════════════════════════════════════════════════╝");
	}
}
