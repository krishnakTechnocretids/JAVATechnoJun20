package anshuKJun20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCaseExample {

	int sum = 0;
	int count = 0;

	int getSumOfFirstThreeNumber() {
		Scanner scanner = new Scanner(System.in);
		while (count < 3) {
			try {
				System.out.println("Enter number here to get sum of first three integer");
				int input = scanner.nextInt();
				if (input > 0) {
					sum += input;
					count++;
				} else {
					System.out.println(" please enter number greater than 0");
				}

			} catch (InputMismatchException ie) {
				System.out.println(" Invalid input ");
				scanner.next();
			}
		}
		scanner.close();
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(" sum of first three integer is : " + new ExceptionCaseExample().getSumOfFirstThreeNumber());
	}
}
