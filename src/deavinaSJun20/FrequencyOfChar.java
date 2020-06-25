package deavinaSJun20;

import java.util.Scanner;

public class FrequencyOfChar {
	public static void main(String[] args) {
		FrequencyOfChar frequencyofchar = new FrequencyOfChar();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name ");
		String name = scanner.next().toLowerCase();
		System.out.println("Enter character to find frequency -> ");
		char ch = (scanner.next().toLowerCase()).charAt(0);
		frequencyofchar.charFrequency(name, ch);
		System.out.println("*****************************************");
		frequencyofchar.allCharFrequency(name);
		System.out.println("*****************************************");
		System.out.println("Enter size of Array: ");
		int size = scanner.nextInt();
		String[] Arr = new String[size];
		for (int index = 0; index < size; index++) {
			System.out.println("Enter Name " + (index + 1) + " :");
			Arr[index] = scanner.next().toLowerCase();
		}
		frequencyofchar.charFrequencyArray(Arr);
		scanner.close();
	}

	public void charFrequency(String name, char ch) {
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println("The frequency of " + ch + " in " + name + " is " + count + " times");
	}

	public void allCharFrequency(String name) {
		for (int i = 0; i < name.length(); i++) {
			charFrequency(name, name.charAt(i));
		}
	}

	public void charFrequencyArray(String[] name) {
		for (int i = 0; i < name.length; i++) {
			allCharFrequency(name[i]);

		}
	}
}
