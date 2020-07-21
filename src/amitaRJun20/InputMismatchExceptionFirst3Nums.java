/*Assingnment 31 : 19th July 2020

WAP to get first 3 numbers from user. Print 3 numbers and their sum.(Use exception handling concept. )
Note : User may enter wrong inputs, make sure program should not break.

Input :
10
TechnoCredits
2tech3
30
40
Output : values are 10,30,40 and total is 80*/
package amitaRJun20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionFirst3Nums {
	
	int dispalySumOfThreeNums() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number of integers to find the sum ");
		int numberOfIntegers = scanner.nextInt();
		int[] numbers = new int[numberOfIntegers];
		int count = 0, sum = 0;
		while (count < numberOfIntegers) {
			try {
				System.out.println("Please enter integer number " + (count + 1));
				int inputIntegers = scanner.nextInt();
				numbers[count] = inputIntegers;
				sum += inputIntegers;
				count++;
			} catch (InputMismatchException ie) {
				System.out.println("Invalid Input...Please enter only integers");
				scanner.nextLine();
			}
		}
		System.out.print("The input integers are : ");
		for (int index = 0; index < numbers.length; index++) {
			System.out.print(numbers[index] + ", ");
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(
				"\nTotal Sum of input numbers is : " + new InputMismatchExceptionFirst3Nums().dispalySumOfThreeNums());
	}
}