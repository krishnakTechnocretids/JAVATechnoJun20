package apurvaJun20;

import java.util.Scanner;

public class FindPositiveNegativeNumber {
	
	int intSum;
	int positiveCount;
	int negativeCount;
	
	
	int positiveNegativeNumber(int[] array){
		
		
		
		for(int index=0;index<array.length;index++)
			
		{
		    if(array[index]>=0) {
			 intSum += array[index];
				positiveCount++;
		}
		    else{
				intSum+=array[index];
				 negativeCount++;
		}
	}
		System.out.println("Number of Positive integers enterd="+positiveCount+"\n Number of Negative integers enterd="+negativeCount);
		
		return intSum;
		
	}
	
	public static void main(String[] args) {
		FindPositiveNegativeNumber findPositiveNegativeNumber = new FindPositiveNegativeNumber();
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("This program will tell you how many Positive and Negative numbers you entered");
		
		int input = scanner.nextInt();
		int[]array = new int[input];
		
		  for(int index=0;index<array.length;index++) {
			  
			  System.out.println("Please enter number "+(index+1));
			  array[index]=scanner.nextInt();
		  }
		  
		 scanner.close();
		 findPositiveNegativeNumber.positiveNegativeNumber(array);
		
      }
 }
