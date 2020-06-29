package swapnaWJun20;

public class MissingNoArray {

	// Searching for missing no in the range
	void checkMissingNo(int arr[]) {
		for (int index = 1; index <= 10; index++) {
			boolean flag = false;
			for (int index1 = 0; index1 < arr.length; index1++) {
				if (index == arr[index1])
					flag = true;
			}
			if (flag == false) {
				System.out.println(index + " is missing");
			}
		}
	}

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
		MissingNoArray missingNoArray = new MissingNoArray();
		missingNoArray.checkMissingNo(arr1);
	}
}
