package amitaRJun20;

import java.util.Arrays;

public class SecondLargestInArray {

	void secondLargestNumber(int[] input) {

		int firstHighest = input[0];
		int secondHighest = input[1];
		int temp = 0;
		for (int i = 2; i < input.length; i++) {
			if (input[i] > secondHighest) {
				secondHighest = input[i];
			}

			if (secondHighest > firstHighest) {
				temp = firstHighest;
				firstHighest = secondHighest;
				secondHighest = temp;
			}
		}
		System.out.println(secondHighest);

	}

	public static void main(String[] args) {
		SecondLargestInArray secondLargest = new SecondLargestInArray();
		int[] array = {10, 33, 56, 43, 99, 21 };
		secondLargest.secondLargestNumber(array);

	}

}
