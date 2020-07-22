package anshuKJun20;

public class SumOfNumberUsingExceptionFromString {

	void findSumOfNumber(String input) {
		String[] array = input.split(" ");
		int sum = 0;
		for (int index = 0; index < array.length; index++) {
			try {
				sum += Integer.parseInt(array[index]);
			} catch (NumberFormatException ne) {
			}
		}
		System.out.println(" Sum of given no in string is: " + sum);
	}

	public static void main(String[] args) {
		SumOfNumberUsingExceptionFromString sumOfNumberFromString = new SumOfNumberUsingExceptionFromString();
		String input = "I have 5 Years 6 month of experience";
		sumOfNumberFromString.findSumOfNumber(input);
	}
}
