package abhishekSJun20;
/*Program 3: Find all differ index from given arrays. 
                 i/p:- arr1: {10,2,9,14,3}
                        arr2: {10,2,18,14,13}
                o/p:- Values are not matching at index -> 2
                         Values are not matching at index -> 4 */
public class DifferIndexInArray {
	// Print all the differ index in the given array
	void allDifferIndex(int[] numberArray1, int[] numberArray2) {

		if (numberArray1.length == numberArray2.length) {
			for (int index = 0; index < numberArray2.length; index++) {
				if (numberArray1[index] != numberArray2[index])
					System.out.println("Values are not matching at index -> " + index);
			}
		} else
			System.out.println("Array size is not identical");
	}

	public static void main(String[] args) {
		DifferIndexInArray allDifferIndexInArray = new DifferIndexInArray();

		int[] numberArray1 = { 1, 2, 3, 4, 5, 6 };
		int[] numberArray2 = { 1, 2, 5, 4, 7, 6 };

		allDifferIndexInArray.allDifferIndex(numberArray1, numberArray2);
	}
}