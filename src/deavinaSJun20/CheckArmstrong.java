package deavinaSJun20;

import java.util.Scanner;

public class CheckArmstrong {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the number : ");
		int number = scanner.nextInt();
		System.out.println("Entered Number: " + number);
		new CheckArmstrong().checkArmstrongNumber(number);
		scanner.close();
	}

	void checkArmstrongNumber(int num) {
		int temp = 0;
		int num1 = num;
		int sum = 0;
		while (num != 0) {
			temp = num % 10;
			sum = sum + (temp * temp * temp);
			num = num / 10;
		}
		if (sum == num1)
			System.out.println(num1+" is an armstrong number");
		else
			System.out.println(num1+" is not an armstrong number");
	}
}
