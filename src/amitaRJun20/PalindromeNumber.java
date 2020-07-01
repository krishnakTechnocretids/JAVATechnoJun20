package amitaRJun20;

public class PalindromeNumber {

	void isPalindromeNumber(int num) {
		System.out.println("The Input number is " + num);
		int reverseNum = 0, inputnum = num;
		while (num > 0) {
			reverseNum = (reverseNum * 10) + (num % 10);
			num = num / 10;
		}
		if (reverseNum == inputnum)
			System.out.println("The number " + inputnum + " is Palindrome number\n");

		else
			System.out.println("The number " + inputnum + " is not Palindrome number\n");
	}

	public static void main(String[] args) {
		PalindromeNumber palindrome = new PalindromeNumber();
		palindrome.isPalindromeNumber(45654);
		palindrome.isPalindromeNumber(56789);
		palindrome.isPalindromeNumber(12321);
	}
}