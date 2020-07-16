package aavrutiDJun20.numbers;

public class SumOfDigitUsingASCII {
	
	void findSumOfDigit(String input) {
		int sum = 0;
		for(int index=0;index<input.length();index++) {
			int numAscii = input.charAt(index);
			if(numAscii>=48 && numAscii<=57)
				sum += Character.getNumericValue(numAscii);
		}
		System.out.println("Sum of Digit in given input " + input + " is: " + sum);
	}

	public static void main(String[] args) {
		SumOfDigitUsingASCII sumOfDigitUsingASCII = new SumOfDigitUsingASCII();
		sumOfDigitUsingASCII.findSumOfDigit("J7u9y8h1h8j4b7j3j6");
	}
}