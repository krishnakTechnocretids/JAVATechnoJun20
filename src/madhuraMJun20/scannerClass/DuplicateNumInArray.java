/*Find duplicate number on Integer array in Java?*/
package madhuraMJun20.scannerClass;

public class DuplicateNumInArray {
	void findDuplicate(int[] num) {
		for (int index = 0; index < num.length; index++) {
			for (int innerIndex = index + 1; innerIndex < num.length; innerIndex++) {
				if (num[index] == num[innerIndex])
					System.out.println(num[index] + " is a duplicate number");
			}
		}
	}

	public static void main(String[] args) {
		DuplicateNumInArray duplicateNumInArray = new DuplicateNumInArray();
		int[] num = { 0, 3, 1, 2, 3 };
		duplicateNumInArray.findDuplicate(num);
	}
}