package abhishekSJun20;
/*Program 4: Find max value at differed index.
	i/p:- arr1: {10,2,9,14,3}
	       arr2: {10,2,18,14,3}
	o/p :- Values are not matching at index -> 2, From (9,18) max value is 18 */

public class MaxDiffValueInArray {
	void mainLogic(int[] arr1, int[] arr2) {
		for (int index = 0; index < arr1.length; index++) {
			if (arr1[index] != arr2[index]) {
				if (arr1[index] > arr2[index])
					System.out.println("Values are not matching at index -> " + index + ", From (" + arr1[index] + ","+ arr2[index] + ") max value is" + arr1[index]);
				else
					System.out.println("Values are not matching at index -> " + index + ", From (" + arr1[index] + ","+ arr2[index] + ") max value is" + arr2[index]);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 10, 2, 9, 14, 3 };
		int[] arr2 = { 10, 2, 18, 14, 3 };
		MaxDiffValueInArray diffInArray = new MaxDiffValueInArray();
		diffInArray.mainLogic(arr1, arr2);
	}
}
