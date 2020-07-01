package kartikeyDJune20;

public class PalindromeString {

	static void checkStringPalindrome(String input) {
		String rev = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			rev = rev + String.valueOf(input.charAt(index));
		}
		if (rev.equalsIgnoreCase(input))
			System.out.println("Given string " + input + " is Palindrome");
		else
			System.out.println("Given string " + input + " is not Palindrome");
	}

	public static void main(String[] args) {
		PalindromeString.checkStringPalindrome("technocredits");
		PalindromeString.checkStringPalindrome("Radar");
	}

}
