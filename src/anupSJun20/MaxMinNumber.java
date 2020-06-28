package anupSJun20;

import java.util.Scanner;

/*Program 1 :
A) Find maximum number from user given array [use scanner class to take numbers and size of an array]
B) Find minimum number from user given array [use scanner class to take numbers and size of an array]*/
public class MaxMinNumber {
	int maxNumber(int[] input) {
		int max = input[0];
		for(int index = 0;index<input.length;index++) {
			if(max<input[index]) {
				max = input[index];
			}
		}
		return max;
	}
	int minNumber(int[] input) {
		int min = input[0];
		for(int index = 0;index<input.length;index++) {
			if(input[index]<min) {
				min = input[index];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		MaxMinNumber maxminnumber = new MaxMinNumber();
		Scanner sc = new Scanner(System.in);
		int index=0;
		System.out.println("Please enter the array size");
		index = sc.nextInt();
		int[] num = new int[index];
		for(int i = 0;i<num.length;i++) {
			System.out.println("Enter the number" + (i+1));
			num[i] = sc.nextInt();
		}
		System.out.println("The maximum number is :" + maxminnumber.maxNumber(num));
		System.out.println("The minumum number is :" + maxminnumber.minNumber(num));
	}

}
