/*
A) Find maximum number from user given array [use scanner class to take numbers and size of an array]
B) Find minimum number from user given array [use scanner class to take numbers and size of an array]
*/

package nikhilMJun20;

import java.util.Scanner;

public class MinMaxOfArray {
	
	
	int getMinOfArray(int[] intArray) {
		int min = intArray[0];
		for(int index=1; index < intArray.length; index++) {
			if(intArray[index] < min)
				min=intArray[index];
		}
		return min;
	}
	
	int getMaxOfArray(int[] intArray) {
		int max = intArray[0];
		for(int index=1; index < intArray.length; index++) {
			if(intArray[index] > max)
			max=intArray[index];
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		MinMaxOfArray minMaxOfArray = new MinMaxOfArray();
		
		System.out.println("This program will display the min and max valued integer from the array intergers that you will eneter.");
		System.out.println("How many integers you want to enter in the array? : ");
		int arrayLength = scanner.nextInt();
		
		int[] intArray = new int[arrayLength];
		
		System.out.println("Please enter "+arrayLength+" integers:-");
		for(int index=0; index < arrayLength; index++) {
			intArray[index] = scanner.nextInt();
		}
		scanner.close();
		
		System.out.println("\nMinimum valued integer of the array = "+minMaxOfArray.getMinOfArray(intArray));
		System.out.println("\nMaximum valued integer of the array = "+minMaxOfArray.getMaxOfArray(intArray));
	}
}
