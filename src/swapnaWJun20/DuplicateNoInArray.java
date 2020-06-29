package swapnaWJun20;

public class DuplicateNoInArray {

	//Checking the duplicate no in an array
	void checkDuplicateNo(int arr[]) {
		for (int index = 0; index < arr.length; index++) {
			for (int index1 = 0; index1 < arr.length; index1++) {
				if (arr[index] == arr[index1] && index != index1)
					System.out.println(arr[index] + " is the duplicate no");
				break;
			}
		}
	}

	public static void main(String[] args) {
		int arr1[] = { 3, 2, 3, 10 };
		DuplicateNoInArray duplicateNoInArray = new DuplicateNoInArray();
		duplicateNoInArray.checkDuplicateNo(arr1);
	}
}
