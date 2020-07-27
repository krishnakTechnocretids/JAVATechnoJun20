package aasthaJJun20;

public class PrintReducedReversedString {
	void displayReverseReducedSTring(String input) {
		for (int index = 0; index < input.length(); index++) {
			String temp = input.substring(index, input.length());
			temp = String.valueOf(temp.charAt(0)).toUpperCase() + temp.substring(1);
			System.out.println(temp);
		}
	}

	public static void main(String[] args) {
		PrintReducedReversedString printReducedReversedString = new PrintReducedReversedString();
		printReducedReversedString.displayReverseReducedSTring("Globant");
	}
}