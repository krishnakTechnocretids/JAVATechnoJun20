package kARAN1595;

/*
 2) Create a class with following functionality. [Estimated time: 35 mins]
a) Find one character frequency from given name.
     Input: name - technocredits
               character - e
     Output : e -> 2 time in technocredits

b) Find all character frequency from given name.
     Input: name - aakanksha
     Output : a -> 4
            a -> 4
                   k -> 2
                   a -> 4
                   n -> 1
                   k -> 2
                   s -> 1
                   h -> 1
                   a -> 4
c) Find all character frequency from each name given in String array.
     Input : Array -> {"raj", "aarya", "aavruti", "shruti"}
     Output : r -> 1 time in raj
                   a -> 1 time in raj
                   j -> 1 time in raj
         =====================
     a -> 3 time in aarya
     a -> 3 time in aarya
     r -> 1 time in aarya
                   y -> 1 time in aarya
                   a -> 3 time in aarya 
         ====================
          And so on....
 */
import java.util.Scanner;

public class CharFrequency {
	void findOneCharFrequency(String name, char findCharacter) {
		int count = 0;
		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == findCharacter)
				count++;
		}
		System.out.println("Charcter " + findCharacter + " --> " + count + " times in " + name);
	}

	void findAllCharFrequencyFromName(String name) {
		for (int index = 0; index < name.length(); index++) {
			findOneCharFrequency(name, name.charAt(index));
		}
	}

	void findAllCharFrequencyFromArray(String[] stringArray) {
		for (int index = 0; index < stringArray.length; index++) {
			findAllCharFrequencyFromName(stringArray[index]);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CharFrequency arrayFreqOfCharacter = new CharFrequency();
		System.out.println("Enter the Name to find out the character frequency");
		String name = scanner.next();
		System.out.println("Enter the Character you want to search : " + name);
		char character = scanner.next().charAt(0);
		arrayFreqOfCharacter.findOneCharFrequency(name, character);
		System.out.println("Enter the Name to find all character frequency from each name given:");
		String allFreqName = scanner.next();
		arrayFreqOfCharacter.findAllCharFrequencyFromName(allFreqName);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		String[] stringArray = new String[size];
		for (int i = 0; i < stringArray.length; i++) {
			System.out.println("Enter the Name");
			stringArray[i] = scanner.next();
		}
		arrayFreqOfCharacter.findAllCharFrequencyFromArray(stringArray);

		scanner.close();
	}
}