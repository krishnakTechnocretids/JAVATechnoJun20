package shrutiDJun20;

public class FindAllDiff {

	void findDiffInArr(int[] arr1, int[] arr2) {
		int temp = 0;
		boolean flag = true;
		if (arr1.length == arr2.length) {
			for (int index = 0; index < arr1.length; index++) {
				if (arr1[index] != arr2[index]) {
					temp = index;
					flag = false;
					System.out.println("Values are not matching at index ->"
							+ temp);
				}

			}
		} else {
			System.out
					.println("Array length is not equal, so cannot be compared");
			return;
		}
		if (flag == true) {
			System.out.println("Both the arrays are equal");

		}
	}

	public static void main(String[] args) {
		FindAllDiff findAllDiff = new FindAllDiff();
		// int[] arr1={10,2,9,14,3};
		// int[] arr2={10,2,18,14,13};

		int[] arr1 = { 10, 2, 1, 2, 3 };
		int[] arr2 = { 10, 2, 18, 14, 13 };
		findAllDiff.findDiffInArr(arr1, arr2);
	}
}
