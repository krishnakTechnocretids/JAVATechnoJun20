/* Program 1: Swap two numbers without using third variable.
Input: num1= 10, num2 =20
output: num1=20, num2 =10 */
package jagadeeshMJun20;

import java.util.Scanner;

public class SumNumbers {
	private int number1;
	private int number2;

	void getNumbers(int num1, int num2) {
		number1 = num1;
		number2 = num2;
		displaySum();
	}

	private void displaySum() {
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		System.out.println("Output: " + number1 + ", " + number2);

	}

	public static void main(String[] agrs) {
		SumNumbers sumNumbers = new SumNumbers();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		sumNumbers.getNumbers(num1, num2);
		scanner.close();
	}
}
