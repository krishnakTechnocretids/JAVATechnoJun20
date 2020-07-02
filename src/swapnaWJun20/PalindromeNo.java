package swapnaWJun20;

public class PalindromeNo {

	void findPalindromeNumber(int number) {
		int number1 = number;
		int temp = 0;
		while (number1 > 0) {
			temp = temp * 10 + number1 % 10;
			number1 = number1 / 10;
		}
		if (temp == number)
			System.out.println("Input : " + number + " is Palindrome");
		else
			System.out.println("Input : " + number + " is not Palindrome");
	}

	public static void main(String[] args) {
		PalindromeNo palindromeNo = new PalindromeNo();
		palindromeNo.findPalindromeNumber(45454);
		palindromeNo.findPalindromeNumber(1234);
	}
}
