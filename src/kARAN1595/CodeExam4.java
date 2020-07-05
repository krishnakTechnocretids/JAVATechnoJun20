package kARAN1595;

public class CodeExam4 {

	public static void main(String[] args) {

		int arr[] = { 10, 33, 56, 43, 99, 21 };
		int largest = arr[0];
		int secondLargest = arr[0];

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > largest) {
				secondLargest = largest;
				largest = arr[index];
			} else if (arr[index] > secondLargest) {
				secondLargest = arr[index];
			}
		}
		System.out.println("Second largest number is:" + secondLargest);
	}
}
