package vireshJJun20.Assignment15;

import java.util.Scanner;

public class SumofEvenNumbers{
	
	void PrintSum(int [] arr){ // method to print the sum of all even numbers from given array
		int sum=0;
		for(int i= 0; i<arr.length; i++){
			if (arr[i]%2==0){
				sum= sum+arr[i];
			}
		}	
		System.out.println("Sum of all even numbers is: " + sum);
	}
	
	public static void main(String[] args){
		SumofEvenNumbers se= new SumofEvenNumbers();
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter the array size: ");
		int aSize= scanner.nextInt();
		int[] arr= new int[aSize];
		for(int i= 0; i<arr.length; i++){ // creating an int array of the user input
			System.out.print("Enter number " + (i+1) + " : ");
			arr[i]= scanner.nextInt();
		}
		se.PrintSum(arr);
		scanner.close();
	}	
}


