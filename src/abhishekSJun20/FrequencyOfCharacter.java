package abhishekSJun20;

import java.util.Scanner;

/*2) Create a class with following functionality. [Estimated time: 35 mins]
a) Find one character frequency from given name.
    Input: name - technocredits
               character - e
     Output : e -> 2 time in technocredits */

public class FrequencyOfCharacter {
	int getCharFrequency(char ch, String name) {
		int count = 0;
		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == ch)
				count++;
		}
		return count;
	}

	// To Find all character frequency from given name
	void displayAllCharFrequency(String name) {

		for (int index = 0; index < name.length(); index++) {
			int counter = 0;
			for (int i = 0; i < name.length(); i++) {
				if (name.charAt(index) == name.charAt(i))
					counter++;
			}
			System.out.println(name.charAt(index) + " -> " + counter + " time in " + name);
		}
	}

	void displayAllCharFreqFromArray(String[] name1) {
		for (int index1 = 0; index1 < name1.length; index1++) {
			String temp = name1[index1];
			displayAllCharFrequency(temp);
			System.out.println("===================================");
		}
	}

	public static void main(String[] agrs) {
		FrequencyOfCharacter frequencyOfCharacter = new FrequencyOfCharacter();
		Scanner scanner = new Scanner(System.in);
		String[] name1 = new String[4];
		System.out.println("Enter any string");
		String name = scanner.next();
		System.out.println("Enter char to get the frequency");
		char ch = scanner.next().charAt(0);
		int count = frequencyOfCharacter.getCharFrequency(ch, name);
		System.out.println(ch + "-> " + count + " times in " + name);
		System.out.println("===================================");
		System.out.println("Enter name to display all char frequency:");
		name = scanner.next();
		frequencyOfCharacter.displayAllCharFrequency(name);
		System.out.println("===================================");
		System.out.println("Enter Four names to display all char frequency:");
		for (int index = 0; index < 4; index++)
			name1[index] = scanner.next();
		frequencyOfCharacter.displayAllCharFreqFromArray(name1);

		scanner.close();
	}
}
