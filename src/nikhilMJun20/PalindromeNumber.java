/*Verify given number is palindrome or not. 
Input: number = 45654
Output : Given number 45654 is palindrome.

Input: number = 56789
Output : Given number 56789 is not palindrome.
*/

package nikhilMJun20;

import java.util.Scanner;

public class PalindromeNumber {
	void checkPalindromeNumber(int number) {
		int revNumber = 0, originalNumber=number;
		while(number>0) {
			revNumber = 10*revNumber+(number%10);
			number = number/10;
		}
		if(revNumber == originalNumber)
			System.out.println(revNumber+" is a Palindrome number.");
		else
			System.out.println(revNumber+" is NOT a Palindrome number.");
	}
	
	public static void main(String[] args) {
		PalindromeNumber palindromeNumber = new PalindromeNumber();
		Scanner scanner = new Scanner(System.in);
		String proceed = "y";
		System.out.println("This program will check if entered number is Palindrome.\n");
		do {
			System.out.println("Enter a number:");
			palindromeNumber.checkPalindromeNumber(scanner.nextInt());
			System.out.println("\nDo you want to continue? (y/n) :");
			proceed = scanner.next();
		}while(proceed.equals("y"));
		scanner.close();
	}
}
