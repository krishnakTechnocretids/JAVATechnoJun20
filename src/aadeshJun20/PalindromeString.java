package aadeshJun20;

public class PalindromeString {
	 void palindromeString(String x){
		String reverse = "";
		for (int index = x.length() - 1; index >= 0; index--)
			reverse = reverse + x.charAt(index);
		if (x.equals(reverse))
			System.out.println(" Given string " + x + " is a palindrome.");
		else
			System.out.println(" Given string " + x + " is not a palindrome.");
	}
	public static void main(String args[]){
	PalindromeString palindrome = new PalindromeString();
	palindrome.palindromeString("radar");
	palindrome.palindromeString("technocredits");
	}
} 