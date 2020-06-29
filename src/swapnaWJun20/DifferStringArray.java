package swapnaWJun20;

public class DifferStringArray {

	void checkIndex(String[] arr1, String[] arr2) {

		int index = 0;
		if (arr1.length == arr2.length) {
			for (index = 0; index < arr1.length; index++) {
				if (!arr1[index].equals(arr2[index])) {
					System.out.println("Values are not matching at index -> " + index + " [arr1 value is " + arr1[index]
							+ ", arr2 value is " + arr2[index] + "]");
				}
			}
		} else
			System.out.println("Array are no of equal length. ");
	}

	public static void main(String[] args) {
		String[] arr1 = { "Maulik", "Harsh", "Krishna", "Technocredits" };
		String[] arr2 = { "Maulik", "Harsh", "Technocredits", "Krishna" };

		DifferStringArray differStringArray = new DifferStringArray();
		differStringArray.checkIndex(arr1, arr2);
	}
}