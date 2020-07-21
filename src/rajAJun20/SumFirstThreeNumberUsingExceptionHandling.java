package rajAJun20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumFirstThreeNumberUsingExceptionHandling {
	
	void showFirstThreeNumbersAndSum(){
		int count = 0 , sum = 0 ;
		int[] array = new int[3];
		do {
				try {
					System.out.println("Enter the data :");
					Scanner scan = new Scanner(System.in);
					int data = scan.nextInt();
					array[count] = data ;
					sum = sum + data;
					count++;
				}
				
				catch(InputMismatchException ie) {
					System.out.println("Entered data is not valid...!!");
				}
			}while(count < 3);
		System.out.print("Values are ");
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index]+ " ");
		}
		System.out.print("and Total is : " + sum);
	}
	
	public static void main(String[] args) {
		SumFirstThreeNumberUsingExceptionHandling exceptionHandling = new SumFirstThreeNumberUsingExceptionHandling();
		exceptionHandling.showFirstThreeNumbersAndSum();
	}
}