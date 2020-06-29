package deavinaSJun20;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the number : ");
		int number = scanner.nextInt();
		System.out.println("Entered Number: " + number);
		new ReverseNumber().reverseNumber(number);
		scanner.close();
	}

	void reverseNumber(int num) {
		int temp = num;
		int reverse = 0;
		while (num != 0) {
			temp = num % 10;
			reverse = (reverse * 10) + temp;
			num = num / 10;
		}
		System.out.println("Reversed Number: " + reverse);
	}
}
