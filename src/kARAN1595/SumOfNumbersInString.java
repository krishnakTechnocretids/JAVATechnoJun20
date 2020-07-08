package kARAN1595;

public class SumOfNumbersInString {
	void sumOfNumber(String input) {
		int total_sum = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				total_sum += Integer.parseInt(String.valueOf(input.charAt(index)));
			}
		}
		System.out.println("Sum of all numbers in a String are : " + total_sum);
	}
	public static void main(String[] args) {
		SumOfNumbersInString sumOfNumbersInString = new SumOfNumbersInString();
		String input = "J7yu9y8h1h8j4b7j3jjb6";
		sumOfNumbersInString.sumOfNumber(input);
	}
}
