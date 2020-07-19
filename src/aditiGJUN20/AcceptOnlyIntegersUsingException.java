/*
 * WAP to get first 3 numbers from user. Print 3 numbers and their sum.(Use exception handling concept. )
 * Note : User may enter wrong inputs, make sure program should not break.
 * Input :
 * 10
 * TechnoCredits
 * 2tech3
 * 30
 * 40
 * Output : values are 10,30,40 and total is 80
 */

package aditiGJUN20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AcceptOnlyIntegersUsingException {
	static Scanner scanner = new Scanner(System.in);

	void acceptIntegers(int expectedIntCount) {
		int[] integerArray = new int[expectedIntCount];
		int intCount = 0, sum = 0;
		while (intCount < expectedIntCount) {
			System.out.println("Enter integer: ");
			try {
				integerArray[intCount] = scanner.nextInt();
				sum += integerArray[intCount];
				intCount++;
			} catch (InputMismatchException inputMismatchException) {
				System.out.println("INVALID Input - Please enter numeric value.");
				scanner.next();
			}
		}
		System.out.println("\nEntered numbers are: ");
		for (int index = 0; index < integerArray.length; index++) {
			System.out.print(integerArray[index] + "  ");
		}
		System.out.println("\nSum of all input numbers is: " + sum);

	}

	public static void main(String[] args) {

		System.out.println("For how many integers user wants to perform Addition?");
		int expectedIntCount = scanner.nextInt();
		new AcceptOnlyIntegersUsingException().acceptIntegers(expectedIntCount);
		scanner.close();
	}
}
