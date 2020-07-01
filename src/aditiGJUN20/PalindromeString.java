/*
 * Verify given String is palindrome or not. 
 * Input: radar
 * Output : Given string radar is palindrome.
 * Input: technocredits
 * Output: Given string technocredits is not palindrome.
*/
package aditiGJUN20;

public class PalindromeString {
	boolean isPalindromString(String input) {
		System.out.println("Input String: "+input);
		String rev="";
		for ( int index = input.length() - 1; index >= 0; index-- )
        rev = rev + input.charAt(index); 
		
		if(input.equalsIgnoreCase(rev))
			return true;
		else
			return false;
    } 
	
	public static void main(String[] args) {
		PalindromeString palindromeString = new PalindromeString();
		if(palindromeString.isPalindromString("Radar")==true)
			System.out.println("Input String Is Palindrome");
		else
			System.out.println("Input String IS NOT Palindrome");
	}
}
