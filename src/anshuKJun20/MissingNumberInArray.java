package anshuKJun20;

public class MissingNumberInArray {
	void findMissingNumber(int[] arr) {
		int sumofarrayterm = 0, sumofallterm = 0, diff = 0;
		int length = arr.length + 1;
		sumofallterm = (length * (length + 1)) / 2;
		for (int i = 0; i < arr.length; i++) {
			sumofarrayterm += arr[i];
		}
		diff = sumofallterm - sumofarrayterm;
		System.out.println(diff + " is missing in this number.");
	}

	public static void main(String[] args) {
		MissingNumberInArray missingnumber = new MissingNumberInArray();
		int[] arr = { 1, 3, 2, 4, 5, 7, 9, 8, 10 };
		missingnumber.findMissingNumber(arr);
	}
}
