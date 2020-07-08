package kARAN1595;

public class CodeExam4 {

	public static void main(String[] args) {

		int array[] = { 10, 33, 56, 43, 99, 21 };
		int largest = array[0];
		int secondLargest = array[0];

		for (int index = 0; index < array.length; index++) {
			if (array[index] > largest) {
				secondLargest = largest;
				largest = array[index];
			} else if (array[index] > secondLargest) {
				secondLargest = array[index];
			}
		}
		System.out.println("Second largest number is:" + secondLargest);
	}
}
