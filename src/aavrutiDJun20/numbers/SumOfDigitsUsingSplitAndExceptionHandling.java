package aavrutiDJun20.numbers;

public class SumOfDigitsUsingSplitAndExceptionHandling {
	
	void sumOfDigits(String[] arrayInput) {
		int sum = 0, count = 0;
		while(count<arrayInput.length) {
			try {
				sum += Integer.parseInt(arrayInput[count]);
			}
			catch(NumberFormatException ne) {
				System.out.println(ne);
			}
			finally {
				count++;
			}
		}
		System.out.println("Output --> " + sum);
	}

	public static void main(String[] args) {
		String input = "I have 5 Years 6 month of experience.";
		String[] arrayInput = input.split(" ");
		System.out.println("Input --> " + input);
		new SumOfDigitsUsingSplitAndExceptionHandling().sumOfDigits(arrayInput);
	}
}
