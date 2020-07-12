package madhuraMJun20;

//[3,5,5,11,9,10,13]
public class TreeProgram {
	void findNumOfTrees(int[] arr) {
		int max = arr[0];
		int cnt = 1;
		for (int index = 1; index < arr.length; index++) {
			if (max < arr[index]) {
				cnt++;
				max = arr[index];
			}
		}
		System.out.println(cnt);
	}

	public static void main(String[] args) {
		TreeProgram treeProgram = new TreeProgram();
		int[] arr = { 3, 5, 5, 11, 9, 10, 13 };
		treeProgram.findNumOfTrees(arr);
	}
}