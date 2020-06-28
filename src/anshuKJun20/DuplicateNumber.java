package anshuKJun20;

public class DuplicateNumber {
	void findDuplicateNumber(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count = arr[i];
				}
			}
		}
		System.out.println("Duplicate number in this array is " + count);
	}

	public static void main(String[] args) {
		DuplicateNumber duplicatenumber = new DuplicateNumber();
		int[] arr = { 1, 2, 3, 4, 5, 3 };
		duplicatenumber.findDuplicateNumber(arr);
	}
}
