package rachanaGJun20;

import java.util.Scanner;

public class PlindromeString {
	//method will check whether given string is Palindrome
	boolean isStringPlindrome(String str) {
		String revstr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revstr = revstr + str.charAt(i);
		}
		if (str.equals(revstr))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		PlindromeString plindromestring = new PlindromeString();
		Scanner scanner = new Scanner(System.in);
		boolean flag;
		System.out.println("Pease Enter a string to check:");
		flag = plindromestring.isStringPlindrome(scanner.next());
		if (flag) {
			System.out.println("Given string is palindrome");
		} else {
			System.out.println("Given string is not palindrome");
		}
		System.out.println("Please enter a string to check");
		flag = plindromestring.isStringPlindrome(scanner.next());
		if (flag) {
			System.out.println("Given string is palindrome");
		} else {
			System.out.println("Given string is not palindrome");
		}
		scanner.close();
	}

}
