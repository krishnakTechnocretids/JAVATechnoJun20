package harshadBJun20.assignment25;

/*Assignment 25 : 8th July 2020

WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all numbers in String is: 53*/

public class SumOfNumbersInString {
	
	void calSumOfNumbers(String str) {
		int sumOfDigit=0;
		for(int index=0;index<str.length();index++) {
			if(Character.isDigit(str.charAt(index))) {
				sumOfDigit += Character.getNumericValue(str.charAt(index));
			}
		}
		System.out.println("Sum of all numbers in String is: "+sumOfDigit);
	}
	public static void main(String[] args) {
		SumOfNumbersInString sumOfNumbersInString = new SumOfNumbersInString();
		String str="J7yu9y8h1h8j4b7j3jjb6";
		sumOfNumbersInString.calSumOfNumbers(str);
	}
}
