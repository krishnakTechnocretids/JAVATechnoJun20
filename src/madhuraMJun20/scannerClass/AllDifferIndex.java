package madhuraMJun20.scannerClass;

/* Find all differ index from given arrays. 
                 i/p:- arr1: {10,2,9,14,3}
                        arr2: {10,2,18,14,13}
                o/p:- Values are not matching at index -> 2
                         Values are not matching at index -> 4
*/
public class AllDifferIndex {
	void allDiffer(int[] arr1, int[] arr2) {
		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					System.out.println("Values are not matching at index -> " + i);
				}

			}
		} else
			System.out.println("Arrays are not equal");
	}

	public static void main(String[] args) {
		AllDifferIndex allDifferIndex = new AllDifferIndex();
		int[] arr1 = { 10, 2, 9, 14, 3 };
		int[] arr2 = { 10, 2, 18, 14, 13 };
		allDifferIndex.allDiffer(arr1, arr2);

	}
}
