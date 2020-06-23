package harshadBJun20;

/*Assignment 15 : 23rd Jun 2020

Program 1 : 
    You need to store user input in array and do sum of even numbers only from created 
     array. [ideal Expected Time : 10 mins, Max Time : 15 mins]

     Example :
     Input : {10,5,7,3,1,5,9,30}
     Output: 40

*/

import java.util.Scanner;

public class SumOfEvenNumbers{

	void printSumOfEvenNumbers(int[] num){
		int evenNumbersSum=0;
		for(int index=0;index<num.length;index++){
			if(num[index]%2==0){
				evenNumbersSum +=num[index];
			}
			//System.out.print(num[index]+",");
		}
		System.out.println();
		System.out.println("The Sum of even numbers from the array is: "+evenNumbersSum);	
		
	}

	public static void main(String[] args) {
		SumOfEvenNumbers sumOfEvenNumbers = new SumOfEvenNumbers();
		
		Scanner sc = new Scanner(System.in);
		int size=0;
		System.out.println("Enter how many numbers you want to store in array: ");
		size = sc.nextInt();
		int[] numbers = new int[size];
		
		for(int index=0;index<size;index++){
			System.out.println("Enter number "+(index+1)+ ": ");
			numbers[index]=sc.nextInt();
		}
		
		sumOfEvenNumbers.printSumOfEvenNumbers(numbers);
		sc.close();
		
	}
}
