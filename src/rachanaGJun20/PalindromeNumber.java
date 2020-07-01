/*Program 1: 
Verify given number is palindrome or not. 
Input: number = 45654
Output : Given number 45654 is palindrome.

Input: number = 56789
Output : Given number 56789 is not palindrome.*/

package rachanaGJun20;

import java.util.Scanner;

public class PalindromeNumber {
	//method will check whether given number is Palindrome
	boolean isNumberPalindrome(int number) {
		int remainder = 0;
		int reverseNumber = 0;
		int givenNumber = number;

		while (number != 0) {
			remainder = number % 10;
			number = number / 10;
			reverseNumber = reverseNumber * 10 + remainder;
		}
		if (givenNumber == reverseNumber)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		PalindromeNumber palindromenumber = new PalindromeNumber();
		Scanner scanner = new Scanner(System.in);
		boolean flag;
		System.out.println("Please enter Number to check");
		flag = palindromenumber.isNumberPalindrome(scanner.nextInt());
		if (flag) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number is not palindrome");
		}
		System.out.println("Please enter Number to check");
		flag = palindromenumber.isNumberPalindrome(scanner.nextInt());
		if (flag) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number is not palindrome");
		}
		scanner.close();

	}

}
