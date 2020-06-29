/*Program 1: Find the missing number in integer array of 1 to 10?
Hint: You have given an integer array which contains numbers from 1 to 10 but one number is missing,
 you need to write a Java program to find that missing number in an array.*/
package rachanaGJun20.Array;

public class MissingNumberInArray {

	// method will calculate sum of digits from 1 to 10;
	int SumOf1To10() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		return sum;
	}

	// method will find missing number between 1 to 10
	void findMissingNumberInArray(int[] arr) {
		int sumOfGivenArray = 0;
		for (int i = 0; i < arr.length; i++) {
			sumOfGivenArray = sumOfGivenArray + arr[i];
		}
		System.out.println("Missing number is: " + (SumOf1To10() - sumOfGivenArray));
	}

	public static void main(String[] args) {
		MissingNumberInArray missingnumberinarray = new MissingNumberInArray();
		int[] arr = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		System.out.println("Given Array is : { 1, 2, 3, 4, 6, 7, 8, 9, 10 }; ");
		missingnumberinarray.findMissingNumberInArray(arr);

	}

}
