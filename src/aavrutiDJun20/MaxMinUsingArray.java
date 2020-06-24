//Find Max and Min of the number using Array and Scanner

package aavrutiDJun20;

import java.util.Scanner;

public class MaxMinUsingArray {
	
	void minNumber(int[] number) {
		int min = number[0];
		for(int index=1;index<number.length;index++) {
			if(number[index]<min) {
				min = number[index];
			}
		}
		System.out.println("Minimum number is : " + min);
	}

	void maxNumber(int[] number) {
		int max = number[0];
		for(int index=1;index<number.length;index++) {
			if(number[index]>max) {
				max = number[index];
			}
		}
		System.out.println("Maximum number is : " + max);
	}
	
	public static void main(String[] args) {
		MaxMinUsingArray maxMinUsingArray = new MaxMinUsingArray();
		Scanner scanner = new Scanner(System.in);
		
		int arraySize = 0;
		boolean flag = false;
		do {
			System.out.println("Please enter number between 1-50 : ");
			arraySize = scanner.nextInt();
			if(arraySize>0 && arraySize<=50) {
				flag = true;
			}
		}while(flag==false);
		
		int[] number = new int[arraySize];
		
		for(int index=0;index<number.length;index++) {
			System.out.println("Enter number " + (index+1) + " : ");
			number[index] = scanner.nextInt();
		}
		
		maxMinUsingArray.minNumber(number);
		maxMinUsingArray.maxNumber(number);
		scanner.close();
	}
}
