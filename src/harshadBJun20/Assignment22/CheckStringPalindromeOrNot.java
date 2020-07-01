package harshadBJun20.Assignment22;

/*Program 2:
Verify given String is palindrome or not. 
Input: radar
Output : Given string radar is palindrome.

Input: technocredits
Output: Given string technocredits is not palindrome.*/

public class CheckStringPalindromeOrNot {
	
	void checkPalindrome(String str) {
		String str1="";
		for(int i=str.length()-1;i>=0;i--) {
			str1 += str.charAt(i);
		}
		if(str.equalsIgnoreCase(str1))
			System.out.println("Given string "+str+" is palindrome.");
		else
			System.out.println("Given string "+str+" is not palindrome.");
	}
	
	public static void main(String[] args) {
		CheckStringPalindromeOrNot checkStringPalindromeOrNot = new CheckStringPalindromeOrNot();
		checkStringPalindromeOrNot.checkPalindrome("radar");
		checkStringPalindromeOrNot.checkPalindrome("technocredits");
	}
}
