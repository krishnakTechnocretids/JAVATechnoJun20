package prashantCJune20;

import java.util.Scanner;

public class PositiveNegative {	
static int pos=0;
static int neg=0;	
	
void identifyNumber(int[] input){
		for(int index=0;index<input.length;index++){
			if(input[index]<0){
				neg++;
			}
			else
			{
				pos++;
			}
			
		}
		System.out.println("Total possitve numbers are "+pos+" Total negative numbers are "+neg);
	}
void sumdiff(int[] input){
		int negativeNumberSum = 0;
		int positiveNumberSum =0;
		for(int index=0;index<input.length;index++){
			if(input[index]<0){
				neg++;
				negativeNumberSum= negativeNumberSum-input[index];
				}
			else {
				positiveNumberSum = positiveNumberSum+input[index];
			}
}
		System.out.println("Sum of negative numbers are "+negativeNumberSum);
		System.out.println("Sum of positve numbers are "+positiveNumberSum);
		System.out.println("Difference between positive and negative number is "+(positiveNumberSum-negativeNumberSum));
	}
	public static void main(String[] args){
		PositiveNegative positivenegative = new PositiveNegative();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size");
		int arraysize = scanner.nextInt();
		int[] number = new int[arraysize];
		for(int index=0;index<number.length;index++){
			System.out.println("enter your array input "+(index+1));
			number[index]=scanner.nextInt();
		}
		scanner.close();
		positivenegative.identifyNumber(number);
		positivenegative.sumdiff(number);
	}
}
