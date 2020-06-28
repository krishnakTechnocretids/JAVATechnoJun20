package harshadBJun20.Assignment20;
/*Assignment 20 : 28th Jun 2020

Program 1: Find the missing number in integer array of 1 to 10?
Hint: You have given an integer array which contains numbers from 1 to 10 but one number is missing, you need to write a Java program to find that missing number in an array.*/

public class FindMissingNumberFromIntegerArray {
	
	int findMissingNumber(int[] arr1) {
		int sum=0,sumOfArrayElements=0;
		sum = ((arr1.length+1)*((arr1.length+1)+1)/2);
		for(int index=0;index<arr1.length;index++) { 
			sumOfArrayElements += arr1[index];			
		}
		return (sum-sumOfArrayElements);
	}
	public static void main(String[] args) {
		FindMissingNumberFromIntegerArray findMissingNumberFromIntegerArray = new FindMissingNumberFromIntegerArray();
		int[] arr= {1,8,3,10,6,7,5,9,4};
		int missingNum = findMissingNumberFromIntegerArray.findMissingNumber(arr);
		System.out.println("Missing number in the given array is: "+missingNum);
	}
}
