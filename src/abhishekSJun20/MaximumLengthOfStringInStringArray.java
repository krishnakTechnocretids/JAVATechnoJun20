package abhishekSJun20;

import java.util.Scanner;

public class MaximumLengthOfStringInStringArray {
	void Arraylenngth(String[] input) {
		int max = input[0].length();
		String stringLength = input[0];
		for (int index = 0; index < input.length; index++) {
			if (input[index].length() > max) {
				max = input[index].length();
				stringLength = input[index];
			}
		}
		System.out.println("The largest string is " + stringLength);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many elements you consider in Array?");
		int size = scanner.nextInt();
		String[] stringLength = new String[size];
		
		for (int index = 0; index < stringLength.length; index++) {
			System.out.println("enter the " + (index + 1) + " String");
			stringLength[index] = scanner.next();
		}
		
		MaximumLengthOfStringInStringArray maximumLenthofStringInStringArray = new MaximumLengthOfStringInStringArray();
		maximumLenthofStringInStringArray.Arraylenngth(stringLength);
		scanner.close();
	}
}


