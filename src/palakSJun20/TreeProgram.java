package palakSJun20;

import java.util.Arrays;

public class TreeProgram {

	void compare(int[] array) {
		int max = array[0];
		int count = 1;
		for (int index = 0; index < array.length; index++) {
			if (max < array[index]) {
				count++;
				max = array[index];
			}
		}
		System.out.println("Input " + Arrays.toString(array));
		System.out.println("Total Visible Tree  --> " + count);
	}

	public static void main(String[] args) {
		TreeProgram treeProgram = new TreeProgram();
		int[] array = { 3, 5, 5, 11, 9, 99, 10, 13, 12 };
		treeProgram.compare(array);
	}
}
