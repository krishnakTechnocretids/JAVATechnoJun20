package aasthaJJun20;
/*Assignment 25 : 8th July 2020

WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Output: Sum of all numbers in String is: 53*/

public class SumOfAllDigitsInString{
	void findSumOfAllDigits(String input){
		int sum = 0;
		for(int index=0; index < input.length(); index++){
			if(Character.isDigit(input.charAt(index))){
				sum += Integer.parseInt(String.valueOf(input.charAt(index)));
			}
		}
		System.out.println("Sum of all the numbers in the given String "+input+" = "+sum);
	}
	
	public static void main(String[] args){
		SumOfAllDigitsInString sumOfAllDigitsInString = new SumOfAllDigitsInString();
		sumOfAllDigitsInString.findSumOfAllDigits("J7yu9y8h1h8j4b7j3jjb6");
	}
}