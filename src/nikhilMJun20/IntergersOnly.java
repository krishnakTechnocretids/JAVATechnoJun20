package nikhilMJun20;

import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;

public class IntergersOnly {
	void acceptIntegers() {
		int[] intArray = new int[3];
		int integerCounter = 0;
		//Creating Scanner class object
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter ONLY integer numbers:-");
		while(integerCounter <= 2) {
			try {
				intArray[integerCounter] = scanner.nextInt();
				//intArray[integerCounter] = Integer.parseInt(scanner.nextLine());
				integerCounter++;
			}catch(InputMismatchException ime) {
		   //catch(NumberFormatException nfe) {	
				System.out.println("You have not entered an integer number.\nPlease enter an integer.");
				scanner.next();
			}
		}
		System.out.println("You have entered following 3 integer numbers:-\n"+Arrays.toString(intArray));
	}
	
	public static void main(String[] args) {
		new IntergersOnly().acceptIntegers();
	}
}
