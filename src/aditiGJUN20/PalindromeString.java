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
		System.out.println("Input String: " + input);
		String rev = "";
		for (int index = input.length() - 1; index >= 0; index--)
			rev = rev + input.charAt(index);

		if (input.equalsIgnoreCase(rev))
			return true;
		else
			return false;
	}
	
//	Optimized solution.. 
//	void verifyIsStringPalindrome(String name) {
//		boolean isPalindrome = true; 
//		for(int index=0; index<name.length()/2; index++) {
//			if(name.charAt(index)!=name.charAt(name.length()-(index+1))) {
//				System.out.println(name+" given string is not palindrome");
//				isPalindrome = false;
//				break; 
//			}
//		}
//		if(isPalindrome)
//			System.out.println(name+ " given string is palindrome.");
//	}

	public static void main(String[] args) {
		PalindromeString palindromeString = new PalindromeString();
		if (palindromeString.isPalindromString("Radar") == true)
			System.out.println("Input String Is Palindrome");
		else
			System.out.println("Input String IS NOT Palindrome");
	}
}