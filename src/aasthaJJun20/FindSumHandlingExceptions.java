/*Assignment 31 : 19th July 2020
WAP to get first 3 numbers from user. Print 3 numbers and their sum.(Use exception handling concept. )
Note : User may enter wrong inputs, make sure program should not break.

Input :
10
TechnoCredits
2tech3
30
40
Output : values are 10,30,40 and total is 80*/

package aasthaJJun20;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FindSumHandlingExceptions {
	public void displaySumOfEnteredNumbers(int requiredIntegers) {
		Scanner scanner = new Scanner(System.in);
		int[] input = new int[requiredIntegers];
		int count = 0, sum = 0;
		while (count < requiredIntegers) {
			System.out.print("Enter number : ");
			try {
				input[count] = scanner.nextInt();
				sum += input[count];
				count++;
			} catch (InputMismatchException inputMismatchException) {
				scanner.next();
			}
		}
		System.out.println("Output : values are " + Arrays.toString(input).replace("[", "").replace("]", "")
				+ " and total is " + sum);
		scanner.close();
	}

	public static void main(String[] args) {
		new FindSumHandlingExceptions().displaySumOfEnteredNumbers(3);
	}
}
