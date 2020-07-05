package amitaRJun20;

import java.util.Arrays;

public class SecondLargestInArray {

	void secondLargestNumber(int[] input) {

		int firstHighest = input[0]; 
		int secondHighest = input[0]; 
		for (int i = 0; i < input.length; i++) {
			if (input[i] > firstHighest) {
				secondHighest = firstHighest; 
				firstHighest = input[i]; 
			} else if (input[i] > secondHighest) {
				secondHighest = input[i]; 
			}
		}
		System.out.println("SecondHighest number is: "+secondHighest);
	}

	public static void main(String[] args) {
		SecondLargestInArray secondLargest = new SecondLargestInArray();
		int[] array = {10,33, 56, 43, 99, 21 };
		secondLargest.secondLargestNumber(array);

	}

}
