/*
 * Assignment 28 : 16th July 2020

WAP to sum all the numbers in given string, without using Character class method. 
(Note : Use Ascii value concept) .

Input: J7u9y8h1h8j4b7j3j6
Ouput: Sum of all numbers in String is - 54.
 */
package pranitaPJun20;

public class AsciiSumOfNumString {
	AsciiSumOfNumString(String input) {
		findSumOfNumbersString(input);
	}

	void findSumOfNumbersString(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) >= 48 && input.charAt(index) <= 57) { // we can use (ch>='0' && ch<='9') or (ch>=48
																			// && ch<='9')
				sum += Integer.parseInt(String.valueOf(input.charAt(index)));
			}
		}
		System.out.println("Sum of all numbers in given string  "+input+" is: " + sum);
	}

	public static void main(String[] args) {
		new AsciiSumOfNumString("J7u9y8h1h8j4b7j3j6");
	}
}
