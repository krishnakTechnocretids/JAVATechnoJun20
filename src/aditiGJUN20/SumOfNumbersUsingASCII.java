/*
 * WAP to sum all the numbers in given string, without using Character class method. 
 * (Note : Use Ascii value concept).
 * Input: J7u9y8h1h8j4b7j3j6
 * Ouput: Sum of all numbers in String is - 53.
 */

package aditiGJUN20;

public class SumOfNumbersUsingASCII {
	int getSumofAllDigits(String str) {
		// Condition for empty String
		if (str.isEmpty()) {
			System.out.println("Null/Empty String");
			return 0;
		}
		int digitSum = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) >= '0' && str.charAt(index) <= '9') {
				digitSum += (str.charAt(index) - '0');
			}
		}
		return digitSum;
	}

	public static void main(String[] args) {
		System.out.println("The sum of the digits in the string is: "
				+ new SumOfNumbersUsingASCII().getSumofAllDigits("J7u9y8h1h8j4b7j3j6"));
	}
}
