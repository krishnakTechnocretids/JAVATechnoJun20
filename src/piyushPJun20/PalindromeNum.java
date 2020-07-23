package piyushPJun20;

public class PalindromeNum {
	void palindromeNumber(int num) {
		int rev = 0, temp = num;
		for (; num > 0; num = num / 10) {
			rev = (rev * 10) + (num % 10);
		}
		if (temp == rev)
			System.out.println(" Given number " + temp + " is Palindrome.");
		else
			System.out.println(" Given number " + temp + " is Not Palindrome.");
	}

	public static void main(String args[]) {
		PalindromeNum palindrome = new PalindromeNum();
		palindrome.palindromeNumber(45654);
		palindrome.palindromeNumber(56789);
	}
}
