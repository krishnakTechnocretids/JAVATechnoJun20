package rajAJun20;

import java.util.Scanner;

public class MinMaxNumber {
	
	void getMinNumber(int[] number) {
		int min = number[0];
		for (int index=0 ; index < number.length ; index ++) {
			if(number[index] < min) {
				min = number[index];
			}
		}
	System.out.println("Minimum number from array list is: " + min);
	}
	
	void getMaxNumber(int[] number) {
		int max = number[0];
		for(int index = 0; index<number.length; index++) {
			if(number[index] > max) {
				max = number[index];
			}
		}
	System.out.println("Maximum number from array list is: " + max);
	}
	
	public static void main(String[] args) {
		
		MinMaxNumber minmaxNumber = new MinMaxNumber();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of integers you want in an integer array : ");
		int arraySize = scanner.nextInt();

		int[] number = new int[arraySize];

		for(int index=0; index < arraySize; index++) {
			System.out.println("Enter the number " + (index+1) + " : ");
			number[index] = scanner.nextInt();

	}
		scanner.close();

		minmaxNumber.getMinNumber(number);
		minmaxNumber.getMaxNumber(number);
	}

}
