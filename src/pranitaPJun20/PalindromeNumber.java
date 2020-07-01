/* * Assignment 22 : 1st Jul 2020
Program 1: 
Verify given number is palindrome or not. 
Input: number = 45654
Output : Given number 45654 is palindrome.

Input: number = 56789
Output : Given number 56789 is not palindrome.
 */
package pranitaPJun20;

public class PalindromeNumber {
	static void findPalindromeNumber(int number) {
		int inputNum = number;
		int reverseNum = 0;
		while (number > 0) {
			reverseNum = (reverseNum * 10) + (number % 10);
			number = number / 10;
		}
		if (reverseNum == inputNum) {
			System.out.println("\nGiven number " + inputNum + " is Palindrom.");
		} else
			System.out.println("\nGiven number " + inputNum + " is not Palindrom.");
	}

	public static void main(String[] args) {
		PalindromeNumber.findPalindromeNumber(45654);
		PalindromeNumber.findPalindromeNumber(56789);

	}
}
