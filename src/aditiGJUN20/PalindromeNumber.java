/*
 * Verify given number is palindrome or not. 
 * Input: number = 45654
 * Output : Given number 45654 is palindrome.
 * 
 * Input: number = 56789
 * Output : Given number 56789 is not palindrome.
*/

package aditiGJUN20;

import java.util.Scanner;

public class PalindromeNumber {

	// Method to check number is palindrome or not.
	void checkPalindromeNumber(int num) {
		int reverseNum = 0, inputNum = num;
		System.out.println("\nInput Number = " + inputNum);
		while (num > 0) {
			reverseNum = reverseNum * 10 + (num % 10);
			num = num / 10;
		}
		if (reverseNum == inputNum)
			System.out.println("Entered number " + inputNum + " is palindrome");
		else
			System.out.println("Entered number " + inputNum + " is not palindrome");
	}

	public static void main(String[] args) {
		PalindromeNumber palindromeNumber = new PalindromeNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to check it's palindrom or not: ");
		palindromeNumber.checkPalindromeNumber(scanner.nextInt());
		palindromeNumber.checkPalindromeNumber(123456);
		scanner.close();
	}
}
