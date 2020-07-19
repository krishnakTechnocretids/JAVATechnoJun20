package shrutiDJun20ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchEx1 {

	void findSumOfNumbers() {
		Scanner scanner = new Scanner(System.in);
		int count = 1;
		int sum = 0;
		while (count <= 3)
			try {
				System.out.println("Enter Input" + count + ":");
				int number = scanner.nextInt();
				if (number >= 0 || number < 0) {
					count++;
					sum += number;
				}
			} catch (InputMismatchException ae) {

				System.out
						.println("Invalid input. Please enter valid input(input should be a number):");
				scanner.next();
			}
		System.out.println("Sum of given input--> " + sum);
		scanner.close();
	}

	public static void main(String[] args) {
		TryCatchEx1 tryCatchEx1 = new TryCatchEx1();
		tryCatchEx1.findSumOfNumbers();
	}
}
