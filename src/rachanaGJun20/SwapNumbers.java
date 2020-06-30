package rachanaGJun20;

import java.util.Scanner;

public class SwapNumbers {

	// method will perform swapping of two given numbers
	void swapTwoNumbers(int num1, int num2) {

		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("Numbers after swapping: num1 = " + num1 + " num2 = " + num2);
	}

	public static void main(String[] args) {
		SwapNumbers swapnumbers = new SwapNumbers();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter two numbers");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		System.out.println("Given numbers: num1 = " + num1 + " num2 = " + num2);
		swapnumbers.swapTwoNumbers(num1, num2);
		scanner.close();

	}

}
