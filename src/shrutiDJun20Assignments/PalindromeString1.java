package shrutiDJun20Assignments;

public class PalindromeString1 {

	void palindromeStringCheck(String input) {
		String rev = "";
		for (int index = input.length()-1; index >= 0; index--) {
			rev = rev + input.charAt(index);
		}
		if (input.equals(rev))
			System.out.println("Given string '" + input + "' is palindrome.");
		else
			System.out.println("Given string '" + input
					+ "' is not palindrome.");

	}
	public static void main(String[] args) {
		PalindromeString1 palindromeString1 = new PalindromeString1();
		palindromeString1.palindromeStringCheck("radar");
		palindromeString1.palindromeStringCheck("technocredit");
	}

}
