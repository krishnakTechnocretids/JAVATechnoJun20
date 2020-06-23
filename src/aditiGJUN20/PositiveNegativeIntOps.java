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

package aditiGJUN20;

import java.util.Scanner;

public class PositiveNegativeIntOps {
	int[] intArray;
	int arraySize,posCount=0,negCnt=0,valueZeroCnt=0;
	
	// Method to take array input from user.
	void setArrayValue() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many Numbers you want to enter in Array?");
		arraySize=scanner.nextInt();
		intArray= new int[arraySize];
		System.out.println("----------------------------");
		for(int index=0;index<arraySize;index++) {
			System.out.print("Enter Number"+(index+1)+" -> ");
			intArray[index]=scanner.nextInt();
		}
		scanner.close();
	}
	
	// Method which counts positive and negative integers
	// It also calculates the sum of positive and negetive integers and returns the difference
	int getPositivenegativeNumAndDiff(int[] inputArray) {
		int diff=0;
		for(int index=0;index<inputArray.length;index++) {
			if(inputArray[index]>0) {
				diff+=inputArray[index];
				posCount++;
			}
			else if(inputArray[index]<0) {
				diff+=inputArray[index];
				negCnt++;
			}
			else
				valueZeroCnt++;		
		}
		return diff; 
	}

	public static void main(String[] args) {
		PositiveNegativeIntOps positvenegativeIntOps = new PositiveNegativeIntOps();
		positvenegativeIntOps.setArrayValue();
		positvenegativeIntOps.getPositivenegativeNumAndDiff(positvenegativeIntOps.intArray);
		
		System.out.println("Input contains "+positvenegativeIntOps.posCount+" positive numbers and "+positvenegativeIntOps.negCnt+" negative numbers");
	
		if(positvenegativeIntOps.valueZeroCnt!=0)
			System.out.println("Input contains zero(0) "+positvenegativeIntOps.valueZeroCnt+" times which is unsigned integer(neither positive nor negative)");
		System.out.println("The difference of positive number's sum & negative number's sum = "+positvenegativeIntOps.getPositivenegativeNumAndDiff(positvenegativeIntOps.intArray));
	}

}
