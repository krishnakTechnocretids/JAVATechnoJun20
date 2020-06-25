package anupSJun20;

import java.util.Scanner;
/*Assignment 16 : 24th Jun 2020

1) Create a class where you need to check given number is there in predefined array or not, if present then print frequency of the number. [Estimated time: 15 mins]

Input : Predefined array -> {10,3,9,-99,81,3,-11}
           Number to be check -> 33
Output : Given number 33 is not present in predefined array.

Input : Number to be check -> 3
output : Given number 3 is present in predefined array with frequency 2.*/

public class NumberInArrayAndFrequency {
	
	void numberinArray(int[] num, int number) {
		int count = 0;
		for(int index = 0; index<num.length;index++) {
			if(num[index] == number)
				count++;
		}
		if(count == 0)
			System.out.println(" Given number "+ number +"is not present in the predefined array");
		else
			System.out.println(" Given number "+ number +"is present in the predefined array");	
	}
	
	void numberFrequencyinArray(int[] num, int number) {
		int count = 0;
		for(int index = 0; index<num.length;index++) {
			if(num[index] == number)
				count++;
		}
		if(count == 0)
			System.out.println(" Given number "+ number +"is not present in the predefined array");
		else
			System.out.println(" Given number "+ number +"is present in the predefined array with frequency :" + 2);	
		
	}
	
	public static void main(String[] args) {
		NumberInArrayAndFrequency numberInArrayAndFrequency = new NumberInArrayAndFrequency();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int num = sc.nextInt();
		int[] numArray = new int[num];
		for(int index = 0;index<num;index++) {
			System.out.println("Enter the number " + (index+1));
			numArray[index] = sc.nextInt();
		}
		System.out.println("Enter the number to check");
		int number = sc.nextInt();
		numberInArrayAndFrequency.numberinArray(numArray, number);
		System.out.println("Enter the number to check for the frequency");
		int numberFrequency = sc.nextInt();
		numberInArrayAndFrequency.numberFrequencyinArray(numArray, numberFrequency);
	}

}
