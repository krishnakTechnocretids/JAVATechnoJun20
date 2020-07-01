/*
Program 1: 
Verify given number is palindrome or not. 
Input: number = 45654
Output : Given number 45654 is palindrome.

Input: number = 56789
Output : Given number 56789 is not palindrome.
*/


package vireshJJun20.Assignment22;

import java.util.Scanner;

public class PalindromeInteger {

	void findPalindromeInt(int input){ //123
		int revNum=0, mod=0, origNum= input ;
		while(input!=0){
			mod= input%10; // 3 >> 2 >> 1
			revNum= revNum*10 + mod; // 3 >> 32 >> 321 
			input= input/10; // 12 >> 1 >> 0
		}
		if (revNum==origNum)
			System.out.println(">> " + origNum + " is a palindrome number.");
		else
			System.out.println(">> " + origNum + " is a not a palindrome number.");
	}
	
	public static void main(String[] args){
		System.out.print("Enter a number: ");
		int num= new Scanner(System.in).nextInt();
		new PalindromeInteger().findPalindromeInt(num);
		new Scanner(System.in).close();
	}
}
