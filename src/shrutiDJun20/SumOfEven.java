/*
 You need to store user input in array and do sum of even numbers only from created 
     array. [ideal Expected Time : 10 mins, Max Time : 15 mins]

     Example :
     Input : {10,5,7,3,1,5,9,30}
     Output: 40

 */
package shrutiDJun20;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfEven {

	void sumEven(int[] num){
		int sum=0;
		for(int index = 0; index<num.length ; index++){
			if(num[index]%2==0)
				sum = sum+num[index];
		}
		System.out.println("Sum of even inputs:" +sum);
	}
	public static void main(String[] args) {
		SumOfEven sumOfEven = new SumOfEven();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many inputs you want to provide");
		int size= scanner.nextInt();
		int[] number = new int[size];
		for(int index=0;index<size;index++){
		System.out.println("Input"+(index+1));
		number[index]=scanner.nextInt();
		}
		System.out.println("Inputs provided by user " +Arrays.toString(number));//spent 10 mint extra to find this code.
		sumOfEven.sumEven(number);
		scanner.close();	
	}
}