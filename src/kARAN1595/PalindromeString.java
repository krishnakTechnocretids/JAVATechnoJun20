package kARAN1595;

public class PalindromeString {
	void palindromeString(String input) {
		String reverse = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			reverse = reverse + input.charAt(index);
		}
		if (input.equalsIgnoreCase(reverse))
			System.out.println("Given string  is palindrome. :" + input);
		else
			System.out.println("Given string is not palindrome.:" + input);
	}

	public static void main(String[] args) {
		PalindromeString palindromeString = new PalindromeString();
		palindromeString.palindromeString("radar");
		palindromeString.palindromeString("technocredits");
	}
}
