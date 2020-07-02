package harshadBJun20.Assignment22;
/*Assignment 22 : 1st Jul 2020

Program 1: 
Verify given number is palindrome or not. 
Input: number = 45654
Output : Given number 45654 is palindrome.

Input: number = 56789
Output : Given number 56789 is not palindrome.
*/
public class CheckNumberPalindromeOrNot {
	
	void checkPalindrome(int num) {
		int seperateNum=0, reversedNum = 0;
		int number =num;
		while(num>0) {
			seperateNum = num % 10;
			reversedNum = reversedNum * 10 + seperateNum;
			num = num / 10;	
		}
		if(number == reversedNum) 
			System.out.println("Given number "+number+" is Palindrome.");
		else
			System.out.println("Given number "+number+" is not Palindrome.");
	}
	public static void main(String[] args) {
		CheckNumberPalindromeOrNot checkNumberPalindromeOrNot = new CheckNumberPalindromeOrNot();
		checkNumberPalindromeOrNot.checkPalindrome(45654);
		checkNumberPalindromeOrNot.checkPalindrome(56789);
	}
}
