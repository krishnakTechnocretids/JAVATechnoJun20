/*
Program 2:
Verify given String is palindrome or not. 
Input: radar
Output : Given string radar is palindrome.

Input: technocredits
Output: Given string technocredits is not palindrome.
*/

package vireshJJun20.Assignment22;

import java.util.Scanner;

public class PalindromeString {

	void findPalindromeStr(String inString) { // abcd
		String outString = "";
		for (int index = inString.length() - 1; index >= 0; index--) {
			outString = outString + inString.charAt(index);
		}
		if (outString.equals(inString))
			System.out.println("String: "+ inString + " is a palindrome String.");
		else
			System.out.println("String: " + inString+ " is not a palindrome String.");
	}

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = new Scanner(System.in).next();
		new PalindromeString().findPalindromeStr(str);
		new Scanner(System.in).close();
	}
}
