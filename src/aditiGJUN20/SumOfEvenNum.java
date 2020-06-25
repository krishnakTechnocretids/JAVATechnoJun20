/*
 * You need to store user input in array and do sum of even numbers only from created 
     array. [ideal Expected Time : 10 mins, Max Time : 15 mins]

     Example :
     Input : {10,5,7,3,1,5,9,30}
     Output: 40
 */


package aditiGJUN20;

import java.util.Scanner;

public class SumOfEvenNum {
	
	int[] intArray;
	int arraySize;
	
	// Method to take array input from user.
	void setArrayValue() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many Numbers you want to enter in Array?");
		arraySize=scanner.nextInt();
		intArray= new int[arraySize];
		System.out.println("----------------------------");
		for(int index=0;index<arraySize;index++) {
			System.out.print("Enter Number "+(index+1)+" -> ");
			intArray[index]=scanner.nextInt();
		}
		scanner.close();
	}
	
	int calculateSumOfEvenNum(int[] inputArray) {
		int sum=0;
		System.out.println("------------------");
		System.out.print("Even numbers are: ");
		for(int index=0;index<arraySize;index++) {
			if(inputArray[index]%2 == 0) {
				sum+=inputArray[index];
				System.out.print(inputArray[index]+"  ");
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		SumOfEvenNum sumOfEvenNum=new SumOfEvenNum();
		sumOfEvenNum.setArrayValue();
		System.out.println("\nSum of even numbers is: "+sumOfEvenNum.calculateSumOfEvenNum(sumOfEvenNum.intArray));
	}
}
