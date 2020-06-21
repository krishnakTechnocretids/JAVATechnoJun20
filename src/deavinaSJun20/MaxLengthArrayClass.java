package deavinaSJun20;

import java.util.Scanner;

public class MaxLengthArrayClass {
	static int maxlength = 0;
	static String longeststring;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size = scanner.nextInt();
		String[] Arr = new String[size];
		for (int index = 0; index < size; index++) {
			System.out.println("Enter Name " + (index + 1));
			Arr[index] = scanner.next();
		}

		for (int index = 0; index < size; index++) {
			if (Arr[index].length() > maxlength) {
				maxlength = Arr[index].length();
				longeststring = Arr[index];
			}
		}
		System.out.println(longeststring + " is longest String with length : " + maxlength);
		scanner.close();
	}

}
