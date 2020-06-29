package anshuKJun20;

public class DuplicateNumber {

	void findDuplicateNumber(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicate number in this array is " + arr[i]);
				       break;
					}
			}
		}
	}

	public static void main(String[] args) {
		DuplicateNumber duplicatenumber = new DuplicateNumber();
		int[] arr = { 1, 2, 3, 4, 5, 3 };
		duplicatenumber.findDuplicateNumber(arr);
	}
}
