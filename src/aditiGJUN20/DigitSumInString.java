/*
 * Assignment 25 : 8th July 2020
 * WAP to sum all the numbers in given string.
 * Input: J7yu9y8h1h8j4b7j3jjb6
 * Output: Sum of all numbers in String is: 53
 */

package aditiGJUN20;

public class DigitSumInString {
	int getSumOfAllDigits(String string) {
		int sum=0;
		for(int index=0;index<string.length();index++) {
 			if(Character.isDigit(string.charAt(index)))
 				sum=sum+Integer.parseInt(String.valueOf(string.charAt(index)));
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Sum of all numbers in input string is: "+new DigitSumInString().getSumOfAllDigits("J7yu9y8h1h8j4b7j3jjb6"));
	}
}