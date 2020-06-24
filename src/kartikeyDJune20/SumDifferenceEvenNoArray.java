package kartikeyDJune20;

import java.util.Scanner;
import java.util.function.IntPredicate;

public class SumDifferenceEvenNoArray {

	

	void sumOfEvenNo(int[] input) {
		int sum = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0) {
				sum += input[index];
			}
		}
	}

	void countAndSumOfPositiveAandNegativeNo(int[] input) {
		int sumPositive = 0;
		int sumNegative = 0;
		int cntPositive = 0;
		int cntNegative = 0;
		int diff=0;
		for (int index = 0; index < input.length; index++) {

			if (input[index] <= 0) {
				sumPositive += input[index];
				cntPositive++;

			} else {
				sumNegative += input[index];
				cntNegative++;

			}
		}

		System.out.println("No. of positive no. in the array are: " + cntPositive);
		System.out.println("No. of negative no. in the array are: " + cntNegative);
		diff=sumPositive+sumNegative;
		System.out.println();
		if(diff<0)
			diff=diff+(diff*(-2));
	
		System.out.println("Difference between positive and negative numbers: " +diff);
	}


	public static void main(String[] args) {
		SumDifferenceEvenNoArray sumDifferenceEvenNoArray = new SumDifferenceEvenNoArray();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Provide the size of an aray: ");
		int size = scanner.nextInt();
		if (size <= 0)
			System.out.println("Size cant be zero or -ive: ");
		else {
			System.out.println("Provide the array: ");
			int[] input = new int[size];
			for (int index = 0; index < size; index++) {

				input[index] = scanner.nextInt();
			}

			for (int index = 0; index < size; index++) {
				System.out.println("input[" + index + "]=" + input[index]);
			}

			sumDifferenceEvenNoArray.countAndSumOfPositiveAandNegativeNo(input);
		}
		scanner.close();		
	}
}
