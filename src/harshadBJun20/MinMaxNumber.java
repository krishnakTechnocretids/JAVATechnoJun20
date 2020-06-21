package harshadBJun20;

/*Program 1 :
A) Find maximum number from user given array [use scanner class to take numbers and size of an array]
B) Find minimum number from user given array [use scanner class to take numbers and size of an array]*/

import java.util.Scanner;

public class MinMaxNumber{

	void printMaxNum(int[] num){
		int maxNum=num[0];
		for(int index=1;index<num.length;index++){
			if(num[index]>maxNum){
				maxNum =num[index];
			}
		}
		System.out.println("The Maximum number from the array is: "+maxNum);	
		System.out.println();
	}
	

	void printMinNum(int[] num){
		int minNum=num[0];
		for(int index=1;index<num.length;index++){
			if(num[index]<minNum){
				minNum =num[index];
			}
		}
		System.out.println("The Minimum number from the array is: "+minNum);	
		System.out.println();	
	}
	
	public static void main(String[] args) {
		MinMaxNumber minMaxNumber = new MinMaxNumber();
		
		Scanner sc = new Scanner(System.in);
		int size=0;
		System.out.println("Enter how many numbers you want to store in array: ");
		size = sc.nextInt();
		int[] numbers = new int[size];
		
		for(int index=0;index<size;index++){
			System.out.println("Enter number "+(index+1)+ ": ");
			numbers[index]=sc.nextInt();
		}
		
		minMaxNumber.printMinNum(numbers);
		minMaxNumber.printMaxNum(numbers);
		
		sc.close();
		
	}
}