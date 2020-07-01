/*Program 2:
Verify given String is palindrome or not. 
Input: radar
Output : Given string radar is palindrome.

Input: technocredits
Output: Given string technocredits is not palindrome. */

package jagadeeshMJun20;

import java.util.Scanner;

public class PalindromeString {

	String getOutput(String input) {
		String output = "";
		for (int index = (input.length() - 1); index >= 0; index--) {
			output = output + input.charAt(index);
		}
		return output;

	}

	public static void main(String[] agrs) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any string");
		String input = scanner.next();

		PalindromeString palindromeString = new PalindromeString();
		if (input.equalsIgnoreCase(palindromeString.getOutput(input)))
			System.out.println("Given String " + input + " is Palindrome");
		else
			System.out.println("Given String " + input + " is Not Palindrome");
		scanner.close();
	}
}
