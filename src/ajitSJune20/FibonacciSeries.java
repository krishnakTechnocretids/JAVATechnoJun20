package ajitSJune20;

import java.util.Scanner;

public class FibonacciSeries {

	static void printFibonacci(int maxNumber) {
		int previousNumber = 1;
		int nextNumber = 1;
		System.out.println("\nFirst " + maxNumber + " elements in fibonacci series are :");
		for (int i = 1; i <= maxNumber; ++i) {
			System.out.print(previousNumber + " ");
			int sum = previousNumber + nextNumber;
			previousNumber = nextNumber;
			nextNumber = sum;
		}
	}

	public static void main(String[] args) {
		System.out.print("Enter Number upto which Fibonacci series to Print:");
		Scanner scanner = new Scanner(System.in);
		int maxNumber = scanner.nextInt();
		printFibonacci(maxNumber);
		scanner.close();
	}

}