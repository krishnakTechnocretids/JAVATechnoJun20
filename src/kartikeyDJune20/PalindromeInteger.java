package kartikeyDJune20;

public class PalindromeInteger {
	static void checkIntegerPalinfrome(int num) {
		int orig = num;
		int rev = 0;

		while (num > 0) {
			rev = (rev * 10) + (num % 10);
			num = num / 10;
		}
		if (rev == orig)
			System.out.println(orig + " is Palindrome number");
		else
			System.out.println(orig + " is not a palindrome number");
	}

	public static void main(String[] args) {
		PalindromeInteger.checkIntegerPalinfrome(45654);
		PalindromeInteger.checkIntegerPalinfrome(56789);
	}

}
