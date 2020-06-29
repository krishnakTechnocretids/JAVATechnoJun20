/*Program 4: Find max value at differed index.
              i/p:- arr1: {10,2,9,14,3}
                     arr2: {10,2,18,14,3}
              o/p :- Values are not matching at index -> 2, From (9,18) max value is 18
		*/
package rachanaGJun20.Array;

public class MaxAtDifferedIndex {

	void findMaxAtDifferedIndex(int[] arr1, int[] arr2) {

		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (!(arr1[i] == arr2[i])) {
					if (arr1[i] > arr2[i]) {
						System.out.println("values are not matching at index -> " + i + ", from (" + arr1[i] + ","
								+ arr2[i] + ") " + "max value is " + arr1[i]);
						break;
					} else {
						System.out.println("values are not matching at index -> " + i + ", from (" + arr1[i] + ","
								+ arr2[i] + ") " + "max value is " + arr2[i]);
						break;
					}
				}
			}
		} else
			System.out.println("Arrays are not identical");
	}

	public static void main(String[] args) {
		MaxAtDifferedIndex maxatdifferedindex = new MaxAtDifferedIndex();
		int[] arr1 = { 10, 2, 9, 14, 3 };
		int[] arr2 = { 10, 2, 18, 14, 3, };
		maxatdifferedindex.findMaxAtDifferedIndex(arr1, arr2);

	}

}
