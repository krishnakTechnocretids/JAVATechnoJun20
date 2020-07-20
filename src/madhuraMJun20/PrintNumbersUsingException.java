/*WAP to get first 3 numbers from user. Print 3 numbers and their sum.(Use exception handling concept. )
Note : User may enter wrong inputs, make sure program should not break.
Input :
10
TechnoCredits
2tech3
30
40
Output : values are 10,30,40 and total is 80*/
package madhuraMJun20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrintNumbersUsingException {
	void sumOfGivenNumbers() {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[3];
		int count = 0;
		int sum = 0;
		String allInputs = "";
		while (count < 3) {
			try {
				System.out.println("Please enter the number " + (count + 1) + " : ");
				arr[count] = scanner.nextInt();
				allInputs += arr[count] + ",";
				count++;
			} catch (InputMismatchException ie) {
				System.out.println("**Please provide valid input**");
				scanner.next();
			}
		}
		String temp = allInputs.substring(allInputs.lastIndexOf(",")).replace(",", "");
		allInputs = allInputs.substring(0, allInputs.lastIndexOf(",")) + temp;
		System.out.println("You have Entered following numbers : " + allInputs);
		for (int index = 0; index < 3; index++) {
			sum += arr[index];
		}
		System.out.println("Sum of the given numbers is : " + sum);
	}

	public static void main(String[] args) {
		PrintNumbersUsingException printNumbersUsingException = new PrintNumbersUsingException();
		printNumbersUsingException.sumOfGivenNumbers();
	}
}