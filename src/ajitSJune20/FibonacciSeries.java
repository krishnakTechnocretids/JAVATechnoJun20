package ajitSJune20;

import java.util.Scanner;

public class FibonacciSeries {

	static void printFibonacci(int n) {
		int previousNumber = 1;
		int nextNumber = 1;
		System.out.println("\nFirst " + n + " elements in fibonacci series are :");
		for (int i = 1; i <= n; ++i) {
			System.out.print(previousNumber + " ");
			int sum = previousNumber + nextNumber;
			previousNumber = nextNumber;
			nextNumber = sum;
		}
	}

	public static void main(String[] args) {
		System.out.print("Enter count upto which Fibonacci series to Print:");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		printFibonacci(n);
		scanner.close();
	}

}