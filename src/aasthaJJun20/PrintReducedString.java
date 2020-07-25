package aasthaJJun20;

public class PrintReducedString {
	void displayReducedSTring(String input) {
		for (int index = 0; index < input.length(); index++) {
			System.out.println(input.substring(0, (input.length() - index)));
		}
	}

	public static void main(String[] args) {
		PrintReducedString printReducedString = new PrintReducedString();
		printReducedString.displayReducedSTring("Globant");
	}
}
