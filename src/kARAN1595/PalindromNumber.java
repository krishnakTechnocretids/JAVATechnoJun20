package kARAN1595;

public class PalindromNumber {
	void numberPalindrome(int input) {
		int number = input;
		int reverse = 0;
		while (number > 0) {
			reverse = (reverse * 10) + (number % 10);
			number = number / 10;
		}
		if (input == reverse)
			System.out.println("Given number :" + input + " is Palindrome");
		else
			System.out.println("Given number :" + input + " is not Palindrome");
	}

	public static void main(String[] args) {
		PalindromNumber palindromNumber = new PalindromNumber();
		palindromNumber.numberPalindrome(45654);
		palindromNumber.numberPalindrome(56789);
	}
}
