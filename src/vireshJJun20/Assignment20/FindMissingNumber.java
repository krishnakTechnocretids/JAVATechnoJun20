/*
 Program 1 Find the missing number in integer array of 1 to 10
Hint You have given an integer array which contains numbers from 1 to 10 but one number is missing, you need to write a Java program to find that missing number in an array.

Program 2 Find duplicate number on Integer array in Java
Hint There is exactly one number is repeated in the array. You need to write a program to
find that duplicate number. For example, if an array with length 6 contains numbers {0, 3, 1, 2, 3	}, then duplicated number is 3.
 */

package vireshJJun20.Assignment20;

public class FindMissingNumber {

	void searchMissingNumber(int[] input, int total) {
		int sum = 0;
		if (input.length < 10) {
			for (int i = 0; i < input.length; i++) {
				sum = sum + input[i];
			}
			int missingNum = total - sum;
			System.out.println("The missing number in between 1-10 is: " + missingNum);
		} else {
			System.out.println("The given array contains all 1-10 numbers.");
		}
	}

	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };
		int sumOfAll = 55;
		System.out.println("Input Array: { 1, 2, 3, 5, 6, 7, 8, 9, 10 }");
		new FindMissingNumber().searchMissingNumber(input, sumOfAll);

	}
}
