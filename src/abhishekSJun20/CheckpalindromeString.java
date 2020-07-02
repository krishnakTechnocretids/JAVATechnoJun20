package abhishekSJun20;

public class CheckpalindromeString {
	// method to check String is palindrome or not
	void palindromeStringCheck(String input) {
		String rev = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			rev = rev + input.charAt(index);
		}
		if (input.equalsIgnoreCase(rev))
			System.out.println("Given string :" + input + " is palindrome.");
		else
			System.out.println("Given string :" + input + " is not palindrome.");

	}

	public static void main(String[] args) {
		CheckpalindromeString checkpalindromeString = new CheckpalindromeString();
		checkpalindromeString.palindromeStringCheck("radar");
		checkpalindromeString.palindromeStringCheck("technocredits");
	}
}
