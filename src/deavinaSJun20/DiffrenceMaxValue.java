package deavinaSJun20;

public class DiffrenceMaxValue {

	public static void main(String[] args) {

		int[] arr1 = { 10, 2, 9, 14, 3 };
		int[] arr2 = { 10, 2, 18, 14, 13 };
		new DiffrenceMaxValue().DifferenceIndexMaxValue(arr1, arr2);
	}

	public void DifferenceIndexMaxValue(int[] arr1, int[] arr2) {
		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr2[i] != arr1[i]) {
					System.out.println("Values are not matching at index -> " + i);
					System.out.println(
							"from (" + arr1[i] + "," + arr2[i] + ") max value is " + Math.max(arr1[i], arr2[i]));
				}
			}
		} else {
			System.out.println("Arrays are not having same length");
		}
	}
}
