package swapnaWJun20;

public class TreeVisible {

	void visibleTreesCount(int inp[]) {
		int max = inp[0];
		int count = 1;
		for (int index = 1; index < inp.length; index++) {
			if (max < inp[index]) {
				count++;
				max = inp[index];
			}
		}
		System.out.println("Total visible trees : " + count);
	}

	public static void main(String[] args) {
		// int inp[] = { 3, 5, 5, 11, 9, 10, 13 };
		int inp[] = { 3, 9, 5, 11, 9, 10, 13 };

		TreeVisible treeVisible = new TreeVisible();
		treeVisible.visibleTreesCount(inp);
	}
}