package anshuKJun20;

public class PalindromeNumber {
	private void findPalindromeNumber(int number) {
		int number1 = number, add = 0;
		while (number > 0) {
			int remainder = number % 10;
			number = number / 10;
			add = add * 10 + remainder;
		}
		if (add == number1) {
			System.out.println("Given number " + number1 + " is palindrome.");
		} else {
			System.out.println("Given number " + number1 + " is not palindrome.");
		}
	}

	public void display() {
		findPalindromeNumber(45654);
		findPalindromeNumber(56789);
	}

	public static void main(String[] args) {
		PalindromeNumber palindromeNum = new PalindromeNumber();
		palindromeNum.display();

	}
}
