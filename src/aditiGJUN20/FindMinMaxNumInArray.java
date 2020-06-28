/*
 * Assignment_13
A) Find maximum number from user given array 
[use scanner class to take numbers and size of an array]
B) Find minimum number from user given array 
[use scanner class to take numbers and size of an array]
 */



package aditiGJUN20;

import java.util.Scanner;

public class FindMinMaxNumInArray {
	int[] num;
	int arraySize;
	
	// Method to get numbers from user.(User defined array size)
	void getNumbers() {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("How many Numbers do you want to Enter?");
		arraySize=scanner.nextInt();
		num= new int[arraySize];
		
		System.out.println("---------------");
		for(int index=0;index<arraySize;index++) {
			
			System.out.println("Enter Number"+(index+1));
			num[index]=scanner.nextInt();
		}
		scanner.close();
	}
	
	// Method to find minimum number from Array
	int findMinNumInArray() {
		int min=num[0];
		for(int index=1;index<num.length;index++) {
			if(num[index]<min) 
				min=num[index];
		}
		return min;
	}
	
	// Method to find maximum number from Array
	int findMaxNumInArray() {
		int max=num[0];
		for(int index=1;index<num.length;index++) {
			if(num[index]>max) 
				max=num[index];
		}
		return max;
	}
	
	public static void main(String[] args) {
		
		FindMinMaxNumInArray findMinMaxNumInArray = new FindMinMaxNumInArray();
		findMinMaxNumInArray.getNumbers();
		System.out.println("Minimun number is: "+findMinMaxNumInArray.findMinNumInArray());
		System.out.println("Maximum number is: "+findMinMaxNumInArray.findMaxNumInArray());
	}

}
