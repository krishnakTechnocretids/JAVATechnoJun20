package deavinaSJun20;

public class TestIntSuminString {

	public static void main(String[] args) {
		String input = "J7yu9y8h1h8j4b7j3jjb6";
		new TestIntSuminString().calculateSumOfDigitsInString(input);
	}

	void calculateSumOfDigitsInString(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				sum = sum + Integer.parseInt(String.valueOf(input.charAt(index)));
			}
		}
		System.out.println("Sum of all digits: " + sum);
	}
}
