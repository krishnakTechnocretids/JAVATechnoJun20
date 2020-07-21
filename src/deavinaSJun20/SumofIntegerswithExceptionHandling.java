package deavinaSJun20;

public class SumofIntegerswithExceptionHandling {

	void sumofIntegerswithExceptionhandling(String input) {
		int sum = 0;
		String[] array = input.split(" ");
		for (int index = 0; index < array.length; index++) {
			try {
				sum += Integer.parseInt(array[index]);

			} catch (NumberFormatException ne) {

			}
		}
		System.out.println("Sum of integers in given string is " + sum);
	}

	public static void main(String[] args) {
		String input = "I have 5 Years 6 month of experience.";
		System.out.println("Given String is :\n" + input);
		new SumofIntegerswithExceptionHandling().sumofIntegerswithExceptionhandling(input);
	}
}
