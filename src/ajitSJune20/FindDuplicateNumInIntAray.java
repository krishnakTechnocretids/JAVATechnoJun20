//Find duplicate number on Integer array in Java?  Example : {0, 3,1, 2, 3}, then duplicated number is 3.
package ajitSJune20;

public class FindDuplicateNumInIntAray {

	int getDuplicateNumInArray(int[] array) {
		int dupNum = -1;
		for (int index1 = 0; index1 < array.length; index1++) {
			for (int index2 = (index1 + 1); index2 < array.length; index2++) {
				if (array[index1] == array[index2]) {
					dupNum = array[index2];
					break;
				}
			}
		}
		return dupNum;
	}

	public static void main(String[] args) {
		FindDuplicateNumInIntAray findDuplicateNumInIntAray = new FindDuplicateNumInIntAray();

		int[] array = { 0, 3, 1, 2, 3 };
		System.out.println("Duplicates to be Find in Array:{0,3,1,2,3}");

		int result = findDuplicateNumInIntAray.getDuplicateNumInArray(array);
		if (result >= 0)
			System.out.println("\nDuplicate number is " + result);
		else
			System.out.println("\nNo duplicate element found in Array");
	}
}
