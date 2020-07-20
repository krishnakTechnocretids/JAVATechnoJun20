/*WAP to get first 3 numbers from user. Print 3 numbers and their sum.(Use exception handling concept. )
Note : User may enter wrong inputs, make sure program should not break.

Input :
10
TechnoCredits
2tech3
30
40
Output : values are 10,30,40 and total is 80*/
package palakSJun20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingFirstThreeNumber {

	void findFirstThreeNumberSum() {
		int count = 0, sum = 0;
		int[] array = new int[3];
		while (count != 3) {
			try {

				System.out.println("Enter Number");
				Scanner sc = new Scanner(System.in);
				int number = sc.nextInt();
				array[count] = number;
				sum += number;
				count++;
			} catch (InputMismatchException ime) {
				System.out.println("Invalid Input Please enter Number");
			}
		}

		// Printing Array Value and SUm value
		System.out.print("Values are ");
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + ",");
		}
		System.out.print(" and Sum is " + sum);
	}

	public static void main(String[] args) {
		ExceptionHandlingFirstThreeNumber exceptionHandlingFirstThreeNumber = new ExceptionHandlingFirstThreeNumber();
		exceptionHandlingFirstThreeNumber.findFirstThreeNumberSum();
	}

}
