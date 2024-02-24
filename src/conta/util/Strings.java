package conta.util;

public class Strings {
	public static final String APP_NAME = "Banco da Praça";

	public static final String MAIN_MENU_OPTIONS = "╔════════════════════════════════════════════════╗\n"
			+ "║                 BANCO DA PRAÇA                 ║\n"
			+ "╠════════════════════════════════════════════════╣\n"
			+ "║ Selecione uma das opções abaixo para continuar ║\n"
			+ "║                                                ║\n"
			+ "║1 - Criar conta                                 ║\n"
			+ "║2 - Listar todas as contas                      ║\n"
			+ "║3 - Buscar conta por número                     ║\n"
			+ "║4 - Atualizar dados da conta                    ║\n"
			+ "║5 - Apagar conta                                ║\n"
			+ "║6 - Sacar                                       ║\n"
			+ "║7 - Depositar                                   ║\n"
			+ "║8 - Transferir valores entre contas             ║\n"
			+ "║9 - Sair                                        ║\n"
			+ "║0 - Ver dados da conta                          ║\n"
			+ "╚════════════════════════════════════════════════╝";

	public static final String INPUT_VALUE = "Insira um valor:";
	public static final String INVALID_VALUE = "Valor inválido! Tente um valor diferente!";
	public static final String OPTION_SELECT = "Escolha uma opção: ";
	public static final String OPTION_INVALID = "Opção inválida, por favor, selecione outro valor!";
	public static final String PRESS_ENTER = "Pressione [ENTER] para continuar...";
	
	public static final String CONTROLLER_NO_ACCOUNTS = "Nenhuma conta foi cadastrada até o momento!";
	public static final String CONTROLLER_NOT_FOUND = "Não foi possível localizar esta conta.";
	public static final String CONTROLLER_ACCOUNT_CREATED = "A conta nº%d foi criada com sucesso!\n";

	public static final String ACCOUNT_TYPE_CURRENT = "Conta Corrente";
	public static final String ACCOUNT_TYPE_SAVINGS = "Conta Poupança";
	public static final String ACCOUNT_INFO = "Mostrando informações da conta ";
	public static final String ACCOUNT_INFO_AGENCY = "Agência da conta: ";
	public static final String ACCOUNT_INFO_NUMBER = "Número da conta: ";
	public static final String ACCOUNT_INFO_TYPE = "Tipo da conta: ";
	public static final String ACCOUNT_INFO_OWNER = "Nome do titular: ";
	public static final String ACCOUNT_INFO_LIMIT = "Limite de crédito R$ %.2f\n";
	public static final String ACCOUNT_INFO_BIRTHDAY = "Aniversário da conta";
	public static final String ACCOUNT_INFO_BALANCE = "Saldo disponível R$ %.2f\n";

	public static final String MESSAGE_CREATE_NEW = "Criar conta";
	public static final String ASK_ACCOUNT_AGENCY = "Digite o número da agência: ";
	public static final String INVALID_AGENCY = "Número de agência inválido! Deve ser um valor entre 1 e 9999.";
	public static final String ASK_ACCOUNT_NUMBER = "Digite o número da conta: ";
	public static final String ASK_ACCOUNT_TYPE = "Digite o tipo da conta (1 - Corrente, 2 - Poupança)";
	public static final String ASK_ACCOUNT_OWNER = "Qual o nome do Titular? ";
	public static final String ASK_ACCOUNT_BALANCE = "Digite o saldo da Conta: ";
	public static final String ASK_ACCOUNT_LIMIT = "Digite o limite de crédito (R$): ";
	public static final String ASK_ACCOUNT_ANIVERSARY = "Digite o dia do aniversário da conta: ";

	public static final String WITHDRAWAL_SUCCESS = "Saque efetuado com sucesso. Novo saldo é de R$%.2f";
	public static final String WITHDRAWAL_FAILED = "Você não tem saldo suficiente. Tente outro valor!";
	public static final String DEPOSIT_SUCCESS = "O valor de R$%.2f foi adicionado à sua conta. Seu saldo agora é de R$%.2f";
	public static final String DEPOSIT_FAILED = "Você não pode digitar valores negativos para depósito!";

	public static final String COLOR_BLACK = "Preto";
	public static final String COLOR_DARK_BLUE = "Azul Escuro";
	public static final String COLOR_DARK_GREEN = "Verde Escuro";
	public static final String COLOR_DARK_AQUA = "Ciano Escuro";
	public static final String COLOR_DARK_RED = "Vermelho Escuro";
	public static final String COLOR_DARK_PURPLE = "Roxo Escuro";
	public static final String COLOR_GOLD = "Dourado";
	public static final String COLOR_GRAY = "Cinza";
	public static final String COLOR_DARK_GRAY = "Cinza Escuro";
	public static final String COLOR_BLUE = "Azul";
	public static final String COLOR_GREEN = "Verde";
	public static final String COLOR_AQUA = "Ciano";
	public static final String COLOR_RED = "Vermelho";
	public static final String COLOR_LIGHT_PURPLE = "Roxo Claro";
	public static final String COLOR_YELLOW = "Amarelo";
	public static final String COLOR_WHITE = "Branco";
	public static final String COLOR_BOLD = "Negrito";
	public static final String COLOR_ITALIC = "Itálico";
	public static final String COLOR_UNDERLINED = "Sublinhado";
	public static final String COLOR_RESET = "Restaurando todas a cores para o padrão de fábrica.";
	public static final String COLOR_MENU = "Parabéns! Você descobriu como alterar seu layout!";
	public static final String COLOR_OPTIONS = "Escolha uma as opções abaixo:\n"
	+ Cores.TEXT_BLACK + "0 - Preto\n"
	+ Cores.TEXT_BLUE + "1 - Azul Escuro\n"
	+ Cores.TEXT_GREEN + "2 - Verde Escuro\n"
	+ Cores.TEXT_CYAN + "3 - Ciano Escuro\n"
	+ Cores.TEXT_RED + "4 - Vermelho Escuro\n"
	+ Cores.TEXT_PURPLE + "5 - Roxo Escuro\n"
	+ Cores.TEXT_YELLOW + "6 - Dourado\n"
	+ Cores.TEXT_WHITE + "7 - Cinza\n"
	+ Cores.TEXT_BLACK_BRIGHT + "8 - Cinza Escuro\n"
	+ Cores.TEXT_BLUE_BRIGHT + "9 - Azul\n"
	+ Cores.TEXT_GREEN_BRIGHT + "a - Verde\n"
	+ Cores.TEXT_CYAN_BRIGHT + "b - Ciano\n"
	+ Cores.TEXT_RED_BRIGHT + "c - Vermelho\n"
	+ Cores.TEXT_PURPLE_BRIGHT + "d - Roxo Claro\n"
	+ Cores.TEXT_YELLOW_BRIGHT + "e - Amarelo\n"
	+ Cores.TEXT_WHITE_BRIGHT + "f - Branco\n"
	+ Cores.TEXT_BOLD + "l - Negrito\n"
	+ Cores.TEXT_RESET + Cores.TEXT_UNDERLINED + "n - Sublinhado\n"
	+ Cores.TEXT_RESET + Cores.TEXT_ITALIC + "o - Itálico\n"
	+ Cores.TEXT_RESET + Cores.TEXT_RESET + "r - Restaurar padrão";
	public static final String COLOR_CHANGED = "Alterando cor do layout para ";
	public static final String EFFECT_CHANGED = "Adicionando efeito ";

	public static final String GOODBYE_MESSAGE = "Obrigado por usar nossos serviços! Volte sempre!";
}
