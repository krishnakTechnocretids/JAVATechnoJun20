/*
 Create a class where user will provide int array. *[ideal Expected Time : 15 mins, Max 
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
     Output -> 16
 */
package shrutiDJun20;

import java.util.Arrays;
import java.util.Scanner;

public class PositiveNegetive {
	
	void displayPositivenegetivecount(int[] num){
		int countp=0;
		int countn=0;
		for(int index=0 ; index<num.length; index++){
			if(num[index]>0)
				countp++;	
			if(num[index]<0)
				countn++;
		}
		System.out.println("Count of Positive Numbers: "+countp);
		System.out.println("Count of Negetive Numbers: "+countn);
	}
	
	int getdifference(int[] num){
		int diff = 0;
		int sumofpositive = 0;
		int sumofnegetive = 0;
		for(int index=0 ; index<num.length; index++){
			if(num[index]>0){
				sumofpositive = sumofpositive + num[index];
			}
			if(num[index]<0)
				sumofnegetive = sumofnegetive + num[index];
	}
		System.out.println("Sum of positive " +sumofpositive );
		System.out.println("Sum of negetive " +sumofnegetive );
		diff = sumofpositive+(sumofnegetive);//got stuck on this line
		return diff;
	}
	
	
	public static void main(String[] args) {
		PositiveNegetive positiveNegetive = new PositiveNegetive();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many inputs you would like to enter");
		int size=scanner.nextInt();
		int[] number = new int[size];
		
		for(int i=0; i<size; i++){
			System.out.println("Please enter input "+ (i+1));
			number[i] = scanner.nextInt();
		}
		System.out.println("Inputs provided by user " +Arrays.toString(number));
		positiveNegetive.displayPositivenegetivecount(number);
		System.out.println("Difference of positive number sum and negative number sum " + positiveNegetive.getdifference(number));
		scanner.close();
		
	}
}
