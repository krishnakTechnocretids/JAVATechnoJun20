package maheshKJun20.StringExamples;

public class SumOfDigitsInStringUsingException {
	
	void displaySumOfDigits(String str) {
		System.out.println("Input: " + str );
		String[] tempArray = str.split(" ");
		int sum = 0;
		for(int index=0;index<tempArray.length;index++) {
			try {
				sum += Integer.parseInt(tempArray[index]);
			}catch(NumberFormatException ne) {
				//ne.printStackTrace();
			}
		}
		System.out.println("Output: Sum of Digits in statement is: " + sum);
	}
	public static void main(String[] args) {
		SumOfDigitsInStringUsingException sumOfDigitsInStringUsingException = new SumOfDigitsInStringUsingException();
		sumOfDigitsInStringUsingException.displaySumOfDigits("I have 5 Years 6 month of experience.");
	}
}
