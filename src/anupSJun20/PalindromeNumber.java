package anupSJun20;
/*Program 1: 
Verify given number is palindrome or not. 
Input: number = 45654
Output : Given number 45654 is palindrome.

Input: number = 56789
Output : Given number 56789 is not palindrome.*/

public class PalindromeNumber {
	static void findPalindromeNumber(int input) {
		int initialNum = input;
		int revNum = 0;
		while (input > 0) {
			revNum = (revNum * 10) + (input % 10);
			input = input / 10;
		}
		if (initialNum == revNum)
			System.out.println(" The input number " + initialNum + " is  a palindrome Number ");
		else
			System.out.println(" The input number " + initialNum + " is  not a palindrome Number ");
	}

	public static void main(String[] args) {
		findPalindromeNumber(45654);
		findPalindromeNumber(56789);
	}
}