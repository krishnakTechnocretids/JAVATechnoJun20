/*Find all differ index from given arrays. 
                 i/p:- arr1: {10,2,9,14,3}
                        arr2: {10,2,18,14,13}
                o/p:- Values are not matching at index -> 2
                         Values are not matching at index -> 4*/
package swapnaWJun20;

public class AllDifferArrays {

	void checkIndex(int[] arr1, int[] arr2) {

		int index = 0;
		if (arr1.length == arr2.length) {
			for (index = 0; index < arr1.length; index++) {
				if (arr1[index] != arr2[index]) {
					System.out.println("Values are not matching at index -> " + index);
				}
			}
		} else
			System.out.println("Array are no of equal length. ");
	}

	public static void main(String[] args) {
		int[] arr1 = { 10, 2, 9, 14, 3 };
		int[] arr2 = { 10, 2, 18, 14, 13 };

		AllDifferArrays allDifferArrays = new AllDifferArrays();
		allDifferArrays.checkIndex(arr1, arr2);

	}
}
