package apurvaJun20;

public class PalindromeInteger {

	void findIfNumberIsPalindrome(int num) {
		int reverse = 0, inputNum = num;
		while (num > 0) {
			reverse = 10 * reverse + (num % 10);
			num = num / 10;
		}
		if (inputNum == reverse)
			System.out.println("Given number " + inputNum + " is Palindrome");
		else
			System.out.println("Given number " + inputNum + " is not Palindrome");
	}

	public static void main(String[] args) {
		PalindromeInteger palindromeInteger = new PalindromeInteger();
		palindromeInteger.findIfNumberIsPalindrome(45654);
		palindromeInteger.findIfNumberIsPalindrome(56789);
	}
}
