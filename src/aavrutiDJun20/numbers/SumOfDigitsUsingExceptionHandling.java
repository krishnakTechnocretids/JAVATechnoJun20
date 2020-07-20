package aavrutiDJun20.numbers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfDigitsUsingExceptionHandling {

	//Get values from user
	void sumOfDigits(int totalNumbers){
		Scanner scanner = new Scanner(System.in);
		int count = 0, sum = 0;
		String concatNumber ="";
		int[] array = new int[totalNumbers];
		while(count<totalNumbers) {
			try {
				System.out.println("Please enter number "  + (count+1) + ": ");
				array[count] = scanner.nextInt();
				sum += array[count];
				concatNumber += array[count] + ", ";
				count++;				
			}
			catch(InputMismatchException e) {
				System.out.println("Please enter Valid Number");
				scanner.nextLine();
				continue;
			}
		}
		concatNumber = concatNumber.replaceAll(", $", "");
		System.out.println("Output --> values are " + concatNumber + " and total is " + sum);
		scanner.close();
	}

	public static void main(String[] args) {
		new SumOfDigitsUsingExceptionHandling().sumOfDigits(3);		
	}
}