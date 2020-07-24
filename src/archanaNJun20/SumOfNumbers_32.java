package archanaNJun20;

public class SumOfNumbers_32 {
	void printSumOfDigits(String input) {
		int sum = 0;
		String[] array = input.split(" ");
		for (int index = 0; index < array.length; index++) {
			try {
				sum += Double.parseDouble(array[index]);
			} catch (NumberFormatException e) {
			}
		}
		System.out.println("output : " + sum);
	}
	public static void main(String[] args) {
		SumOfNumbers_32 sumOfNumbers = new SumOfNumbers_32();
		String input = "I have 5 Years 6 month of experience";
		sumOfNumbers.printSumOfDigits(input);
	}
}