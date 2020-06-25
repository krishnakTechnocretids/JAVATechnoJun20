package ajitSJune20;

import java.util.Scanner;

public class FindCharFrequency {
	// char ch; int count=0;
	void findCharFreq(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch)
				count++;
		}
		System.out.println("Frequency of " + ch + "-----> " + count + " times.");
	}

	void findAllCharFreq(String input) {
		for (int index = 0; index < input.length(); index++) {
			findCharFreq(input, input.charAt(index));
		}
	}

	void findAllCharFreqFromArray(String[] array) {
		for (int index = 0; index < array.length; index++) {
			findAllCharFreq(array[index]);
			System.out.println("=============================");
		}
	}

	public static void main(String[] args) {
		FindCharFrequency findCharFrequency = new FindCharFrequency();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("==============1. Find particular Element's Frequency in the given String===============");
		System.out.println("\nEnter Input String :");
		String input = scanner.next();
		System.out.println("Please Enter Character");
		char ch = scanner.next().charAt(0);
		findCharFrequency.findCharFreq(input, ch);

		System.out.println("\n=================2. Find All Element's Frequency in the given String=================");
		System.out.println("\nEnter Second Input String :");
		String name = scanner.next();
		findCharFrequency.findAllCharFreq(name);

		System.out.println("\n=================3. Find All Element's Frequency From Array=================");
		System.out.print("Enter no of String Elements you want in Array: ");
		int size = scanner.nextInt();
		String[] array = new String[size];

		System.out.print("Please enter " + size + " String Elements in the Array:\n");
		for (int index = 0; index < array.length; index++) {
			array[index] = scanner.next();
		}
		findCharFrequency.findAllCharFreqFromArray(array);
		scanner.close();

	}

}
