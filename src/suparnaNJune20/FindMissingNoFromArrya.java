/*
 Assignment 20 : 28th Jun 2020
Program 1: Find the missing number in integer array of 1 to 10?
Hint: You have given an integer array which contains numbers from 1 to 10 but one number is missing, you need to write a Java program to find that missing number in an array.
 */
package suparnaNJune20;

public class FindMissingNoFromArrya {

	void displayArray(int[] arrayInt) {
		System.out.println("Input:");
		System.out.print(+arrayInt[0]);
		for (int index = 1; index < arrayInt.length; index++) {
			System.out.print(" , " + arrayInt[index]);
		}
		System.out.println("\n");
	}
	void finMissingNo(int[] arrayInt) {
		boolean findNo = false;
		for (int outerIndex = 1; outerIndex < 10; outerIndex++) {
			findNo = false;
			for (int innerIndex = 0; innerIndex < arrayInt.length; innerIndex++)
				if (arrayInt[innerIndex] == outerIndex) {
					findNo = true;
					break;
				}
			if (!findNo)
				System.out.println(outerIndex + " is missing in array");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayInt = { 2, 6, 9, 3, 5, 8, 1, 7, 1, 10 };
		FindMissingNoFromArrya missingNo = new FindMissingNoFromArrya();
		missingNo.displayArray(arrayInt);
		missingNo.finMissingNo(arrayInt);
	}
}
