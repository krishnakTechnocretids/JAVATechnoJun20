package piyushPJun20;
public class SumASCII {
	void sumOfNumbers(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) >= 48 && input.charAt(index) <= 57) {
				sum += input.charAt(index) - '0';
			}
		}
		System.out.println(" Sum of all numbers in String is: " + sum);
	}

	public static void main(String[] args) {
		new SumASCII().sumOfNumbers("J7u9y8h1h8j4b7j3j6");
	}
}