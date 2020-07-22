package maheshKJun20.StringExamples;

public class SumOfDigitsInStringUsingException {
	
	void displaySumOfDigits(String str) {
		System.out.println("Input: " + str );
		String[] tempArray = str.split("");
		String temp ="0";
		double sum = 0;
		for(int index=0;index<tempArray.length;index++) {
			try {
				if (tempArray[index].equals("."))
					temp += tempArray[index];
				else
					temp += "" + Integer.parseInt(tempArray[index]);
			}catch(NumberFormatException ne) {
				sum += Double.parseDouble(temp);
				temp = "0";
			}
		}
		if(!temp.equals("0"))
			sum += Double.parseDouble(temp);
		System.out.println("Output: Sum of Digits in statement is: " + sum);
	}
	
	public static void main(String[] args) {
		SumOfDigitsInStringUsingException sumOfDigitsInStringUsingException = new SumOfDigitsInStringUsingException();
		sumOfDigitsInStringUsingException.displaySumOfDigits("I have 5 Years 6 month of experience.");
		sumOfDigitsInStringUsingException.displaySumOfDigits("I have 5 Years experience");
		sumOfDigitsInStringUsingException.displaySumOfDigits("I have 5.6 Years experience");
		sumOfDigitsInStringUsingException.displaySumOfDigits("I have 2.3 Years experience in manual & 1.2 years in automation");
		sumOfDigitsInStringUsingException.displaySumOfDigits("2.3 Years total experience and this is my 23rd org");
	}
}
