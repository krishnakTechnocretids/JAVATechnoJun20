package rachanaGJun20.Array;

import java.util.Scanner;

public class ArraySum {

	int sumOfEvenNumber(int[] num) {		// Method will calculate even numbers sum from the given array and return sum.

		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0)
				sum = sum + num[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		ArraySum arraysum = new ArraySum();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter how many numbers you want");
		int size = scanner.nextInt();
		System.out.println("Please enter numbers");
		int[] numbers = new int[size];
		for (int i = 0; i < size; i++) {
			numbers[i] = scanner.nextInt();
		}
		System.out.println("Sum of the even numbers from the given array is:" + arraysum.sumOfEvenNumber(numbers));
		scanner.close();
	}

}
