/*
 * Program 1: Find the missing number in integer array of 1 to 10?
Hint: You have given an integer array which contains numbers from 1 to 10 but one number is missing, 
you need to write a Java program to find that missing number in an array.
 */
package pranitaPJun20;

public class ArrayFindMissingNum20 {
	int sumActual = 0;
	void findMissingNumber(int[] input, int sumExpected) {
		for (int index = 0; index < input.length; index++) {
			sumActual = sumActual + input[index];
		}
		int difference = sumExpected - sumActual;
		System.out.println("\nThe missing number is: " + difference);
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 4, 5, 6, 7, 8, 9, 10 };// 2 is missing
		// sum of all digits in range 1 to 10
		int sumExpected = 55;
		ArrayFindMissingNum20 arrayFindMissingNum20 = new ArrayFindMissingNum20();
		arrayFindMissingNum20.findMissingNumber(arr1, sumExpected);
	}
}
