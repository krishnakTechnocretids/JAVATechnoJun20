 /* Verify given number is palindrome or not. 
Input: number = 45654
Output : Given number 45654 is palindrome. 

Input: number = 56789
Output : Given number 56789 is not palindrome */
package jagadeeshMJun20;

import java.util.Scanner;

public class PalindromeNumber {
	int displayOutput(int num) {
		int output = 0;
		while (num > 0) {
			output = output*10+num % 10;
			num = num / 10;
		}
		return output;

	}

	public static void main(String[] agrs) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Input Number");
		int num = scanner.nextInt();

		if (num == new PalindromeNumber().displayOutput(num))
			System.out.println("Given Number " + num + " is Palindrome ");
		else
			System.out.println("Given Number " + num + " is Not Palindrome ");
		scanner.close();
	}
}
