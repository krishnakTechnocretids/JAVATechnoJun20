package prashantCJune20;

import java.util.Scanner;

public class SumofEven {
		void sum(int[] input){
		int even = 0;
		for(int index=0; index<input.length;index++){
				if(input[index]%2==0){
					even = even+input[index];				
				}
				
		}
		System.out.println("Sum of even number is  "+even);
	}	
		public static void main ( String[] args){
		SumofEven sumofeven = new SumofEven();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size");
		int arraysize = scanner.nextInt();		
		int[] number = new int[arraysize];
		for(int index=0;index<number.length;index++){
			System.out.println("enter your array input "+(index+1));
			number[index]=scanner.nextInt();
		}			
			scanner.close();
			sumofeven.sum(number);
	}
}
