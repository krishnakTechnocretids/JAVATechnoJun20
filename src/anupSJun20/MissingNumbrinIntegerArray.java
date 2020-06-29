package anupSJun20;
/*Program 1: Find the missing number in integer array of 1 to 10?
Hint: You have given an integer array which contains numbers from 1 to 10 but one number is missing, 
you need to write a Java program to find that missing number in an array.*/

public class MissingNumbrinIntegerArray {
	static int findTheMissingNumber(int[] num,int startNum,int endNum) {
		int overallSum = (endNum*(endNum+1))/2;
		int sumofArray = 0;
		for(int index = 0;index<num.length;index++) {
			sumofArray = sumofArray+num[index];
		}
		return overallSum - sumofArray;
		
		
	}
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,7,10,9,8};
		System.out.println("The missing number is : " + findTheMissingNumber(num,1,10));
	}
}