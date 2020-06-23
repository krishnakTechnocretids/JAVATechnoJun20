package rajAJun20;

import java.util.Scanner;

public class PositiveNegativeNumber {

	void countOfPositiveNegative(int[] array) {
		int pcount = 0;
		int ncount = 0;
		
		for (int index = 0 ; index < array.length ; index++) {
			if(array[index] >= 0) 
				pcount++ ;
			 else 
				ncount++ ;
		}
		System.out.println("Positive numbers are : " + pcount + " and Negative numbers are : " + ncount );
	}

	void differencePositiveNegativeSum(int[] array) {
		int result = 0;
		for (int index = 0; index < array.length; index++) {
			result = result + array[index];
		}
		System.out.println("Difference between positive and negative numbers sum is " + result);

	}

	public static void main(String[] args) {
		PositiveNegativeNumber pnNumber = new PositiveNegativeNumber();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of an array: ");
		int size = scan.nextInt();
		
		int[] number = new int[size];
		
		for (int index = 0 ; index < number.length ; index++) {
			System.out.println("Enter number : " +(index+1));
			number[index] = scan.nextInt();
		}
		pnNumber.countOfPositiveNegative(number);
		pnNumber.differencePositiveNegativeSum(number);
		scan.close();
	}

}
	
