package aadeshJun20;

public class Test3 {

	public void printPairs(int arr[], int n, int sum) {
		for (int i = 0; i < n; i++)
			for (int j = 1 + i; j < n; j++)
				if (arr[i] + arr[j] == sum)
					System.out.println("(" + arr[i] + ", " + arr[j] + ")");
	}

	public static void main(String[] args) {
		Test3 test3 = new Test3();
		int arr[] = { 2, 4, 3, 5, 7, 8, 9, -1 };
		int n = arr.length;
		int sum = 7;
		test3.printPairs(arr, n, sum);
		System.out.println("Array pair of sum 7");
	}
}
