/*
Program 2:
Verify given String is palindrome or not. 
Input: radar
Output : Given string radar is palindrome.

Input: technocredits
Output: Given string technocredits is not palindrome.
*/

package maheshKJun20.StringExamples;

public class PalindromeString {
	
	//Method to Find Input String is Palindrome or Not
	void checkPalindromeString(String str) {
		String palindromeStr = "";
		for (int index=str.length()-1;index>=0;index--) {
			palindromeStr += str.charAt(index);
		}
		if(str.equalsIgnoreCase(palindromeStr))
			System.out.println("Given string " + str + " is palindrome.");
		else
			System.out.println("Given string " + str + " is not palindrome.");
	}
	
	public static void main(String[] args) {
		PalindromeString palindromeString = new PalindromeString();
		palindromeString.checkPalindromeString("radar");
		palindromeString.checkPalindromeString("technocredits");
	}
}
