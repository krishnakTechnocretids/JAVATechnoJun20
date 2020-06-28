/* Assignment 16 : 24th Jun 2020
 * I completed this program in 20 min
 * 1) Create a class where you need to check given number is there in predefined array or not, 
 * if present then print frequency of the number. [Estimated time: 15 mins]

Input : Predefined array -> {10,3,9,-99,81,3,-11}
           Number to be check -> 33
Output : Given number 33 is not present in predefined array.

Input : Number to be check -> 3
output : Given number 3 is present in predefined array with frequency 2.
 */
package pranitaPJun20;

import java.util.Scanner;

public class ArrayIsNumbPresent {
	
	void findFreqOfNumber(int[] input,int findNum) {
		int count = 0;
		for (int index=0;index<input.length;index++) {
			if(input[index]==findNum) {
				count++;	
			}
		}
		if(count>0) {
			System.out.println("\nGiven number "+findNum+" is present in predefined array with frequency " +count);
		}
		else
			System.out.println("\nGiven number "+findNum+" is not present in predefined array ");
			
	}
	public static void main(String[] args) {
		ArrayIsNumbPresent arrayIsNumbPresent = new ArrayIsNumbPresent();
		Scanner scanner = new Scanner(System.in);
		//Declare array manually
		//int[] num = {10,3,9,-99,81,3,-11};
		//int findNum = 33;
		
		//take input from user
		//declare array size
		System.out.println("Enter the size of the array");
		int size = scanner.nextInt();
		int[]num= new int[size];
		
		//initialize the array
		for(int index=0;index<num.length;index++) {
			System.out.println("Enter Number "+(index+1)+ " in array");
			num[index] =scanner.nextInt();
		}
		
		String status="";
		do {
		
		System.out.println("Enter the number you want to search");
		int findNum =scanner.nextInt();
		
		arrayIsNumbPresent.findFreqOfNumber(num,findNum);
		
		System.out.println("\nYou want to again search the number?(Y/N)");
		status = scanner.next();
		}while(status.equals("Y"));
		System.out.println("Program End");
		scanner.close();
	}

}
