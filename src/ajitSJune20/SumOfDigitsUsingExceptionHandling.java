package ajitSJune20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfDigitsUsingExceptionHandling {

	void displaySumOfDigits() {
		Scanner scanner = new Scanner(System.in);
		int count = 1, sum = 0;
		while (count <= 3) {
			System.out.println("Please enter number " + count + ": ");
			try {
				sum += scanner.nextInt();
				count++;
			} catch (InputMismatchException Ie) {
				System.out.println("Invalid Input: Please enter Numeric Value");
				scanner.next();
			}
		}
		System.out.println("Result===> Sum of 3 Digits is: " + sum);
		scanner.close();
	}

	public static void main(String[] args) {
		new SumOfDigitsUsingExceptionHandling().displaySumOfDigits();
	}
}