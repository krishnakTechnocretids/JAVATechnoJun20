package deavinaSJun20;

public class TestIntSuminString {

	public static void main(String[] args) {
		String input = "J7yu9y8h1h8j4b7j3jjb6";
		new TestIntSuminString().calculateSumOfDigitsInString(input);
	}

	void calculateSumOfDigitsInString(String input) {
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			if (Character.isDigit(input.charAt(i))) {
				String ch = String.valueOf(input.charAt(i));
				sum = sum + Integer.parseInt(ch);
			}
		}
		System.out.println("Sum of all digits: " + sum);
	}
}
