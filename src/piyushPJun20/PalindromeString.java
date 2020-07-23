public class PalindromeString {
	 void palindromeString(String str){
		String rev = "";
		for (int index = str.length() - 1; index >= 0; index--)
			rev = rev + str.charAt(index);
		if (str.equals(rev))
			System.out.println(" Given string " + str + " is palindrome.");
		else
			System.out.println(" Given string " + str + " is not palindrome.");
		
	}
	public static void main(String args[]){
	PalindromeString palindrome = new PalindromeString();
	palindrome.palindromeString("radar");
	palindrome.palindromeString("technocredits");
	
	}
}