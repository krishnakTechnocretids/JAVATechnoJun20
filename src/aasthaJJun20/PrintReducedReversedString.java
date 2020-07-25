package aasthaJJun20;

public class PrintReducedReversedString {
	void displayReverseReducedSTring(String input) {
		for (int index = 0; index < input.length(); index++) {
			System.out.println(input.substring(index,input.length()));
		}
	}

	public static void main(String[] args) {
		PrintReducedReversedString printReducedReversedString = new PrintReducedReversedString();
		printReducedReversedString.displayReverseReducedSTring("Globant");
	}
}
