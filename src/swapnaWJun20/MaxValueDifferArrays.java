/*
 * 	Program 4: Find max value at differed index.
				  i/p:- arr1: {10,2,9,14,3}
						 arr2: {10,2,18,14,3}
				  o/p :- Values are not matching at index -> 2, From (9,18) max value is 18

 */

package swapnaWJun20;

public class MaxValueDifferArrays {

	void maxValueIndex(int[] arr1, int[] arr2) {

		int index = 0;
		if (arr1.length == arr2.length) {
			for (index = 0; index < arr1.length; index++) {
				if (arr1[index] != arr2[index]) {
					if (arr1[index] > arr2[index])
						System.out.println("Values are not matching at index -> " + index + ". Max value From ("
								+ arr1[index] + "," + arr2[index] + ") is : " + arr1[index]);
					else
						System.out.println("Values are not matching at index -> " + index + ". Max value From ("
								+ arr1[index] + "," + arr2[index] + ") is : " + arr2[index]);
				}
			}
		} else
			System.out.println("Array are no of equal length. ");
	}

	public static void main(String[] args) {
		int[] arr1 = { 10, 2, 9, 14, 3 };
		int[] arr2 = { 10, 2, 18, 14, 3 };

		MaxValueDifferArrays maxValueDifferArrays = new MaxValueDifferArrays();
		maxValueDifferArrays.maxValueIndex(arr1, arr2);
	}
}