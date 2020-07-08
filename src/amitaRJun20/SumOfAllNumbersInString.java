/*Assignment 25 : 8th July 2020

WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all numbers in String is: 54*/
package amitaRJun20;

public class SumOfAllNumbersInString {
	
	int sum = 0;
	
	//method to display sum of all numbers in input String
	int displaySum(String input) {
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				//sum += Integer.parseInt(String.valueOf(input.charAt(index)));
				//another method 
				sum += Character.getNumericValue(input.charAt(index));
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("The input string is "+"J7yu9y8h1h8j4b7j3jjb6");
		System.out.println("Sum of all numbers in String is : "+new SumOfAllNumbersInString().displaySum("J7yu9y8h1h8j4b7j3jjb6"));
	}
}