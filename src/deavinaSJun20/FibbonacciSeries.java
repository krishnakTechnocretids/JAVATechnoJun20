package deavinaSJun20;

import java.util.Scanner;

public class FibbonacciSeries {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter input to display first n Fibonaaci Numbers: ");
		int num = scanner.nextInt();
		new FibbonacciSeries().fibbonacciSeries(num);
		scanner.close();
	}

	private void fibbonacciSeries(int num) {
		int firstnum= 1;
		int secondnum=1;
		System.out.println("Fibbonacci Series for first " + num + " numbers is --->");
		System.out.print(firstnum);
		for (int index = 1; index <= num; index++) {
			System.out.print(" " + secondnum);
			int sum = firstnum + secondnum;
			firstnum = secondnum;
			secondnum = sum;
		}
	}
}
