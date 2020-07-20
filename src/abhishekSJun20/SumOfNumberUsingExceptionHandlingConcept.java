package abhishekSJun20;
/*
  WAP to get first 3 numbers from user. Print 3 numbers and their sum.(Use exception handling concept. )
Note : User may enter wrong inputs, make sure program should not break.
Input :
10
TechnoCredits
2tech3
30
40
Output : values are 10,30,40 and total is 80*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfNumberUsingExceptionHandlingConcept {

	void displaySumofDigits() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int count = 1, sum = 0;
		while (count <= 3) {
			System.out.println("Please enter number " + count + ": ");
			try {
				sum += scanner.nextInt();
				count++;
			} catch (InputMismatchException Ie) {
				System.out.println("Invalid Input: Please enter Numeric Value");
				scanner.next();
			}
		}
		System.out.println("Sum of 3 Digits is: " + sum);
	}

	public static void main(String[] args) {
		SumOfNumberUsingExceptionHandlingConcept sumOfNumberUsingExceptionHandlingConcept = new SumOfNumberUsingExceptionHandlingConcept();
		sumOfNumberUsingExceptionHandlingConcept.displaySumofDigits();
	}
}
