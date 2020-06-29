/*Program 1: Find the missing number in integer array of 1 to 10?
Hint: You have given an integer array which contains numbers from 1 to 10 but one number is missing,
 you need to write a Java program to find that missing number in an array.
 */
package shrutiDJun20Assignments;

public class MissingNumberinArr {

	void findMissingNumber(int[] input) {
		int actualsum = 0;
		int expectedsum = 0;
		for (int i = 0; i < input.length; i++) {
			
			expectedsum = ((((input.length)+1)*((input.length+1)+1)/2));
			actualsum = actualsum+input[i];
	
		}
		System.out.println("Missing Number is "+(expectedsum-actualsum));
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 4,6, 9, 8,10,7 };
		//int arr[] = { 1, 2, 3, 4,6, 7, 8, 9, 10 };
		MissingNumberinArr missingNumberinArr = new MissingNumberinArr();
		missingNumberinArr.findMissingNumber(arr);

	}
}
