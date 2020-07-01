package ajitSJune20;

public class TestPalindromeNumber {

	static boolean isPalindromeInteger(int number) {
		if (number == reverse(number)) {
			return true;
		}
		return false;
	}

	static int reverse(int number) {
		int reverse = 0;
		while (number != 0) {
			reverse = reverse * 10 + number % 10;
			number = number / 10;
		}
		return reverse;
	}

	public static void main(String args[]) {

		int[] intArray = { 45654, 56789 };
		// for (int i=0;i<intArray.length;i++) {
		// int number=intArray[i];
		for (int number : intArray) {
			if (isPalindromeInteger(number) == true)
				System.out.println("Given number " + number + " is palindrome");
			else
				System.out.println("Given number " + number + " is not palindrome");
		}
	}
}