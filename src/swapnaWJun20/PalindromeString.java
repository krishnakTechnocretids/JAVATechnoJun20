package swapnaWJun20;

public class PalindromeString {

	void findPalindromeNumber(String input) {
		String reverse = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			reverse += input.charAt(index);
		}
		if (input.equals(reverse))
			System.out.println("Input : " + input + " is Palindrome");
		else
			System.out.println("Input : " + input + " is not Palindrome");
	}

	public static void main(String[] args) {
		PalindromeString palindromeString = new PalindromeString();
		palindromeString.findPalindromeNumber("level");
		palindromeString.findPalindromeNumber("technocredits");
	}
}
