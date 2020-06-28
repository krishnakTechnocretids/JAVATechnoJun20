package ajitSJune20;

import java.util.Scanner;

public class DiffOfArrayElement {
	
	void findPosAndNegNumCount(int[] array) {
		int posNumCount=0;
		int negNumCount=0;
		for(int index=0;index<array.length;index++) {
			if(array[index]>0) 
				posNumCount++;
			else
				negNumCount++;
		}
		System.out.println("Count of positive numbers in an array is: "+posNumCount);
		System.out.println("Count of negative numbers in an array is: "+negNumCount);
	}
	
	int findDifferenceOfPosAndNegNum(int[] input) {
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
		DiffOfArrayElement diffOfArrayElement = new DiffOfArrayElement();

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter no of Elements you want in Array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];

		System.out.print("\nPlease enter " + size + " Integer Elements in the Array:\n");
		for (int index = 0; index < array.length; index++) {
			array[index] = scanner.nextInt();
		}


		diffOfArrayElement.findPosAndNegNumCount(array);
		int res= diffOfArrayElement.findDifferenceOfPosAndNegNum(array);
		System.out.println("Difference from sum of positive numbers and negative numbers is: " +res);
		scanner.close();
	}
}
