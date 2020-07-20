/*
Assingnment 31 : 19th July 2020
WAP to get first 3 numbers from user. Print 3 numbers and their sum.(Use exception handling concept. )
Note : User may enter wrong inputs, make sure program should not break.

Input :
10
TechnoCredits
2tech3
30
40
Output : values are 10,30,40 and total is 80
*/
package vireshJJun20.Assignment31;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfNumbersExceptionHandling {
	
	// This method will return the Array of valid inputs with exception handling mechanism.
	int[] validInput(int input) { 
		int cnt=0;
		int[] inputArr1 = new int[input];
		int temp = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			try {
				System.out.print("Enter number " + (cnt + 1) + " : ");
				inputArr1[cnt] = scanner.nextInt();
				cnt++;
				temp = 1;
			} catch (InputMismatchException e) {
				System.out.println("Wrong Input");
				scanner.next();
			}
		} while (cnt < input);
		scanner.close();
		if (temp == 1)
			return inputArr1;
		else
			return null;
	}
	
	// This method accepts int array and will display the sum of each array element. 
	void displaySumOfNumbers(int[] inputArr) {
		int sum=0;
		for (int index = 0; index < inputArr.length; index++) {
			sum += inputArr[index];
		}
		System.out.print("The numbers entered are: ");
		for (int numIndex = 0; numIndex < inputArr.length; numIndex++) {
			System.out.print(" " + inputArr[numIndex] + ",");
		}
		System.out.print("the sum is: " + sum);
	}
	
	public static void main(String[] args) {
		int[] inputArr = new SumOfNumbersExceptionHandling().validInput(3);
		if (!(inputArr == null)) {
			new SumOfNumbersExceptionHandling().displaySumOfNumbers(inputArr);
		}
	}
}
