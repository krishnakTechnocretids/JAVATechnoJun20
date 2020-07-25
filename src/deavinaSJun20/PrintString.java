package deavinaSJun20;

public class PrintString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Globant";
		new PrintString().printString(input);
	}

	void printString(String input) {

		for (int index = 0; index < input.length(); index++) {
			String input1 = input.substring(0, input.length() - index);
			System.out.println(input1);

		}
	}
}
