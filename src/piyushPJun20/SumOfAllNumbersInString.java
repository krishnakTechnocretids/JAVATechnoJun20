package piyushPJun20;
class SumOfAllNumbersInString {
	void findSumOfAllNumbers(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				sum = sum + Integer.parseInt(String.valueOf(input.charAt(index)));
			}
		}
		System.out.println(" Sum of all numbers in String is: " + sum);
	}

	public static void main(String[] args) {
		SumOfAllNumbersInString sum = new SumOfAllNumbersInString();
		sum.findSumOfAllNumbers("J7yu9y8h1h8j4b7j3jjb6");
	}
}