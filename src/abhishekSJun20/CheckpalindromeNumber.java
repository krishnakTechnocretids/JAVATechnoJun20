package abhishekSJun20;

public class CheckpalindromeNumber {
	// method to check number is Palindrome or not
	void numberPalindromeCheck(int input) {
		int num = input;
		int rev = 0;
		while (num > 0) {
			rev = (rev * 10) + (num % 10);
			num = num / 10;
		}
		if (input == rev)
			System.out.println("Given number :" + input + " is Palindrome");
		else
			System.out.println("Given number :" + input + " is not Palindrome");
	}

	public static void main(String[] args) {
		CheckpalindromeNumber checkpalindromeNumber = new CheckpalindromeNumber();
		checkpalindromeNumber.numberPalindromeCheck(45654);
		checkpalindromeNumber.numberPalindromeCheck(56789);
	}
}