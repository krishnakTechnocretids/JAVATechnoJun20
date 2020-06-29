/*Program 1: Find the missing number in integer array of 1 to 10?
Hint: You have given an integer array which contains numbers from 1 to 10 but one number
 is missing, you need to write a Java program to find that missing number in an array.*/

package palakSJun20;

public class ArrayMissingInteger {

	void findArrayMissingInteger(int[] array) {
		System.out.println("Input array is : { 1, 2, 3, 4, 6, 7, 8, 9, 10 } ");
		int expectedSum = 0, actualSum = 0;
		for (int index = 1; index <= 10; index++) {
			expectedSum = expectedSum + index;
		}
		for (int i = 0; i < array.length; i++) {
			actualSum = actualSum + array[i];
		}
		System.out.println("Number missing from 1 to 10 is : " + (expectedSum - actualSum));
	}

	public static void main(String[] args) {
		ArrayMissingInteger arrayMissingInteger = new ArrayMissingInteger();
		int[] array = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
		arrayMissingInteger.findArrayMissingInteger(array);

	}

}
