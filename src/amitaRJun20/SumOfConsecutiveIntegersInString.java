/*Assignment 26 : 9th July 2020
WAP to sum all the numbers in given string.

Input: P71Rr29T2E
Ouput: Sum of all numbers in String is: 102

Input: P6Rr29T2E3
Ouput: Sum of all numbers in String is: 40*/
package amitaRJun20;

public class SumOfConsecutiveIntegersInString {
	
	//method to find sum of all integers in a String
	int findSumOfIntegers(String input) {
		System.out.println("\nThe given String is " + input);
		int sum = 0;
		String temp = "";
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				temp += (input.charAt(index));
			} else {
				if (temp.length() != 0) {
					sum += Integer.parseInt(temp);
					temp = "";
				}
			}
		}
		if (temp.length() != 0) { //when last digit is a number then check length of temp 
			sum += Integer.parseInt(temp);
		}
		return sum;
	}

	public static void main(String[] args) {
		String[] input = { "P71Rr29T2E", "P6Rr29T2E3", "AERTYHG", "456kl45", "", "000000", "@$#57%67" };
		for (int index = 0; index < input.length; index++) {
			System.out.println("The sum of integers in String is "
					+ new SumOfConsecutiveIntegersInString().findSumOfIntegers(input[index]));
		}
	}
}