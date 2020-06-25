package apurvaJun20;

import java.util.Scanner;

public class FindSumOfEvenNo {
	
	int sum =0;
	
	int sumOfEvenNumbers(int[] number) {
		
		for(int index=0;index<number.length;index++) {
			
			if(number[index]%2==0)
				sum=sum+number[index];
		}
		
		return sum;
	}
	

	public static void main(String[] args) {
		
		FindSumOfEvenNo findSumOfEvenNo = new FindSumOfEvenNo();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number :");
		
		int input = scanner.nextInt();
		int[]array = new int[input];
		
		for(int index=0;index<array.length;index++) {
		System.out.println("Please enter number "+(index+1));
		array[index]=scanner.nextInt();						
	  }		
		scanner.close();
	System.out.println("Sum of Even numbers Entered is"+findSumOfEvenNo.sumOfEvenNumbers(array));
	  }	

}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


