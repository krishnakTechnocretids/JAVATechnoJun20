/* Verify given String is palindrome or not. 
Input: radar
Output : Given string radar is palindrome.*/
package palakSJun20;

public class PalindromeString {
	// Method to check String is palindrome or not
	void verifyPalindromeString(String string){
		String palindromeString = "";
		for (int index =string.length()-1 ; index >= 0; index--) {
			   palindromeString = palindromeString + string.charAt(index);
		}
		if (string.equals(palindromeString)) 
			System.out.println("Given String "+ string +" is Palindrome");
		else 
			System.out.println("Given String "+ string  +" is not palindrome");
	}
	
	public static void main(String[] args) {
		PalindromeString palindromeString = new PalindromeString();
		palindromeString.verifyPalindromeString("radar");
		palindromeString.verifyPalindromeString("technocredits");
	}
}
