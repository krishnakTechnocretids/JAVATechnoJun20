package deavinaSJun20;

public class SecondHighestNum {

	public static void main(String[] args) {
		int[] arr = { 10, 33, 56, 43, 99, 21 };
		new SecondHighestNum().getSecondHighestnum(arr);
	}

	void getSecondHighestnum(int[] arr) {
		int firstHighest = arr[0];
		int secondHighest = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > firstHighest) {
				secondHighest = firstHighest;
				firstHighest = arr[index];
			} else if (arr[index] > secondHighest) {
				secondHighest = arr[index];
			}
		}
		System.out.println("Second Highest Number: " + secondHighest);
	}
}
