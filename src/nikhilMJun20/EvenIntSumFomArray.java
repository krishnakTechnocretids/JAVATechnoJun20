package nikhilMJun20;

import java.util.Scanner;

public class EvenIntSumFomArray {
	int getEvenIntSum (int[] intArray) {
		int intSum = 0;
		for(int index=0; index<intArray.length; index++) {
			if(intArray[index]%2 ==0)
				intSum+=intArray[index];
		}
		return intSum;
	}
	
	public static void main(String[] args) {
		EvenIntSumFomArray evenIntSumFomArray = new EvenIntSumFomArray();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("This program will display sum of all even integers that you will eneter.\nHow many intergers do you want to enter in the array?");
		int arrSize = scanner.nextInt();
		
		int[] intArray = new int[arrSize];
		for(int index=0; index<intArray.length; index++) {
			System.out.println("Enter integer "+(index+1)+":");
			intArray[index]=scanner.nextInt();
		}
		scanner.close();
		System.out.println("\nSum of all even integers that you have entered = "+evenIntSumFomArray.getEvenIntSum(intArray));
	}
}
