package aadeshJun20;

public class PalindromeNumber {
	void palindromeNumber(int number) {
		int reverse = 0, temp = number;
		for (; number > 0; number = number / 10) {
			reverse = (reverse * 10) + (number % 10);
		}
		if (temp == reverse)
			System.out.println(" Given number " + temp + " is a Palindrome number.");
		else
			System.out.println(" Given number " + temp + " is not a Palindrome number.");
	}

	public static void main(String args[]) {
		PalindromeNumber palindromenum = new PalindromeNumber();
		palindromenum.palindromeNumber(45654);
		palindromenum.palindromeNumber(56789);
	}
}