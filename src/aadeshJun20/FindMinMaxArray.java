package aadeshJun20;

import java.util.Scanner;

public class FindMinMaxArray {

	int getMaxArray(int[] intArray) {

		int maxNum = intArray[0];
		for(int index=1; index < intArray.length; index++) {
			if(intArray[index] > maxNum)
				maxNum=intArray[index];
		}
		return maxNum;	
	}
	int getMinArray(int[] intArray) {

		int minNum = intArray[0];
		for(int index=1; index < intArray.length; index++) {
			if(intArray[index] < minNum)
				minNum=intArray[index];
		}
		return minNum;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		FindMinMaxArray findMinMaxArray = new FindMinMaxArray();
		System.out.println("How Many integers you want to enter:");

		int arrayLength = scanner.nextInt();
		int[] intArray = new int[arrayLength];
		for(int index=0; index < arrayLength; index++) {
			System.out.println("Please enter "+arrayLength+" integers:-");
			intArray[index] = scanner.nextInt();
		}
		scanner.close();

		System.out.println("\nMinimum valued integer of the array = "+findMinMaxArray.getMinArray(intArray));
		System.out.println("\nMaximum valued integer of the array = "+findMinMaxArray.getMaxArray(intArray));

	}

}
