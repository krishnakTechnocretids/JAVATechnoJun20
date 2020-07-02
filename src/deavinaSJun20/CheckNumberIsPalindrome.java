package deavinaSJun20;

import java.util.Scanner;

public class CheckNumberIsPalindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the number : ");
		int number = scanner.nextInt();
		new CheckNumberIsPalindrome().checkNumberIsPalindrome(number);
		scanner.close();
	}

	void checkNumberIsPalindrome(int num) {
		int num1 = num;
		int reverse = 0;
		while (num != 0) {
			reverse = (reverse * 10) + (num % 10);
			num = num / 10;
		}
		if (num1 == reverse)
			System.out.println("Given number " + num1 + " is Palindrome");
		else
			System.out.println("Given number " + num1 + " is not Palindrome");
	}
}
