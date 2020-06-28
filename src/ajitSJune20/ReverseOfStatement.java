package ajitSJune20;

public class ReverseOfStatement {

	void displayReseverseOfString(String sentence) {
		for (int index = sentence.length() - 1; index >= 0; index--)
			System.out.print(sentence.charAt(index));
	}

	public static void main(String[] args) {
		ReverseOfStatement reverseOfStatement = new ReverseOfStatement();

		String sentence = "Hello this is technocredits";
		reverseOfStatement.displayReseverseOfString(sentence);
	}
}
