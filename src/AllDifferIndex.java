/* 
 Find all differ index from given arrays. 
i/p:- arr1: {10,2,9,14,3}
arr2: {10,2,18,14,13}
o/p:- Values are not matching at index -> 2
Values are not matching at index -> 4
*/

public class AllDifferIndex {

	void displayIndex(int[] arr1, int[] arr2) {
		boolean flag = true;
		if (arr1.length == arr2.length) {
			for (int index = 0; index < arr1.length; index++) {
				if (arr1[index] != arr2[index]) {
					System.out.println(" Values are not matching at index -> " + index);
					flag = false;
				}
			}
			if (flag)
				System.out.println(" Values of all Elements in both Array are equal");
		} else {
			System.out.println(" Length is 2 Array is not matching");
		}
	}

	public static void main(String[] args) {
		AllDifferIndex differ = new AllDifferIndex();
		int[] arr1 = { 10, 2, 9, 14, 3 };
		int[] arr2 = { 10, 2, 18, 14, 13 };
		differ.displayIndex(arr1, arr2);
	}

}