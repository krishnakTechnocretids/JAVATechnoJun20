package aadeshJun20;

import java.util.Scanner;


public class FibonacciNumber {

	public static void main(String[] args) {
		int n, firstnum = 1, previousnum = 1;
		System.out.println(" Enter number to be converted in Fabonacci : ");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		System.out.print(" Fibonacci Series is : ");
		System.out.print(firstnum + " " + previousnum);
		for (int i = 1; i <= n - 2; i++) {				
			int sum = firstnum + previousnum;
				firstnum = previousnum;
				previousnum = sum;
				System.out.print(" " + sum);
		}
		scanner.close();
	}

}