/*
 * Assignment 22 : 1st Jul 2020

Program 1: 
Verify given number is palindrome or not. 
Input: number = 45654
Output : Given number 45654 is palindrome.

Input: number = 56789
Output : Given number 56789 is not palindrome.

*/
package suparnaNJune20.Assignment22;

public class PalindromeNo {

	void checkPalindromeNo(int num) {
		int tempNum = 0, orignalNum = num;
		while (num != 0) {
			tempNum = (tempNum * 10) + num % 10;
			num = num / 10;
		}
		if (tempNum == orignalNum)
			System.out.println(orignalNum + " is Palindrome Number ");
		else
			System.out.println(orignalNum + " is not Palindrome Number ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PalindromeNo().checkPalindromeNo(123);
		new PalindromeNo().checkPalindromeNo(12321);
	}
}
