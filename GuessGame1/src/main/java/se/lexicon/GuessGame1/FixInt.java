package se.lexicon.GuessGame1;

import java.util.*;

public class FixInt {

	private static Scanner scan = new Scanner(System.in);
	private static Random ran = new Random();

	/**
	 * Get a random integer with range between max and min
	 * 
	 * @param max highest number (include)
	 * @param min lowest number (include)
	 * @return a random number
	 */
	public static int randomInt(int max, int min) {
		return ran.nextInt(max - min) + min;
	}

	/**
	 * Check the string is number with in range of Integer or not, until you get a
	 * valid number
	 * 
	 * @return valid number
	 */
	public static int getInt() {
		while (true) {
			try {
				int n = Integer.parseInt(scan.nextLine());
				return n;
			} catch (NumberFormatException e) {
				System.out.println("Not valid enter.(int)");
			}
		}
	}

	/**
	 * keep asking for number until you put right number from limit
	 * 
	 * @param max
	 * @param min
	 * @return valid number
	 */
	public static int getIntFromLimit(int max, int min) {
		while (true) {
			int n = getInt();
			if (n >= min && n <= max) {
				return n;
			}
			System.out.println("Not valid enter.(int " + min + "-" + max + ")");
		}
	}

	/**
	 * keep asking for number until you put right number from limit
	 * 
	 * @param max
	 * @param min
	 * @param with decide max and min are Inclusive or not
	 * @return
	 */
	public static int getIntFromLimit(int max, int min, boolean with) {
		while (true) {
			int n = getInt();
			if (n >= min && n <= max) {
				if (!with && n == min || n == max) {
				} else {
					return n;
				}
			}
			System.out.println("Not valid enter.(int not with " + min + "-" + max + ")");
		}
	}

	public static int getIntFromLimit(int max, int min, boolean wmax, boolean wmin) {
		while (true) {
			int n = getInt();
			if (n >= min && n <= max) {
				if (!wmax && n == max) {
				} else if (!wmin && n == min) {
				} else {
					return n;
				}
			}
			String ms = "Not valid enter.(int";
			if (!wmin) {
				ms += " without " + min + " -";
			} else {
				ms += " with " + min + " -";
			}

			if (!wmax) {
				ms += " without " + max + ")";
			} else {
				ms += " with " + max + ")";
			}
			System.out.println(ms);
		}

	}

	/**
	 * Print integer part of doubled number
	 * 
	 * @param n
	 * @return integer
	 */
	public static String printN(double n) {
		String s = "" + (int) n;
		if (n - (int) n > 0) {
			s = "" + n;
		}
		return s;
	}

	/**
	 * Add 0 before the number if it is too short
	 * 
	 * @param n
	 * @param max
	 * @return
	 */
	public static String addZero(int n, int max) {
		String s = "";

		for (int b = n; (max / 10) > 0; max /= 10) {
			b /= 10;
			if (b == 0) {
				s += "0";
			}
		}
		return s + n;
	}

	/**
	 * Add space after the number if it is too short
	 * 
	 * @param n
	 * @param max
	 * @return
	 */
	public static String addSpace(int n, int max) {
		String s = "";

		for (int b = n; (max / 10) > 0; max /= 10) {
			b /= 10;
			if (b == 0) {
				s += " ";
			}
		}
		return n + s;
	}

	/**
	 * Add space after the number if it is too short
	 * 
	 * @param n
	 * @param di :amount of length that you want
	 * @return String n+space
	 */
	public static String addSpaceL(int n, int di) {
		String s = "" + n;
		for (int i = s.length(); i < di; i++) {
			s += " ";
		}
		return s;
	}

	public static String changeToNumberSystem(int n, int toN) {
		String re = "";
		int p = toN;
		int[] toNA = { 1 };
		while (n / p > 0) {
			toNA = FixArr.addToArr(toNA, p);
			p *= toN;
		}

		for (int i = 0; i < toNA.length; i++) {
			int n1 = n;
			for (int j = 0; j < i; j++) {
				n1 %= toNA[toNA.length - j - 1];
			}
			switch (n1 / toNA[toNA.length - i - 1]) {
			case 10:
				re += "a";
				break;
			case 11:
				re += "b";
				break;
			case 12:
				re += "c";
				break;
			case 13:
				re += "d";
				break;
			case 14:
				re += "e";
				break;
			case 15:
				re += "f";
				break;
			case 16:
				re += "g";
				break;
			case 17:
				re += "h";
				break;
			case 18:
				re += "i";
				break;
			case 19:
				re += "j";
				break;
			case 20:
				re += "k";
				break;
			case 21:
				re += "l";
				break;
			case 22:
				re += "m";
				break;
			case 23:
				re += "n";
				break;
			case 24:
				re += "o";
				break;
			case 25:
				re += "p";
				break;
			case 26:
				re += "q";
				break;
			case 27:
				re += "r";
				break;
			case 28:
				re += "s";
				break;
			case 29:
				re += "t";
				break;
			case 31:
				re += "u";
				break;
			case 32:
				re += "v";
				break;
			case 33:
				re += "w";
				break;
			case 34:
				re += "x";
				break;
			case 35:
				re += "y";
				break;
			case 36:
				re += "z";
				break;
			default:
				re += n1 / toNA[toNA.length - i - 1];
			}
		}
		return re.toUpperCase();
	}

}
