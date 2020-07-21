package maheshKJun20.NumbersExample;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sumof3DigitsByUser {
	
	void displaySumofDigits() {
		 Scanner scanner = new Scanner(System.in);
		 int count = 1, sum = 0;
		 while (count<=3) {
			 System.out.println("Please enter number " + count + ": ");
			 try {
				 sum += scanner.nextInt();
				 count++;
			 }catch(InputMismatchException Ie) {
				 System.out.println("Invalid Input. Please enter Numeric Value");
				 scanner.next();
			 }
		 }
		 System.out.println("Sum of 3 Digits is: " + sum);
	}
	
	public static void main(String[] args) {
		Sumof3DigitsByUser sumof3DigitsByUser = new Sumof3DigitsByUser();
		sumof3DigitsByUser.displaySumofDigits();
	}

}
