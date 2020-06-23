/*
 * You need to store user input in array and do sum of even numbers only from created
array. [ideal Expected Time : 10 mins, Max Time : 15 mins]

Example :
Input : {10,5,7,3,1,5,9,30}
Output: 40
 */
package jagadeeshMJun20;

import java.util.Scanner;

public class Assg15Prg1 {
	
	int sumOfEvenNum (int[] num1, int size){
		int sum=0;
		for (int index=0;index<num1.length;index++) {
			if(num1[index]%2 ==0)
			sum = sum+num1[index];
		}
		System.out.println("==========================================");
		return sum;
	}

	public static void main(String[] args) {
		
		Assg15Prg1 assg15Prg1 = new Assg15Prg1();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Array Size (Please provide positive number:)");
		System.out.println("=============================================");
		int size = scanner.nextInt();
		System.out.println("======== Please provide  "+size+ "  numbers =========");
		int[] num1 = new int[size];
		for (int index=0; index<num1.length; index++)
			num1[index] = scanner.nextInt();
		scanner.close();
		int value = assg15Prg1.sumOfEvenNum(num1,size);
		System.out.println("Sum of even numbers is :  "+value);
		
	}

}
