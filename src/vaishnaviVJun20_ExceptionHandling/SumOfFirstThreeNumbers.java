package vaishnaviVJun20_ExceptionHandling;

import java.util.Arrays;
import java.util.InputMismatchException;

/* WAP to get first 3 numbers from user. Print 3 numbers and their sum.(Use exception handling concept. )
Note : User may enter wrong inputs, make sure program should not break.

Input :
10
TechnoCredits
2tech3
30
40
Output : values are 10,30,40 and total is 80 */

import java.util.Scanner;

public class SumOfFirstThreeNumbers {
	Scanner scanner = new Scanner(System.in);
	int count = 0, sum = 0;
	int[] array = new int[3];

	void getSumOfFirstThreeNumbers() {
		System.out.println("Please enter numbers to add: ");
		do {
			try {
				array[count] = scanner.nextInt();
				sum += array[count];
				count++;
			} catch (InputMismatchException ie) {
				System.out.println("Please enter a valid integer number");
				scanner.next();
			}
		} while (count <= 2);
		System.out.println("Output: Values are " + Arrays.toString(array).replace("[", "").replace("]", "")
				+ " and total is: " + sum);
	}

	public static void main(String[] args) {
		new SumOfFirstThreeNumbers().getSumOfFirstThreeNumbers();
	}

}
