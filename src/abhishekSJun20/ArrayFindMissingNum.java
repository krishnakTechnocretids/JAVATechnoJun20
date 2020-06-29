package abhishekSJun20;
/* Program 1: Find the missing number in integer array of 1 to 10?
Hint: You have given an integer array which contains numbers from 1 to 10 but one number is missing, 
you need to write a Java program to find that missing number in an array.
 */

public class ArrayFindMissingNum {
	//method to find missing number in Array from 1to 10
	int sumActual = 0;
	void findMissingNumber(int[] input, int sumExpected) {
		for (int index = 0; index < input.length; index++) {
			sumActual += input[index];
		}
		int difference = sumExpected - sumActual;
		System.out.println("The missing number is: " + difference);
	}

	public static void main(String[] args) {
		int[] arr1 = { 1,2,4, 5, 6, 7, 8, 9, 10 };// 3 is missing
		// sum of all digits in range 1 to 10
		int sumExpected = 55;
		ArrayFindMissingNum arrayFindMissingNum = new ArrayFindMissingNum();
		arrayFindMissingNum.findMissingNumber(arr1, sumExpected);
	}
}

