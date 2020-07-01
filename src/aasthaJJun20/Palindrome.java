package aasthaJJun20;

public class Palindrome {
	// Program 1: Verify given number is palindrome or not.
	void checkPalindromeNumber(int input) {
		int result = 0, number = input;
		while (number > 0) {
			result = (result * 10) + (number % 10);
			number /= 10;
		}
		if (result == input)
			System.out.println("Given number " + input + " is palindrome.");
		else
			System.out.println("Given number " + input + " is not palindrome.");
	}

	// Program 2: Verify given String is palindrome or not.
	void checkPalindromeString(String input) {
		String result = "";
		for (int index = input.length()-1; index >= 0; index--) {
			result += String.valueOf(input.charAt(index));
		}
		if (input.equals(result))
			System.out.println("Given string " + input + " is palindrome.");
		else
			System.out.println("Given string " + input + " is not a palindrome.");
	}

	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		System.out.println("\nProgram:1 Output:---------------------------------");
		palindrome.checkPalindromeNumber(45654);
		palindrome.checkPalindromeNumber(56789);
		System.out.println("\nProgram:2 Output:---------------------------------");
		palindrome.checkPalindromeString("radar");
		palindrome.checkPalindromeString("technocredits");
	}
}