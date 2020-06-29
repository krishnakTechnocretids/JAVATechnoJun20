/*Find duplicate number on Integer array in Java?*/
package madhuraMJun20.scannerClass;

public class DuplicateNumInArray {
	void findDuplicate(int[] num) {
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j])
					System.out.println(num[i] + " is a duplicate number");
			}
		}
	}

	public static void main(String[] args) {
		DuplicateNumInArray duplicateNumInArray = new DuplicateNumInArray();
		int[] num = { 0, 3, 1, 2, 3 };
		duplicateNumInArray.findDuplicate(num);
	}
}