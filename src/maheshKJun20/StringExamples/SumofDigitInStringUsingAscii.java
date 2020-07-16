package maheshKJun20.StringExamples;

public class SumofDigitInStringUsingAscii {
	
	//Method to calculate sum of all digits in a String using Ascii value
	void displaySumOfDigits(String str) {
		int sum = 0;
		for (int index=0;index<str.length();index++) {
			int asciiValue = str.charAt(index);
			if (asciiValue >= 48  && asciiValue <= 57)
				sum += Character.getNumericValue(str.charAt(index));
		}
		System.out.println("Sum of all digits in a String is: " + sum);
	}
	
	
	public static void main(String[] args) {
		SumofDigitInStringUsingAscii sumofDigitInStringUsingAscii = new SumofDigitInStringUsingAscii();
		sumofDigitInStringUsingAscii.displaySumOfDigits("J7u9y8h1h8j4b7j3j6");
	}

}
