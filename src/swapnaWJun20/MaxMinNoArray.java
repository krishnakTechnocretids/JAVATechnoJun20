package swapnaWJun20;

import java.util.Scanner;

public class MaxMinNoArray {

	void findMax(int[]numbers)
	{
		int maxNo=numbers[0];
		for(int index=0;index<numbers.length;index++){
			if(numbers[index]>maxNo){
				maxNo=numbers[index];
			}
		}
		System.out.println("Maximum number in the array is : " + maxNo);
	}

	void findMin(int[]numbers)
	{
		int minNo=numbers[0];
		for(int index=0;index<numbers.length;index++){
			if(numbers[index]<minNo){
				minNo=numbers[index];
			}
		}
		System.out.println("\nMinimum number in the array is : " + minNo);
	}
	
	public static void main(String[] args) {
		MaxMinNoArray maxMinNoArray = new MaxMinNoArray();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Specify the length of Array : ");
		int arraySize = scanner.nextInt();
	
		int arrayInput [] = new int[arraySize];

		for(int index=0; index<arraySize; index++)		{
			System.out.println("Enter the values of Array at index [" +index +"] :");
			arrayInput[index] = scanner.nextInt();
		}
		maxMinNoArray.findMax(arrayInput);
		maxMinNoArray.findMin(arrayInput);		
		scanner.close();
	}
}

