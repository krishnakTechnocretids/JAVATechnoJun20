package ajitSJune20;

import java.util.Scanner;

public class FindCharFreqInArray {

	int getCharFrequency(String[] array, char ch) {
		int count = 0;
		for (int outerindex = 0; outerindex < array.length; outerindex++) {
			String input = array[outerindex];
			for (int innerindex = 0; innerindex < input.length(); innerindex++) {
				if (input.charAt(innerindex) == ch)
					count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		FindCharFreqInArray findCharFreqInArray = new FindCharFreqInArray();

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter no of String Elements you want in Array: ");
		int size = scanner.nextInt();
		String[] array = new String[size];

		System.out.print("Please enter " + size + " String Elements in the Array:\n");
		for (int index = 0; index < array.length; index++) {
			array[index] = scanner.next();
		}

		System.out.print("\nPlease Enter Character to find frequency: ");
		char ch = scanner.next().charAt(0);

		int freq = findCharFreqInArray.getCharFrequency(array, ch);

		System.out.println("\nResult: Frequency of " + ch + " is " + freq + " times");

		scanner.close();
	}

}
