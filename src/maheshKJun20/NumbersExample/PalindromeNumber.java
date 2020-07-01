/*
Program 1: 
Verify given number is palindrome or not. 
Input: number = 45654
Output : Given number 45654 is palindrome.

Input: number = 56789
Output : Given number 56789 is not palindrome.
*/

package maheshKJun20.NumbersExample;

public class PalindromeNumber {
	
	//Method to check if input number is Palindrome or Not
	void checkPalindromNumber(int num) {
		int palindromeNum = 0, temp = num;
		while (temp>0) {
			palindromeNum = (palindromeNum*10) + (temp%10);
			temp /= 10;
		}
		if(num == palindromeNum) {
			System.out.println("Given Number " + num + " is Palindrome Number");
		}else {
			System.out.println("Given Number " + num + " is not Palindrome Number");
		}
	}
	
	public static void main(String[] args) {
		PalindromeNumber palindromeNumber = new PalindromeNumber();
		palindromeNumber.checkPalindromNumber(45654);
		palindromeNumber.checkPalindromNumber(56789);
	}
}
