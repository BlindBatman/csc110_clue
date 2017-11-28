
package neumont.csc110.finalgame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleUI {

	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	 static int promptForMenuSelection(String[] options, boolean withQuit) throws IOException {
		int arrayLen = options.length;
		int min = 1;
		for (int i = 0; i < arrayLen; i++) {

			System.out.println((i + 1 )+ ": "  + options[i]);
		}
		if (withQuit) {
			System.out.println("0: quit");
			min = 0;
		}

		int input1 = promptForInt("choose a number", min, arrayLen);

		return input1;

	}

	static boolean promptForBool(String prompt, String trueString, String falseString) throws IOException {
		if (prompt == null || prompt.isEmpty()) {
			throw new IllegalArgumentException("prompt cannot be null or empty");
		}
		String input = "";
		boolean a = false;
		do {
			System.out.println(prompt);
			input = in.readLine();
			input = input.toLowerCase();
			if (input.equals(trueString)) {
				a = true;

			} else if (input.equals(falseString)) {
				a = false;

			}

		} while (!input.equals(trueString) || input.equals(falseString));
		return a;
	}

	static byte promptForByte(String prompt, byte min, byte max) throws IOException {
		if (prompt == null || prompt.length() == 0) {
			throw new IllegalArgumentException("prompt cannot be null or empty");
		}
		byte returnValue = 0;
		boolean isValidInput = false;
		while (!isValidInput) {
			System.out.println(prompt);
			String rawInput = in.readLine();
			try {
				returnValue = Byte.parseByte(rawInput);
				if (returnValue >= min && returnValue <= max) {
					isValidInput = true;
				}
			} catch (NumberFormatException ex) {
				System.out.println("give valid integer");
			}
		}
		return returnValue;
	}

	static short promptForShort(String prompt, short min, short max) throws IOException {
		if (prompt == null || prompt.length() == 0) {
			throw new IllegalArgumentException("prompt cannot be null or empty");
		}
		short returnValue = 0;
		boolean isValidInput = false;
		while (!isValidInput) {
			System.out.println(prompt);
			String rawInput = in.readLine();
			try {
				returnValue = Short.parseShort(rawInput);
				if (returnValue >= min && returnValue <= max) {
					isValidInput = true;
				}
			} catch (NumberFormatException ex) {
				System.out.println("give valid integer");
			}
		}
		return returnValue;
	}

	static int promptForInt(String prompt, int min, int max) throws IOException {
		if (prompt == null || prompt.length() == 0) {
			throw new IllegalArgumentException("prompt cannot be null or empty");
		}
		int returnValue = 0;
		boolean isValidInput = false;
		while (!isValidInput) {
			System.out.println(prompt);
			String rawInput = "";

			rawInput = in.readLine();

			try {
				returnValue = Integer.parseInt(rawInput);
				if (returnValue >= min && returnValue <= max) {
					isValidInput = true;
				}
			} catch (Exception ex) {
				System.out.println("give valid integer");
			}

		}
		return returnValue;
	}

	static long promptForLong(String prompt, long min, long max) throws IOException {
		if (prompt == null || prompt.length() == 0) {
			throw new IllegalArgumentException("prompt cannot be null or empty");
		}
		long returnValue = 0;
		boolean isValidInput = false;
		while (!isValidInput) {
			System.out.println(prompt);
			String rawInput = in.readLine();
			try {
				returnValue = Long.parseLong(rawInput);
				if (returnValue >= min && returnValue <= max) {
					isValidInput = true;
				}
			} catch (NumberFormatException ex) {
				System.out.println("give valid integer");
			}
		}
		return returnValue;
	}

	static float promptForFloat(String prompt, float min, float max) throws IOException {
		if (prompt == null || prompt.length() == 0) {
			throw new IllegalArgumentException("prompt cannot be null or empty");
		}
		float returnValue = 0;
		boolean isValidInput = false;
		while (!isValidInput) {
			System.out.println(prompt);
			String rawInput = in.readLine();
			try {
				returnValue = Float.parseFloat(rawInput);
				if (returnValue >= min && returnValue <= max) {
					isValidInput = true;
				}
			} catch (NumberFormatException ex) {
				System.out.println("give valid integer");
			}
		}
		return returnValue;
	}

	static double promptForDouble(String prompt, double min, double max) throws IOException {
		if (prompt == null || prompt.length() == 0) {
			throw new IllegalArgumentException("prompt cannot be null or empty");
		}
		double returnValue = 0;
		boolean isValidInput = false;
		while (!isValidInput) {
			System.out.println(prompt);
			String rawInput = in.readLine();
			try {
				returnValue = Double.parseDouble(rawInput);
				if (returnValue >= min && returnValue <= max) {
					isValidInput = true;
				}
			} catch (NumberFormatException ex) {
				System.out.println("give valid integer");
			}
		}
		return returnValue;
	}

	static String promptForInput(String prompt, boolean allowEmpty) throws IOException {
		if (prompt == null || prompt.isEmpty()) {
			throw new IllegalArgumentException("prompt cannot be null or empty");
		}
		String input = "";
		do {
			System.out.println(prompt);
			input = in.readLine();

		} while (allowEmpty = true && input.length() < 1);
		return prompt;
	} 

	static char promptForChar(String prompt, char min, char max) throws IOException {
		String a;
		if (prompt == null || prompt.length() == 0) {
			throw new IllegalArgumentException("prompt cannot be null or empty");
		}

		do {
			System.out.println(prompt);
			a = in.readLine();
		} while ((a.length() != 1 || a.charAt(0) < min || a.charAt(0) > max));

		char returnValue = a.charAt(0);
		return returnValue;
	}
}