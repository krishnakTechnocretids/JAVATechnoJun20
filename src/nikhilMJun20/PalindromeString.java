/*Verify given String is palindrome or not. 
Input: radar
Output : Given string radar is palindrome.

Input: technocredits
Output: Given string technocredits is not palindrome.
*/

package nikhilMJun20;

import java.util.Scanner;

public class PalindromeString {
	void checkPalindromeString(String str) {
		boolean flag = true;
		str = str.toLowerCase();
		for(int leftIndex=0, rightIndex=str.length()-1; leftIndex<=rightIndex; leftIndex++,rightIndex--) {
			if(str.charAt(leftIndex) != str.charAt(rightIndex)) {
				flag=false;
				break;
			}
		}
		if(flag==true)
			System.out.println(str+" --> is a Palindrome string.");
		else
			System.out.println(str+" --> is NOT a Palindrome string.");
	}
	
	public static void main(String[] args) {
		PalindromeString palindromeString = new PalindromeString();
		Scanner scanner = new Scanner(System.in);
		String proceed = "y";
		System.out.println("This program will check if entered String is Palindrome.\n");
		do {
			System.out.println("Enter a String:");
			palindromeString.checkPalindromeString(scanner.nextLine());
			System.out.println("\nDo you want to continue? (y/n) :");
			proceed = scanner.nextLine();
		}while(proceed.equals("y"));
		scanner.close();
	}
}
