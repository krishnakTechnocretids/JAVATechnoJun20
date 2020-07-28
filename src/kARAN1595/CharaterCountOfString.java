package kARAN1595;

public class CharaterCountOfString {
	void countChars(String input) {
		int countDigit = 0, countUpperCase = 0, countLowerCase = 0, countSpecialChar = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index)))
				countDigit++;
			else if (Character.isUpperCase(input.charAt(index)))
				countUpperCase++;
			else if (Character.isLowerCase(input.charAt(index)))
				countLowerCase++;
			else
				countSpecialChar++;
		}
		System.out.println("Total digit: " + countDigit);
		System.out.println("Total Letters: " + (countUpperCase + countLowerCase));
		System.out.println("Total Uppercase: " + countUpperCase);
		System.out.println("Total Lowercase: " + countLowerCase);
		System.out.println("Total Special char: " + countSpecialChar);
	}

	public static void main(String[] args) {
		CharaterCountOfString charaterCountOfString = new CharaterCountOfString();
		charaterCountOfString.countChars("1rRpd3F9#K(E");
	}
}