package nikhilMJun20;

import java.util.Scanner;

public class PositiveNegativeIntOps {
	int intSum;
	
	int  getPosNegDiffDispCount(int[] array) {
		int posCount=0, negCount=0;
		for(int index=0; index<array.length; index++) {
			if(array[index]>=0) {
				intSum += array[index];
				posCount++;
			}else {
				intSum += array[index];
				negCount++;
			}
		}
		System.out.println("\nNo. of Positive integers entered = "+posCount+"\nNo. of Negative integers entered = "+negCount);
		return intSum; 
	}
	
	public static void main(String[] args) {
		PositiveNegativeIntOps positiveNegativeIntOps = new PositiveNegativeIntOps();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("This program will tell you how many positive and negative integers you have entered.\nAnd, it will also display diffrence betwen sums of positive and negative integers.\nHow many integres you want to enter?");
		int arrLength = scanner.nextInt();
		
		int[] intArray = new int[arrLength];
		for(int index=0; index<arrLength; index++) {
			System.out.println("Enter integer "+(index+1)+":");
			intArray[index] = scanner.nextInt();
		}
		scanner.close();
		
		System.out.println("\nDiffrence between sum of positive and negative integers is = "+positiveNegativeIntOps.getPosNegDiffDispCount(intArray));
	}
}
