package piyushPJun20;
public class DuplicateNum {

	void displayDuplicate(int[] intArr) {

		System.out.print(" Duplicated Number is : ");
		for (int i = 0; i < intArr.length; i++) {
			for (int j = i + 1; j < intArr.length; j++) {
				if (intArr[i] == intArr[j]) {
					System.out.println(intArr[i]);

				}
			}
		}
	}

	public static void main(String[] args) {
		DuplicateNum duplicate = new DuplicateNum();
		int[] intArr = { 0, 3, 1, 2, 3 };
		duplicate.displayDuplicate(intArr);
	}
}