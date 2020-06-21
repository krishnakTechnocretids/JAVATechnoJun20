/*
Assgnment 13 : 21st Jun 2020
Program 1 :
A) Find maximum number from user given array [use scanner class to take numbers and size of an array]
B) Find minimum number from user given array [use scanner class to take numbers and size of an array]
*/
package pranitaPJun20;

import java.util.Scanner;

public class ArrayMaxMinNum {
	
	void findMin(int[] input) {
		int min= input[0];
		for(int index=1;index<input.length;index++) {
			if(min>input[index]) {
				min=input[index];
			}
		}
		System.out.println("Minimum value from user given given array is:"+min);
		
	}
	
	void findMax(int[] input) {
		int max= input[0];
		for(int index=1;index<input.length;index++) {
			if(max<input[index]) {
				max=input[index];
			}
		}
		System.out.println("Maximum value from user given array is:"+max);
		
	}
	public static void main(String[]args) {
		ArrayMaxMinNum arrayMaxMinNum = new ArrayMaxMinNum();
		Scanner scanner = new Scanner(System.in);
		System.out.println("To find maximum number, enter total number of array input elements:-");
		int size=scanner.nextInt();
		int[] num = new int[size];
		for (int index=0;index<num.length;index++) {
			System.out.println("Enter Number"+(index+1)+":");
			num[index]=scanner.nextInt();
		}
		arrayMaxMinNum.findMax(num);
		
		System.out.println("\nTo find minimum number, enter total number of array input elements:-");
		int size1=scanner.nextInt();
		int[] num1 = new int[size1];
		for (int index=0;index<num.length;index++) {
			System.out.println("Enter Number"+(index+1)+":");
			num1[index]=scanner.nextInt();
		}
		scanner.close();
		arrayMaxMinNum.findMin(num1);
	}

}
