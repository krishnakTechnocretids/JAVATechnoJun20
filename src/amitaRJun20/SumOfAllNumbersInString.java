/*Assignment 25 : 8th July 2020

WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all numbers in String is: 54*/
package amitaRJun20;

import java.util.Arrays;

public class SumOfAllNumbersInString {
	
	int sum = 0;
	
	//method to display sum of all numbers in input String
	void displaySum(String input) {
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				int number = Integer.parseInt(String.valueOf(input.charAt(index)));
				sum += number;
			}
		}
		System.out.println("Sum of all numbers in String is : "+sum);
	}

	public static void main(String[] args) {
		String input = "J7yu9y8h1h8j4b7j3jjb6";
		System.out.println("The input string is "+input);
		new SumOfAllNumbersInString().displaySum(input);
	}
}