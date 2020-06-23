package vaishnaviVJun20_arrayExamples;

import java.util.Scanner;

public class PosNegNumbers {

	void findPosAndNegNumbers(int[] input) {
		int posCount=0;
		int negCount=0;
		for(int index=0;index<input.length;index++) {
			if(input[index]>0) 
				posCount++;
			else
				negCount++;
		}
		System.out.println("Count of positive numbers in an array is: "+posCount);
		System.out.println("Count of negative numbers in an array is: "+negCount);
	}

	int findDifference(int[] input) {
		int posSum=0;
		int negSum=0;
		for(int index=0;index<input.length;index++) {
			if(input[index]>0) 
				posSum += input[index];
			else
				negSum +=input[index];
		}
		return negSum+posSum;
	}
	public static void main(String[] args) {
		PosNegNumbers posNegNumbers = new PosNegNumbers();
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Please enter size of an array: ");
	        int size = scanner.nextInt();
	        int[] array = new int[size];
	        for(int index=0;index<size;index++) {
	        	System.out.print("Please enter numbers of an array: ");
	        	array[index]=scanner.nextInt();
	        }
	        posNegNumbers.findPosAndNegNumbers(array);
	        System.out.println("Difference from sum of positive numbers and negative numbers is: " +posNegNumbers.findDifference(array));
	        scanner.close();
	}

}
