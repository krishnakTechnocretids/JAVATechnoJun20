package apurvaJun20;

public class MissingNo {
	private void getMissingNo(int a[], int[] n) {
		int sumArr = 0;
		int totalSum = (n.length * (n.length + 1)) / 2;
		for (int index = 0; index < a.length; index++) {
			sumArr += a[index];
		}
		int missingNum = totalSum - sumArr;
		System.out.println(missingNum + " is missing");
	}

	public static void main(String[] args) {
		MissingNo missingNo = new MissingNo();
		int[] a = { 1, 2, 8, 7, 6, 9, 4, 3, 10 };
		int[] n = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		missingNo.getMissingNo(a, n);
	}

}
