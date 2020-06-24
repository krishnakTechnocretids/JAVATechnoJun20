package deavinaSJun20;

import java.util.Scanner;

public class FrequencyOfNumber {
	public static void main(String[] args) {
		int[] numbers = { 10, 3, 9, -99, 81, 3, -11, 3 };
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the Number to be check -> ");
		int n = scanner.nextInt();
		new FrequencyOfNumber().frequencyOfNumber(n, numbers);
		scanner.close();
	}

	public void frequencyOfNumber(int x, int[] numbers) {
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (x == numbers[i]) {
				count++;
			}
		}
		if (count > 0) {
			System.out.println("Number " + x + " is present in predefined array with frequency " + count);
		} else {
			System.out.println("Number " + x + " is not present in predefined array. ");
		}
	}

}
