
/*Program 2: Find first differ index from given arrays. 
                   i/p :- arr1: {10,2,9,14,3}
                            arr2: {10,2,18,14,3}
                   o/p:- Values are not matching at index -> 2
 */
package kARAN1595;

public class DifferIndex {
	void differIndex(int[] numberArray1, int[] numberArray2) {
		if (numberArray1.length == numberArray2.length) {
			for (int index = 0; index < numberArray1.length; index++) {
				if (numberArray1[index] != numberArray2[index]) {
					System.out.println("Values are not matching at index :" + index);
				}

			}

		}

	}

	public static void main(String[] args) {
		DifferIndex differ = new DifferIndex();

		int[] numberArray1 = {10,2,9,14,3 };
		int[] numberArray2 = { 10,2,18,14,3 };

		differ.differIndex(numberArray1, numberArray2);

	}

}
