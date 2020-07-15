/*
 * Assignment 15 : 23rd Jun 2020

Program 1 : 
    You need to store user input in array and do sum of even numbers only from created 
     array. [ideal Expected Time : 10 mins, Max Time : 15 mins]

     Example :
     Input : {10,5,7,3,1,5,9,30}
     Output: 40

Program 2 : 
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
package suparnaNJune20.Assignment15;

import java.util.Scanner;

public class IntArrayOperation {
	int[] acceptArray(int noCount) {
		Scanner scanner = new Scanner(System.in);

		int arrayOfNo[] = new int[noCount];
		for (int index = 0; index < noCount; index++) {
			System.out.println("Enter arry [" + (index + 1) + "] element ");
			arrayOfNo[index] = scanner.nextInt();
		}
		return arrayOfNo;
	}

	void displayArray(int arrayOfNo[], int noCount) {
		System.out.print(" \n Arrya element = {" + arrayOfNo[0]);
		for (int index = 1; index < noCount; index++) {
			System.out.print("," + arrayOfNo[index]);
		}
		System.out.print("}");
	}

	void sumOfEvenNo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Total No of Element to be store in array");
		int noCount = scanner.nextInt();
		int arrayOfNo[] = acceptArray(noCount);
		displayArray(arrayOfNo, noCount);
		int sum = 0;
		for (int index = 0; index < noCount; index++) {
			if (arrayOfNo[index] % 2 == 0)
				sum += arrayOfNo[index];
		}
		System.out.println("\n Sum of Even nos from above arrya =" + sum);
	}

	void countOfPosAndNegNo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Total No of Element to be storepostive and negative type of  array");
		int noCount = scanner.nextInt();
		int arrayOfNo[] = acceptArray(noCount);
		displayArray(arrayOfNo, noCount);
		int positiveCnt = 0, negativeCnt = 0;
		for (int index = 0; index < noCount; index++) {
			if (arrayOfNo[index] < 0)
				positiveCnt++;
			else
				negativeCnt++;
		}
		System.out.println("\n Total no of  positive  nos from above arrya =" + positiveCnt);
		System.out.println(" Total no of Negative   nos from above arrya =" + negativeCnt);
	}

	void diffOfPosAndNegNo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Total No of Element to be storepostive and negative type of  array");
		int noCount = scanner.nextInt();
		int arrayOfNo[] = acceptArray(noCount);
		displayArray(arrayOfNo, noCount);
		int positiveSum = 0, negativeSum = 0;
		for (int index = 0; index < noCount; index++) {
			if (arrayOfNo[index] < 0)
				positiveSum = +arrayOfNo[index];
			else
				negativeSum = +arrayOfNo[index];
		}
		System.out.println("\n difference of positive number sum and negative number " + (positiveSum - negativeSum));
	}

	public static void main(String[] args) {
		new IntArrayOperation().sumOfEvenNo();
		new IntArrayOperation().countOfPosAndNegNo();
		new IntArrayOperation().diffOfPosAndNegNo();
	}
}
