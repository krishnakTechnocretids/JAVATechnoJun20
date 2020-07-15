//sum all the numbers in given string.

package aavrutiDJun20.numbers;

public class SumOfNumbersInString {
	
	int findSumOfNumbers(String input) {
		System.out.println("Input --> " + input);
		String tempDigit = "";
		int sum=0;
		for(int index=0;index<input.length();index++) {
			if(Character.isDigit(input.charAt(index))) {
				tempDigit += input.charAt(index);
			}
			else {
				if(tempDigit.length()>0) {
					sum += Integer.parseInt(tempDigit);
					tempDigit = "";
				}
			}	
		}
		if(!tempDigit.equals(""))
			sum += Integer.parseInt(tempDigit);
		return sum;
	}
	
	void displaySumOfNumbers(int sumOfNo) {
		System.out.println("Sum of all numbers in String is: " + sumOfNo + "\n");
	}
	
	public static void main(String[] args) {
		SumOfNumbersInString sumOfNumbersInString = new  SumOfNumbersInString();
		sumOfNumbersInString.displaySumOfNumbers(sumOfNumbersInString.findSumOfNumbers("P71Rr29T2E"));
		sumOfNumbersInString.displaySumOfNumbers(sumOfNumbersInString.findSumOfNumbers("P6Rr29T2E3"));
	}
}