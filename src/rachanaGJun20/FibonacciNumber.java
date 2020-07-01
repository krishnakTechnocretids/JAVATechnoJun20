package rachanaGJun20;

import java.util.Scanner;

public class FibonacciNumber {

	// method will display Fibonacci series till given n limit
	void displayfibonacciNumbers(int limit) {

		int start = 0;
		int previousNum = 1;
		int nextNum = 1;

		for (int index = 1; index <= limit; index++) {
			System.out.print(" " + nextNum);
		
			nextNum = start + previousNum;
			start = previousNum;
			previousNum = nextNum;
		}
	}

	public static void main(String[] args) {
		FibonacciNumber fibonaccinumber = new FibonacciNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter how many numbers you want:");
		int limit = scanner.nextInt();
		fibonaccinumber.displayfibonacciNumbers(limit);
		scanner.close();
	}
}
