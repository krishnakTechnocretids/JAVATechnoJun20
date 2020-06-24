package deavinaSJun20;

import java.util.Scanner;

/*Find the frequency of character from a given String array.*/
public class CharFreqArrayClass {
	public void freqCharArray(String[] Arr, char chr) {
		for (int index1 = 0; index1 < Arr.length; index1++) {
			int count = 0;
			for (int index2 = 0 ; index2 < Arr[index1].length(); index2++) {
				if (Arr[index1].charAt(index2) == chr) {
					count++;
				}
			}
			System.out.println("The frequency of " + chr + " in " + Arr[index1] + " is " + count + " times");	
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of Array: ");
		int size = scanner.nextInt();
		String[] Arr = new String[size];
		for (int index = 0; index < size; index++) {
			System.out.println("Enter Name " + (index + 1)+" :");
			Arr[index] = scanner.next().toLowerCase();
		}
		System.out.println("Enter the character for which you want to find frequency : ");
		char chr = (scanner.next().toLowerCase()).charAt(0);
		CharFreqArrayClass charFreqArray = new CharFreqArrayClass();
		charFreqArray.freqCharArray(Arr, chr);
		scanner.close();
	}

}
