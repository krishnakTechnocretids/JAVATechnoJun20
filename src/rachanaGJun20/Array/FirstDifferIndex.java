/*Program 2: Find first differ index from given arrays. 
                   i/p :- arr1: {10,2,9,14,3}
                            arr2: {10,2,18,14,3}
                   o/p:- Values are not matching at index -> 2*/

package rachanaGJun20.Array;

public class FirstDifferIndex {

	void findFirstDifferIndex(int[] arr1, int[] arr2) {

		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (!(arr1[i] == arr2[i])) {
					System.out.println("values are not matching at index -> " + i);
					break;
				}
			}
		} else
			System.out.println("Arrays are not identical");
	}

	public static void main(String[] args) {
		FirstDifferIndex firstdifferindex = new FirstDifferIndex();
		int[] arr1 = { 10, 2, 9, 14, 3 };
		int[] arr2 = { 10, 2, 18, 14, 3,};
		firstdifferindex.findFirstDifferIndex(arr1, arr2);
	}

}
