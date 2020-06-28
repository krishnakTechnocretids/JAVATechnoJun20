package apurvaJun20;

public class Test3 {

	void printPairs(int arr[], int n, int sum) {
		int count = 0;
		for (int index = 0; index < n; index++)
			for (int j = index + 1; j < n; j++)
				if (arr[index] + arr[j] == sum)
					System.out.println("(" + arr[index] + "," + arr[j] + ")");

	}

	public static void main(String[] arg) {
		Test3 test3 = new Test3();
		int arr[] = { 2, 4, 3, 5, 7, 8, 9, -1 };
		int n = arr.length;
		int sum = 7;
		test3.printPairs(arr, n, sum);
	}

}
