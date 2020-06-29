package deavinaSJun20;

import java.util.Arrays;

public class MissingIntegerinArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 4, 6, 7, 9, 8, 10 };
		new MissingIntegerinArray().printArray(arr);
		new MissingIntegerinArray().missingIntegerinArray(arr);
	}

	void printArray(int[] arr) {
		System.out.print("Entered array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	void missingIntegerinArray(int[] arr) {
		int j = 1;
		Arrays.sort(arr); // function for sorting arrays
		for (int i = 0; i < arr.length; i++) {
			while (arr[i] == j) {
				j++;
			}
		}
		System.out.println("\nMissing Number in entered array: " + j);
	}
}
