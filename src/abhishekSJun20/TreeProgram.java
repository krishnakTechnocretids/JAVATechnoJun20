package abhishekSJun20;

public class TreeProgram {
	void TreeCount() {
		int a[] = { 3, 5, 5, 11, 9, 10, 13 };
		int max = a[0], count = 1;
		for (int index = 0; index < a.length; index++) {
			if (a[index] > max) {
				max = a[index];
				count++;
			}
		}
		System.out.println("Total tree count : " + count);
	}

	public static void main(String[] args) {
		TreeProgram treeProgram = new TreeProgram();
		treeProgram.TreeCount();
	}
}