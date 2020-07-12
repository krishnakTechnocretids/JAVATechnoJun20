package palakSJun20;

import java.util.Arrays;

public class TreeProgram {
	int count = 0;
	void compare(int[] array) {
		for (int index = 0; index < array.length-1; index++) {
			if (array[index] < array[index+1]) {
				count++;
			}
		}
		System.out.println(Arrays.toString(array) + " --> " +count);
	}
	public static void main(String[] args) {
		TreeProgram treeProgram = new TreeProgram();
		int[] array = {3,5,5,11,9,10,13,12};
		treeProgram.compare(array);
	}
}
