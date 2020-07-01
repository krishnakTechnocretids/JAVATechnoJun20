package deavinaSJun20;

import java.util.Scanner;

public class CheckStringIsPalindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the String : ");
		String input = scanner.next();
		new CheckStringIsPalindrome().checkStringIsPalindrome(input);
		scanner.close();
	}

	void checkStringIsPalindrome(String name) {
		String reverse = "";
		String name1 = name;
		for (int i = name.length() - 1; i >= 0; i--) {
			reverse = reverse + String.valueOf(name.charAt(i));
		}
		if (name1.equals(reverse))
			System.out.println("Given string " + name1 + " is Palindrome");
		else
			System.out.println("Given string " + name1 + " is not Palindrome");
	}
}
