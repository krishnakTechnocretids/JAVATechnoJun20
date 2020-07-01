/*Assignment 22 : 1st Jul 2020
 * Program 2:
Verify given String is palindrome or not. 
Input: radar
Output : Given string radar is palindrome.

Input: technocredits
Output: Given string technocredits is not palindrome.
 */
package pranitaPJun20;

public class PalindromString {
	static void checkPalindrome(String input) {
		String reverse = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			reverse = reverse + input.charAt(index);
		}
		if (reverse.equals(input))
			System.out.println("Given string " + input + " is palindrome");
		else
			System.out.println("Given string " + input + " is not palindrome");
	}

	public static void main(String[] args) {
		PalindromString.checkPalindrome("radar");
		PalindromString.checkPalindrome("technocredits");
	}

}
