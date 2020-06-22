package rachanaGJun20.String;

import java.util.Scanner;

public class CharacterOccurrence {

	void findCharacterOccurrence(String[] stringlist, String ch) { // Method will find user given character occurrence
																	// from the user given Strings
		int charcount = 0;
		for (int i = 0; i < stringlist.length; i++) {
			charcount = 0;
			for (int j = 0; j < stringlist[i].length(); j++) {

				String str = String.valueOf(stringlist[i].charAt(j));
				if (str.equalsIgnoreCase(ch)) {
					charcount++;
				}
			}
			System.out.println("Occuerence of Character " + ch + " is " + charcount + " in String " + stringlist[i]);
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter how many numbers of strings you want to give:");
		int number = scanner.nextInt();
		System.out.println("Please enter your strings:");
		String[] stringList = new String[number];

		for (int i = 0; i < number; i++) {
			stringList[i] = scanner.next();
		}

		System.out.println("please enter characer for finding occurrence");
		String ch = scanner.next();
		new CharacterOccurrence().findCharacterOccurrence(stringList, ch);
		scanner.close();
	}

}
