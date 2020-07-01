package anupSJun20;
/* Program 2:
Verify given String is palindrome or not. 
Input: radar
Output : Given string radar is palindrome.

Input: technocredits
Output: Given string technocredits is not palindrome.*/

public class PalindromeString {
	static void findPalindromeString(String str) {
		String revstr = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			revstr = revstr + String.valueOf(str.charAt(index));
		}
		if (str.equals(revstr))
			System.out.println("The given string " + str + " is a palindrome string");
		else
			System.out.println("The given string " + str + " is not a palindrome string");
	}

	public static void main(String[] args) {
		findPalindromeString("radar");
		findPalindromeString("technocredits");
	}
}