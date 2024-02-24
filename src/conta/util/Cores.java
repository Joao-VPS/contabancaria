package conta.util;

public class Cores {
	// Reset color
	public static final String TEXT_RESET = "\u001B[0m";

	// Text color
	public static final String TEXT_BLACK = "\u001B[30m";
	public static final String TEXT_RED = "\u001B[31m";
	public static final String TEXT_GREEN = "\u001B[32m";
	public static final String TEXT_YELLOW = "\u001B[33m";
	public static final String TEXT_BLUE = "\u001B[34m";
	public static final String TEXT_PURPLE = "\u001B[35m";
	public static final String TEXT_CYAN = "\u001B[36m";
	public static final String TEXT_WHITE = "\u001B[37m";

	// Text bold
	public static final String TEXT_BOLD = "\u001B[1m";

	// Text underlined
	public static final String TEXT_UNDERLINED = "\u001B[4m";

	// Text italic
	public static final String TEXT_ITALIC = "\u001B[3m";

	// Text color high intensity
	public static final String TEXT_BLACK_BRIGHT = "\u001B[90m";
	public static final String TEXT_RED_BRIGHT = "\u001B[91m";
	public static final String TEXT_GREEN_BRIGHT = "\u001B[92m";
	public static final String TEXT_YELLOW_BRIGHT = "\u001B[93m";
	public static final String TEXT_BLUE_BRIGHT = "\u001B[94m";
	public static final String TEXT_PURPLE_BRIGHT = "\u001B[95m";
	public static final String TEXT_CYAN_BRIGHT = "\u001B[96m";
	public static final String TEXT_WHITE_BRIGHT = "\u001B[97m";

	// Background color
	public static final String BACKGROUND_BLACK = "\u001B[40m";
	public static final String BACKGROUND_RED = "\u001B[41m";
	public static final String BACKGROUND_GREEN = "\u001B[42m";
	public static final String BACKGROUND_YELLOW = "\u001B[43m";
	public static final String BACKGROUND_BLUE = "\u001B[44m";
	public static final String BACKGROUND_PURPLE = "\u001B[45m";
	public static final String BACKGROUND_CYAN = "\u001B[46m";
	public static final String BACKGROUND_WHITE = "\u001B[47m";

	// Background color high intensity
	public static final String BACKGROUND_BLACK_BRIGHT = "\u001B[0;100m";
	public static final String BACKGROUND_RED_BRIGHT = "\u001B[0;101m";
	public static final String BACKGROUND_GREEN_BRIGHT = "\u001B[0;102m";
	public static final String BACKGROUND_YELLOW_BRIGHT = "\u001B[0;103m";
	public static final String BACKGROUND_BLUE_BRIGHT = "\u001B[0;104m";
	public static final String BACKGROUND_PURPLE_BRIGHT = "\u001B[0;105m";
	public static final String BACKGROUND_CYAN_BRIGHT = "\u001B[0;106m";
	public static final String BACKGROUND_WHITE_BRIGHT = "\u001B[0;107m";

	// Altera o tema do aplicativo
	private static String color = TEXT_RESET + TEXT_WHITE;

	public static boolean setColorTheme(String value) {
		switch (value) {
		case "0":
			color = Cores.TEXT_BLACK;
			System.out.println(color + Strings.COLOR_CHANGED + Strings.COLOR_BLACK);
			return true;
		case "1":
			color = Cores.TEXT_BLUE;
			System.out.println(color + Strings.COLOR_CHANGED + Strings.COLOR_DARK_BLUE);
			return true;
		case "2":
			color = Cores.TEXT_GREEN;
			System.out.println(color + Strings.COLOR_CHANGED + Strings.COLOR_DARK_GREEN);
			return true;
		case "3":
			color = Cores.TEXT_CYAN;
			System.out.println(color + Strings.COLOR_CHANGED + Strings.COLOR_DARK_AQUA);
			return true;
		case "4":
			color = Cores.TEXT_RED;
			System.out.println(color + Strings.COLOR_CHANGED + Strings.COLOR_DARK_RED);
			return true;
		case "5":
			color = Cores.TEXT_PURPLE;
			System.out.println(color + Strings.COLOR_CHANGED + Strings.COLOR_DARK_PURPLE);
			return true;
		case "6":
			color = Cores.TEXT_YELLOW;
			System.out.println(color + Strings.COLOR_CHANGED + Strings.COLOR_GOLD);
			return true;
		case "7":
			color = Cores.TEXT_WHITE;
			System.out.println(color + Strings.COLOR_CHANGED + Strings.COLOR_GRAY);
			return true;
		case "8":
			color = Cores.TEXT_BLACK_BRIGHT;
			System.out.println(color + Strings.COLOR_CHANGED + Strings.COLOR_DARK_GRAY);
			return true;
		case "9":
			color = Cores.TEXT_BLUE_BRIGHT;
			System.out.println(color + Strings.COLOR_CHANGED + Strings.COLOR_BLUE);
			return true;
		case "a":
			color = Cores.TEXT_GREEN_BRIGHT;
			System.out.println(color + Strings.COLOR_CHANGED + Strings.COLOR_GREEN);
			return true;
		case "b":
			color = Cores.TEXT_CYAN_BRIGHT;
			System.out.println(color + Strings.COLOR_CHANGED + Strings.COLOR_AQUA);
			return true;
		case "c":
			color = Cores.TEXT_RED_BRIGHT;
			System.out.println(color + Strings.COLOR_CHANGED + Strings.COLOR_RED);
			return true;
		case "d":
			color = Cores.TEXT_PURPLE_BRIGHT;
			System.out.println(color + Strings.COLOR_CHANGED + Strings.COLOR_LIGHT_PURPLE);
			return true;
		case "e":
			color = Cores.TEXT_YELLOW_BRIGHT;
			System.out.println(color + Strings.COLOR_CHANGED + Strings.COLOR_YELLOW);
			return true;
		case "f":
			color = Cores.TEXT_WHITE_BRIGHT;
			System.out.println(color + Strings.COLOR_CHANGED + Strings.COLOR_WHITE);
			return true;
		case "l":
			color = Cores.TEXT_BOLD;
			System.out.println(color + Strings.EFFECT_CHANGED + Strings.COLOR_BOLD);
			return true;
		case "n":
			color = Cores.TEXT_UNDERLINED;
			System.out.println(color + Strings.EFFECT_CHANGED + Strings.COLOR_UNDERLINED);
			return true;
		case "o":
			color = Cores.TEXT_ITALIC;
			System.out.println(color + Strings.EFFECT_CHANGED + Strings.COLOR_ITALIC);
		case "r":
			color = Cores.TEXT_RESET;
			System.out.println(color + Strings.COLOR_RESET);
			return true;
		default:
			return false;
		}
	}

	public static String getColorTheme() {
		return color;
	}
}
