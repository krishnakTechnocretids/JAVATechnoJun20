/* 
Find max value at differed index.
i/p:- arr1: {10,2,9,14,3}
arr2: {10,2,18,14,3}
o/p :- Values are not matching at index -> 2, From (9,18) max value is 18
*/
package piyushPJun20;
public class MaxValueAtDifferedIndex {

	void displayMaxIndex(int[] arr1, int[] arr2) {
		boolean flag = true;
		if (arr1.length == arr2.length) {
			for (int index = 0; index < arr1.length; index++) {
				if (arr1[index] != arr2[index]) {
					if (arr1[index] > arr2[index]) {
						System.out.println(" Values are not matching at index -> " + index + " , From (" + arr1[index]
								+ "," + arr2[index] + ") max value is " + arr1[index]);
					} else {
						System.out.println(" Values are not matching at index -> " + index + " , From (" + arr1[index]
								+ "," + arr2[index] + ") max value is " + arr2[index]);
					}
					flag = false;
				}
			}
			if (flag)
				System.out.println("Values of all Elements in both Array are equal");
		} else {
			System.out.println("Length is 2 Array is not matching");
		}
	}

	public static void main(String[] args) {
		MaxValueAtDifferedIndex max = new MaxValueAtDifferedIndex();
		int[] arr1 = { 10, 2, 9, 14, 3 };
		int[] arr2 = { 10, 2, 18, 14, 3 };
		max.displayMaxIndex(arr1, arr2);
	}
}