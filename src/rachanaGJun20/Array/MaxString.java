package rachanaGJun20.Array;

import java.util.Scanner;

public class MaxString {

	String findMaxString(String[] nameString) {
		int stringLength;
		int maxlength = 0;
		String maxName = null;

		for (int counter = 0; counter < nameString.length; counter++) {
			stringLength = nameString[counter].length();
			if (stringLength > maxlength) {
				maxlength = stringLength;
				maxName = nameString[counter];
			}
		}
		return maxName;
	}

	public static void main(String[] args) {
		MaxString maxstring = new MaxString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many names you want to enter");
		int size = sc.nextInt();
		System.out.println("Enter Name");
		String[] name = new String[size];
		for (int i = 0; i < size; i++) {
			name[i] = sc.next();
		}
		String longestname = maxstring.findMaxString(name);
		System.out.println("Name with maximum length is " + longestname + " " + "length: " + longestname.length());
	}

}
