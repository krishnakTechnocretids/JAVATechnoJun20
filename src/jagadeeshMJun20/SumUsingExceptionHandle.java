/*Assingnment 31 : 19th July 2020

WAP to get first 3 numbers from user. Print 3 numbers and their sum.(Use exception handling concept. )
Note : User may enter wrong inputs, make sure program should not break.

Input :
10
TechnoCredits
2tech3
30
40
Output : values are 10,30,40 and total is 80 */
package jagadeeshMJun20;
import java.util.InputMismatchException;
import java.util.Scanner;
public class SumUsingExceptionHandle {
	static int count = 0;

	int getSum(int num1, int num2, int num3) {
		return (num1 + num2 + num3);
	}

	public static void main(String[] agrs) {
		
		Scanner scanner = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0;
		System.out.println("Enter input:");
		do {		
			try {
				if (count == 0) {
					num1 = scanner.nextInt();
					count++;
				}
				if (count == 1) {
					num2 = scanner.nextInt();
					count++;
				}
				if (count == 2) {
					num3 = scanner.nextInt();
					count++;
				}
			} catch (InputMismatchException e) {
				scanner.next();
				System.out.println("Entered value is not integer number");
			} 
		} while (count < 3);
		System.out.println("Values are : "+num1+", "+ num2+", "+ num3+" and Total is : " + new SumUsingExceptionHandle().getSum(num1, num2, num3));	
		scanner.close();
	}
}
