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
package rachanaGJun20.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumUsingException {

	void getInputAndCalculateSum() {
		
		int[] arr = new int[3];
		int sum = 0;
		int index = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter numbers:");
		while (index < 3) {
			try {
				arr[index] = scanner.nextInt();
				sum = sum + arr[index];
				index++;
			}catch(InputMismatchException e) {
				scanner.next();
			}
		}
		System.out.println(sum);
		scanner.close();
	}
	public static void main(String[] args) {
		new SumUsingException().getInputAndCalculateSum();
	}
}
