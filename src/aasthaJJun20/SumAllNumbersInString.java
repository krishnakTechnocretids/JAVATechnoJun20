package aasthaJJun20;
/*Assignment 26 : 9th July 2020
WAP to sum all the numbers in given string.

Input: P71Rr29T2E
Output: Sum of all numbers in String is: 102

Input: P6Rr29T2E3
Output: Sum of all numbers in String is: 40*/

public class SumAllNumbersInString {

	void findSumOfAllNumbers(String input) {
		int sum = 0;
		String temp = "";
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				temp += String.valueOf(input.charAt(index));
			} 
			else {
				if (!temp.equals("")) {
					sum += Integer.parseInt(temp);
					temp = "";
				}
			}
		}
		sum = (!temp.equals("")) ? (sum + Integer.parseInt(temp)) : sum;
		System.out.println("Sum of all the numbers in the given String " + input + " = " + sum);
	}

	public static void main(String[] args) {
		SumAllNumbersInString sumAllNumbersInString = new SumAllNumbersInString();
		sumAllNumbersInString.findSumOfAllNumbers("P71Rr29T2E");
		sumAllNumbersInString.findSumOfAllNumbers("P6Rr29T2E3");
		sumAllNumbersInString.findSumOfAllNumbers("1234A567b89C0DEf1");
		sumAllNumbersInString.findSumOfAllNumbers("45vw$10xy@z55");
	}
}
