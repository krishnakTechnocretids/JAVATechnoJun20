package maheshKJun20.StringExamples;

public class SumOfDigitsInStringUsingException {
	
	void displaySumOfDigits(String str) {
		System.out.println("Input: " + str );
		String[] tempArray = str.split("");
		String temp ="0";
		int sum = 0;
		for(int index=0;index<tempArray.length;index++) {
			try {
				temp += "" + Integer.parseInt(tempArray[index]);
			}catch(NumberFormatException ne) {
				sum += Integer.parseInt(temp);
				temp = "0";
			}
		}
		if(!temp.equals("0"))
			sum += Integer.parseInt(temp);
		System.out.println("Output: Sum of Digits in statement is: " + sum);
	}
	public static void main(String[] args) {
		SumOfDigitsInStringUsingException sumOfDigitsInStringUsingException = new SumOfDigitsInStringUsingException();
		sumOfDigitsInStringUsingException.displaySumOfDigits("I have 5 Years 6 month of experience.");
		sumOfDigitsInStringUsingException.displaySumOfDigits("I have 5 Years 6 month of experience. This is my 5th Company");
	}
}
