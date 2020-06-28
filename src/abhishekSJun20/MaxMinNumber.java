package abhishekSJun20;

import java.util.Scanner;

public class MaxMinNumber {
	void maxNumber(int[] input) {
		int max = input[0];
		int x = input.length;
		System.out.println(x);
		for (int index = 1; index < input.length; index++) {
			if (input[index] > max) {
				max = input[index];
			}
		}
		System.out.println("The Maximum number is :" + max);
	}

	void minNumber(int[] input) {
		int min = input[0];
		for (int index = 1; index < input.length; index++) {
			if (input[index] < min) {
				min = input[index];
			}
		}
		System.out.println("The Minimum number is :" + min);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many elements you consider in Array?");
		int size = scanner.nextInt();
		int[] number = new int[size];
		for (int index = 0; index < number.length; index++) {
			System.out.println("enter the number :" + (index + 1));
			number[index] = scanner.nextInt();
		}

		MaxMinNumber maxMinNumber = new MaxMinNumber();
		maxMinNumber.maxNumber(number);
		maxMinNumber.minNumber(number);
		scanner.close();

	}
}
