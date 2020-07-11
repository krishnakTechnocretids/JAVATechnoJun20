/*
 * Assignment 26 : 9th July 2020
WAP to sum all the numbers in given string.

Input: P71Rr29T2E
Ouput: Sum of all numbers in String is: 102

Input: P6Rr29T2E3
Ouput: Sum of all numbers in String is: 40
 */
package pranitaPJun20;

public class SumOfNumbersGroupwiseString {
	void findSumOfDigitsGroup(String input) {
		int sum = 0;
		String temp = "";
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				String ch1 = String.valueOf(input.charAt(index));
				temp = temp + ch1;
			} else {
				if (temp.length() != 0) {
					int num = Integer.parseInt(temp);
					sum = sum + num;
					temp = "";
				}
			}
		}
		if (temp.length() != 0) {
			int stringToInt = Integer.parseInt(temp);
			sum = sum + stringToInt;
		}
		System.out.println("\nGroup-wise sum of all digits in string " + input + " is : " + sum);
	}

	public static void main(String[] args) {
		SumOfNumbersGroupwiseString sumOfNumbersGroupwiseString = new SumOfNumbersGroupwiseString();
		sumOfNumbersGroupwiseString.findSumOfDigitsGroup("P71Rr29T2E");
		sumOfNumbersGroupwiseString.findSumOfDigitsGroup("P6Rr29T2E3");
	}
}
