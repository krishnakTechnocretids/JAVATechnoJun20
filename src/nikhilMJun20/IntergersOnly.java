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

package nikhilMJun20;

import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;

public class IntergersOnly {
	void acceptAndAddintegers() {
		int[] intArray = new int[3];
		int integerCounter = 0;
		int sum = 0;
		//Creating Scanner class object
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter ONLY integer numbers:-");
		while(integerCounter <= 2) {
			try {
				intArray[integerCounter] = scanner.nextInt();
				//intArray[integerCounter] = Integer.parseInt(scanner.nextLine());
				sum += intArray[integerCounter];
				integerCounter++;
			}catch(InputMismatchException ime) {
		   //catch(NumberFormatException nfe) {	
				//System.out.println("You have not entered an integer number.\nPlease enter an integer.");
				scanner.next();
			}
		}
		System.out.println("You have entered following 3 integer numbers:-\n"+Arrays.toString(intArray)+"\nSum ofthe entered integer numbers = "+sum);
	}
	
	public static void main(String[] args) {
		new IntergersOnly().acceptAndAddintegers();
	}
}
