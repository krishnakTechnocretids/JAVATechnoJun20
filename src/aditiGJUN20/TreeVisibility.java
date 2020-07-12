package aditiGJUN20;

import java.util.Arrays;

public class TreeVisibility {

	void displayTree(int[] tree) {
		int count = 1, max = tree[0];
		for (int index = 1; index < tree.length; index++) {
			if (tree[index] > max) {
				count++;
				max = tree[index];
			}
		}
		System.out.println(Arrays.toString(tree) + "-> " + count);
	}

	public static void main(String[] args) {
		TreeVisibility treeVisibility = new TreeVisibility();
		int[] tree = { 3, 5, 5, 11, 9, 99, 10, 13 };
		treeVisibility.displayTree(tree);
	}
}
