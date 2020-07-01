package deavinaSJun20;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the first number: ");
		int firstNumber = scanner.nextInt();
		System.out.println("Please enter the second number: ");
		int secondNumber = scanner.nextInt();
		new SwapTwoNumbers().swaptwoNumbers(firstNumber, secondNumber);
		scanner.close();
	}

	void swaptwoNumbers(int firstNumber, int secondNumber) {
		System.out.println("------------------------------------");
		System.out.println("Before Swap:");
		System.out.println("First Number : " + firstNumber);
		System.out.println("Second Number : " + secondNumber);
		// logic for swapping
		firstNumber = firstNumber + secondNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber = firstNumber - secondNumber;
		System.out.println("------------------------------------");
		System.out.println("After Swap:");
		System.out.println("First Number : " + firstNumber);
		System.out.println("Second Number : " + secondNumber);
	}
}
