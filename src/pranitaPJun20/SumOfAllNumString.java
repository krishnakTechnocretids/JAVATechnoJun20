/*
 * Assignment 25 : 8th July 2020

WAP to sum all the numbers in a given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all numbers in String is: 54
 */
package pranitaPJun20;

public class SumOfAllNumString {
	void findSumAllNum(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				String charToString = String.valueOf(ch);
				int stringToInt = Integer.parseInt(charToString);
				sum = sum + stringToInt;
			}
		}
		System.out.println("Sum of all the numbers in given string: " + sum);
	}

	public static void main(String[] args) {
		SumOfAllNumString SumOfAllNumString = new SumOfAllNumString();
		SumOfAllNumString.findSumAllNum("J7yu9y8h1h8j4b7j3jjb6");
	}
}
