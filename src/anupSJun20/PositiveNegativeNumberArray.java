package anupSJun20;

import java.util.Scanner;

/*Create a class where user will provide int array. *[ideal Expected Time : 15 mins, Max 
    Time : 25 mins]*

    A) User can provide any positive and negative number

    B) You need to find out how many positive and negative numbers are there in array 
    (Hint : here you need two variable which maintains count of positive and negative 
    number)
    Example : input -> 10,-2,-3,4,7
    Output -> 3 positive & 2 negative numbers

    C) Create a method which return difference of positive number sum and negative number 
     sum.
     Example : input -> 10,-2,-3,4,7
     Output -> 16*/

public class PositiveNegativeNumberArray {
	int posCount = 0;
	int negCount = 0;
	int difference = 0;
	void positiveNegativeCount(int[] number) {
		for(int index =0;index<number.length;index++) {
			if(number[index]>=0)
				posCount++;
			else
				negCount++;
		}
		System.out.println("Total Positive numbers in the array : "+ posCount + "\nTotal Negative numbers in the array : " + negCount);	
	}
	
	void differencePositiveNegativeSum(int[] number) {
		for(int index =0;index<number.length;index++) {
			if(number[index]>=0)
				difference+=number[index];
			else
				difference+=number[index];
		}
		System.out.println("The difference of Positive numbers and Negative number sum in the array :"+ difference);	
	}
	
	public static void main(String[] args) {
		PositiveNegativeNumberArray positiveNegativeNumberArray = new PositiveNegativeNumberArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of integers in the array");
		int input = sc.nextInt();
		int[] number = new int[input];
		//System.out.println("Enter the integers");
		for(int index=0;index<number.length;index++) {
			System.out.println("Enter the integer number "+(index+1));
			number[index]=sc.nextInt();	
		}
		positiveNegativeNumberArray.positiveNegativeCount(number);
		positiveNegativeNumberArray.differencePositiveNegativeSum(number);
	}

}
