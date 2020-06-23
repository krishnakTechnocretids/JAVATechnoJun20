//Sum of all even numbers provided by User in the array

package aavrutiDJun20;

import java.util.Scanner;

public class SumOfEvenUsingArray {
	
	void sumOfEvenNumber(int[] numberArray) {
		int sum = 0;
		for(int index=0;index<numberArray.length;index++) {
			if(numberArray[index]%2 == 0)
				sum += numberArray[index];
		}	
		System.out.println("Total Addition of Even Number is : " + sum);
	}
	
	public static void main(String[] args) {
		SumOfEvenUsingArray sumOfEvenUsingArray = new SumOfEvenUsingArray();
		Scanner scanner = new Scanner(System.in);
		
		int arraySize;
		
		boolean flag = false;
		do{
			System.out.println("Please enter size of an array: ");
			arraySize = scanner.nextInt();
			if(arraySize>0)
				flag = true;
		}while(flag == true);
		
		
		int[] number = new int[arraySize]; 
		
		for(int index=0;index<number.length;index++) {
			System.out.println("Please Enter Number " + (index+1) + ":");
			number[index] = scanner.nextInt();
		}
		
		sumOfEvenUsingArray.sumOfEvenNumber(number);
		
		scanner.close();
	}
}