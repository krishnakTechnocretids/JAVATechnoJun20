/*Assignment 28 : 16th July 2020

WAP to sum all the numbers in given string, without using Character class method. 
(Note : Use Ascii value concept) .

Input: J7u9y8h1h8j4b7j3j6
Ouput: Sum of all numbers in String is - 54.*/
package rachanaGJun20;

public class SumOfNumbersUsingAscii {

	void sumOfAllNumbers(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			if ((str.charAt(index) >= '0' && str.charAt(index) <= '9')) {
				sum = sum + Integer.parseInt(String.valueOf(str.charAt(index)));
			}
		}
		System.out.println("Sum of all numbers in a given string is : "+sum);
	}

	public static void main(String[] args) {
		SumOfNumbersUsingAscii sumofnumbers = new SumOfNumbersUsingAscii();
		System.out.println("Input: J7u9y8h1h8j4b7j3j6");
		sumofnumbers.sumOfAllNumbers("J7u9y8h1h8j4b7j3j6");
	}
}
