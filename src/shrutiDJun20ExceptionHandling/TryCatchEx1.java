package shrutiDJun20ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchEx1 {

	void findSumOfNumbers(int requiredInput) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		int[] numArr = new int[requiredInput];

		while (count < requiredInput) {

			try {
				System.out.println("Enter Input:");
				numArr[count] = scanner.nextInt();
				sum += numArr[count];
				count++;
			} catch (InputMismatchException ae) {

				System.out
						.println("Invalid input. Please enter valid input(input should be a number):");
				scanner.next();
			}
		}
		System.out.print("Input entered by user: ");
		for (int index = 0; index < numArr.length; index++) {
			System.out.print(numArr[index] + " ");
		}

		System.out.println("\n" + "Sum of given input--> " + sum);
		scanner.close();
	}

	public static void main(String[] args) {
		TryCatchEx1 tryCatchEx1 = new TryCatchEx1();
		tryCatchEx1.findSumOfNumbers(3);
	}
}
