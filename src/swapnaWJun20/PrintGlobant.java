package swapnaWJun20;

public class PrintGlobant {

	void printString() {
		String input = "Globant";
		for (int index = 0; index < input.length(); index++) {
			System.out.println(input.substring(0, input.length() - index));
		}
	}

	public static void main(String[] args) {
		new PrintGlobant().printString();
	}
}
