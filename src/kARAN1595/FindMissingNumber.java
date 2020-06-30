package kARAN1595;

public class FindMissingNumber {

	void displayMissingNumber(int[] array) {
		boolean flag;

		for (int innerIndex = 1; innerIndex <= 10; innerIndex++) {
			flag = true;
			for (int outerIndex = 0; outerIndex < array.length; outerIndex++) {
				if (innerIndex == array[outerIndex]) {
					flag = true;
					break;
				} else {
					flag = false;
				}
			}
			if (flag != true) {
				System.out.println("missing number is:" + innerIndex);
			}
		}

	}

	public static void main(String[] args) {
		FindMissingNumber missingNumber = new FindMissingNumber();
		int[] array = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
		missingNumber.displayMissingNumber(array);
	}

}
