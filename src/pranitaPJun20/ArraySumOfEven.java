/*Assignment 15 : 23rd Jun 2020
 * Program 1 : 
    You need to store user input in array and do sum of even numbers only from created 
     array. [ideal Expected Time : 10 mins, Max Time : 15 mins]

     Example :
     Input : {10,5,7,3,1,5,9,30}
     Output: 40
 */
package pranitaPJun20;

import java.util.Scanner;

public class ArraySumOfEven {
	
	void findSumEven(int[] num) {
		int sum=0;
		for(int index=0;index<num.length;index++) {
			int number=num[index];
			if(number%2 == 0 ) {
				sum=sum+number;
			}
		}
		System.out.println("Sum of even numbers in given integer array is:"+sum);	
	}
	
	public static void main(String[] args) {
		ArraySumOfEven arraySumOfEven = new ArraySumOfEven();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the length of the array");
		int size = scanner.nextInt();
		//declare the array
		int[] num = new int [size];
		//initialize the array
		for (int index=0;index<num.length;index++) {
			System.out.println("Enter number " +(index+1) + ":");
			num[index] = scanner.nextInt();	
		}
		arraySumOfEven.findSumEven(num);
		scanner.close();
	}

}
