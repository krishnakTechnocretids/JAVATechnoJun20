/*
Program 1: Find the missing number in integer array of 1 to 10?
Hint: You have given an integer array which contains numbers from 1 to 10 
but one number is missing, you need to write a Java program to find that 
missing number in an array
*/

package aditiGJUN20;

import java.util.Arrays;

public class MissingNumberInIntArray {
	void findMissingNumber(int[] intArray) {
		Arrays.sort(intArray);
		int arrayValue = intArray[0];
		for (int index = 0; index < intArray.length; index++) {
			while (intArray[index] == arrayValue)
				arrayValue++;
		}
		System.out.println("Missing number is: " + arrayValue);
	}

	public static void main(String[] args) {
		MissingNumberInIntArray missingNumberInIntArray = new MissingNumberInIntArray();
		// input- 1
		int[] inputarray1 = { 1, 4, 2, 7, 5, 6, 8 };
		System.out.println("Input Array = {1, 4, 2, 7, 5, 6, 8}");
		missingNumberInIntArray.findMissingNumber(inputarray1);

		// input- 2
		int[] inputarray2 = { 11, 12, 17, 13, 14, 16 };
		System.out.println("\nInput Array = { 11, 12, 17, 13, 14, 16 }");
		missingNumberInIntArray.findMissingNumber(inputarray2);
	}
}
