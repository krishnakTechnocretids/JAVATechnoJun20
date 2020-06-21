//Program 1 :
//A) Find maximum number from user given array [use scanner class to take numbers and size of an array]
package shrutiDJun20;

import java.util.Scanner;

public class MaxMinArray {
//5,10,20,2,4	
 void findMax(int[] num){
	int maxnumber = num[0];
	for (int index=0;index<num.length;index++ ){
		if(maxnumber<num[index]){
			maxnumber=num[index];
		}
	}
	System.out.println("Highest Number of Array is : "+ maxnumber);
 }
 
 void findMin(int[] num){
		int minnumber = num[0];
		for (int index=0;index<num.length;index++ ){
			if(minnumber>num[index]){
				minnumber=num[index];
			}
		}
		System.out.println("Lowest Number of Array is : "+ minnumber);
	 }
	public static void main(String[] args) {
		MaxMinArray maxMinArray = new MaxMinArray();
		int[] num = new int[5];
		Scanner scanner = new Scanner(System.in);
		for(int index=0;index<num.length;index++){
		System.out.println("Please enter number" +(index+1)+ ":");
		num[index]= scanner.nextInt();
		}
		maxMinArray.findMax(num);
		maxMinArray.findMin(num);
		scanner.close();	
	}
}
