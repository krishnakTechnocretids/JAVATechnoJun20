package maheshKJun20.StringExamples;

public class SumOfDigitsInString {
	
	void displaySumOfDigits(String str) {
		int sum = 0;
		for (int index=0;index<str.length();index++) {
			if (Character.isDigit(str.charAt(index))){
				sum += Integer.parseInt(String.valueOf(str.charAt(index)));
			}
		}
		System.out.println("Sum of digits in String '" + str + "' is: " + sum);
	}
	
	public static void main(String[] args) {
		SumOfDigitsInString sumOfDigitsInString = new SumOfDigitsInString();
		sumOfDigitsInString.displaySumOfDigits("J7yu9y8h1h8j4b7j3jjb6");
	}

}
