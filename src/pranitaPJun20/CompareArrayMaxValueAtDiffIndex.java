/*
 * Program 4: Find max value at differed index.
              i/p:- arr1: {10,2,9,14,3}
                     arr2: {10,2,18,14,3}
              o/p :- Values are not matching at index -> 2, From (9,18) max value is 18
 */
package pranitaPJun20;

public class CompareArrayMaxValueAtDiffIndex {

	public static void main(String[] args) {
		int[] arr1 = { 10, 2, 9, 14, 3 };
		int[] arr2 = { 10, 2, 18, 14, 3 };

		CompareArrayMaxValueAtDiffIndex CompareArrayMaxValueAtDiffIndex = new CompareArrayMaxValueAtDiffIndex();
		CompareArrayMaxValueAtDiffIndex.findMaxValueDifferIndex(arr1, arr2);
	}

	void findMaxValueDifferIndex(int[] input1, int[] input2) {
		if (input1.length == input2.length) {
			for (int index = 0; index < input1.length; index++) {
				if (input1[index] != input2[index]) {
					System.out.println("Values are not matching at index : " + index);
					int max = input1[index];
					if (input2[index] > max)
						max = input2[index];
					System.out.println("From " + input1[index] + "," + input2[index] + " max value is " + max);

				}
			}
		}
	}
}
