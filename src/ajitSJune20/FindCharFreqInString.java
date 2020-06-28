package ajitSJune20;

import java.util.Scanner;

public class FindCharFreqInString {

	int getCharFreq(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch)
				count++;

		}
		return count;
	}

	public static void main(String[] args) {
		FindCharFreqInString findCharFreqInString = new FindCharFreqInString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Input");
		String input = scanner.next();
		System.out.println("Please Enter Character");
		char ch = scanner.next().charAt(0);

		int freq = findCharFreqInString.getCharFreq(input, ch);
		System.out.println("Frequency of " + ch + " in " + input + " is " + freq + " times.");
		scanner.close();
	}

}
