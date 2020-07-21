/* Assingnment 31 : 19th July 2020

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
package pranitaPJun20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingFirst3Numbers {

	int findSumExceptionHandle() {
		Scanner scanner = new Scanner(System.in);
		int count = 1;
		int sum = 0;
		while (count <= 3) {
			try {
				System.out.println("\nPlease enter input");
				int input = scanner.nextInt();
				if(input>0) {
				sum = sum + input;
				count++;
				}
				else if(input==0){
					System.out.println("You entered zero.Please enter number greater than zero.");
				}
				else
					System.out.println("Negative number entered.Please enter number positive number.");
			} catch (InputMismatchException ie) {
				System.out.println("Invalid input");
				scanner.next();
			}
		}
		scanner.close();
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("/nSum of first three numbers is: "+new ExceptionHandlingFirst3Numbers().findSumExceptionHandle());
	}

}
