/*Program 2 : Find first differ index from given arrays. 
                   i/p :- arr1: {10,2,9,14,3}
                          arr2: {10,2,18,14,3}
                   o/p:- Values are not matching at index -> 2 
                   
Program 3: Find all differ index from given arrays. 
                 i/p:- arr1: {10,2,9,14,3}
                        arr2: {10,2,18,14,13}
                o/p:- Values are not matching at index -> 2
                         Values are not matching at index -> 4                  
Program 4: Find max value at differed index.
              i/p:- arr1: {10,2,9,14,3}
                     arr2: {10,2,18,14,3}
              o/p :- Values are not matching at index -> 2, From (9,18) max value is 18
                                        */

package palakSJun20;

public class DifferIndexFromArray {

	// Find first differ index from given arrays.
	void findFirstDifferIndex(int[] array1, int[] array2) {

		if (array1.length == array2.length) {
			for (int i = 0; i < array1.length; i++) {
				if (array1[i] != array2[i]) {
					System.out.println("Values are not matching at index " + i);

				}
			}
		} else
			System.out.println("Array are not equal");
	}

	// Find all differ index from given arrays.
	void findAllDifferIndex(int[] array3, int[] array4) {
		findFirstDifferIndex(array3, array4);
	}

	// Find max value at differed index.
	void findMaxValueAtDifferIndex(int[] array5, int[] array6) {
		if (array5.length == array6.length) {
			for (int i = 0; i < array5.length; i++) {
				int max = array5[i];
				if (array5[i] != array6[i]) {
					if (array6[i] > array5[i]) {
						max = array6[i];
						System.out.println("Values are not matching at index-> " + i + " From (" + array5[i] + ","
								+ array6[i] + ") Max values is " + max);
					}
				}
			}
		} else
			System.out.println("Both Array length are not Equal");
	}

	public static void main(String[] args) {
		DifferIndexFromArray differIndexFromArray = new DifferIndexFromArray();
		int[] array1 = { 10, 2, 9, 14, 3 };
		int[] array2 = { 10, 2, 18, 14, 3 };
		System.out.println("Find first differ index from given arrays Output : ");
		differIndexFromArray.findFirstDifferIndex(array1, array2);
		System.out.println("---------------------------------------------");

		int[] array3 = { 10, 2, 9, 14, 3 };
		int[] array4 = { 10, 2, 18, 14, 13 };
		System.out.println("Find all differ index from given arrays Output : ");
		differIndexFromArray.findAllDifferIndex(array3, array4);
		System.out.println("----------------------------------------------");

		int[] array5 = { 10, 2, 9, 14, 3 };
		int[] array6 = { 10, 2, 18, 14, 3 };
		System.out.println("Find max value at differed index Output : ");
		differIndexFromArray.findMaxValueAtDifferIndex(array5, array6);
	}

}
