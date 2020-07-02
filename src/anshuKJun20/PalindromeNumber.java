package anshuKJun20;

public class PalindromeNumber {
	void findPalindromeNumber(int number) {
		int number1 = number, add = 0;
		while (number > 0) {
			add = add * 10 + number % 10;
			number = number / 10;
		}
		if (add == number1) {
			System.out.println("Given number " + number1 + " is palindrome.");
		} else {
			System.out.println("Given number " + number1 + " is not palindrome.");
		}
	}

	public static void main(String[] args) {
		PalindromeNumber palindromeNum = new PalindromeNumber();
		palindromeNum.findPalindromeNumber(45654);
		palindromeNum.findPalindromeNumber(56789);
	}
}
