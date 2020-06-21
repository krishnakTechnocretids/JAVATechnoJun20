package kartikeyDJune20;

import java.util.Scanner;

public class ArrayGreatestAndSmallest {

	void greatestSmallest(int[] input) {

		int smallestno = input[0];
		int greatestno = input[0];
		for (int index = 0; index < input.length; index++) {
			if (smallestno > input[index])
				smallestno = input[index];

			if (greatestno < input[index])
				greatestno = input[index];

		}

		System.out.println("Gretest number in the given array is: " + greatestno);
		System.out.println("Smallest number in the given array is: " + smallestno);
	}

	public static void main(String[] args) {
		ArrayGreatestAndSmallest arrayGreatestAndSmallest = new ArrayGreatestAndSmallest();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Provide the size of an array: ");
		int size = scanner.nextInt();

		if (size <= 0)
			System.out.println("Size of array should be greater than zero....");
		else {

			int[] input = new int[size];

			for (int index = 0; index < size; index++) {

				input[index] = scanner.nextInt();
			}
			System.out.println("\n" + "Provided array is: ");
			for (int index = 0; index < size; index++) {
				System.out.println("input[" + index + "]= " + input[index]);
			}

			arrayGreatestAndSmallest.greatestSmallest(input);

		}
	}

}
