
package deavinaSJun20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IdentifyIntegerInput {

	void inputValues() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the count of integers you want to be added: ");
		int totalinputnumbers = scanner.nextInt();
		int[] array = new int[totalinputnumbers];
		int count = 0;

		while (count < totalinputnumbers) {
			try {
				System.out.println("enter input " + (count + 1) + " : ");
				array[count] = scanner.nextInt();
				count++;
			} catch (InputMismatchException e) {
				scanner.next();
				continue;
			}
		}
		System.out.print("\nInteger Values entered by you were --> \n");
		for (int index = 0; index < array.length; index++) {
			System.out.println(array[index]);
		}
		System.out.println("\nThe sum of above integer values is : " + getSumofIntegers(array));
		scanner.close();
	}

	int getSumofIntegers(int[] array) {
		int sum = 0;
		for (int index = 0; index < array.length; index++) {
			sum += array[index];
		}
		return sum;
	}

	public static void main(String[] args) {
		new IdentifyIntegerInput().inputValues();
	}
}
