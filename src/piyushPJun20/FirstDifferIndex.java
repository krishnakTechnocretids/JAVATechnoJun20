/* 
Find first differ index from given arrays. 
i/p :- arr1: {10,2,9,14,3}
arr2: {10,2,18,14,3}
o/p:- Values are not matching at index -> 2
 */
package piyushPJun20;
public class FirstDifferIndex {

	void displayFirstIndex(int[] arr1, int[] arr2) {
		if (arr1.length == arr2.length) {
			for (int index = 0; index < arr1.length; index++) {
				if (arr1[index] != arr2[index]) {
					System.out.println(" Values are not matching at index -> " + index);
					return;
				}
			}
			System.out.println("Values of all Elements in both Array are equal");
		} else {
			System.out.println("Length is 2 Array is not matching");
		}

	}

	public static void main(String[] args) {
		FirstDifferIndex first = new FirstDifferIndex();
		int[] arr1 = { 10, 2, 9, 14, 3 };
		int[] arr2 = { 10, 2, 18, 14, 3 };
		first.displayFirstIndex(arr1, arr2);
	}

}