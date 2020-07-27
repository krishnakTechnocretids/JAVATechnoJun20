package aditiGJUN20;

import java.util.Scanner;

public class StringPattern1 {
	
	void printPattern(String str) {
		for (int index = 0; index < str.length(); index++) {
			System.out.println(str.substring(0, str.length() - index));
		}
	}
	public static void main(String[] args) {
		String str = "Globant";
		new StringPattern1().printPattern(str);
	}
}
