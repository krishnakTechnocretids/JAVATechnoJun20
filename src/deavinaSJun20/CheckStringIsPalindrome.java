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
		for (int index = name.length() - 1; index >= 0; index --) {
			reverse = reverse + String.valueOf(name.charAt(index));
		}
		if (name1.equalsIgnoreCase (reverse))
			System.out.println("Given string " + name1 + " is Palindrome");
		else
			System.out.println("Given string " + name1 + " is not Palindrome");
	}
}
