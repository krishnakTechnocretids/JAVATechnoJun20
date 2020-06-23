package vireshJJun20;

import java.util.Scanner;

class SumofEvenNumbers{
	
	void PrintSum(int [] arr){
		int sum=0;
		for(int i= 0; i<arr.length; i++){
			if (arr[i]%2==0){
				sum= sum+arr[i];
			}
		}
		System.out.println("Sum is: " + sum);
	}
	
	public static void main(String[] args){
		SumofEvenNumbers se= new SumofEvenNumbers();
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter the array size: ");
		int aSize= scanner.nextInt();
		int[] arr= new int[aSize];
		for(int i= 0; i<arr.length; i++){
			System.out.print("Enter number " + (i+1) + " : ");
			arr[i]= scanner.nextInt();
		}
		se.PrintSum(arr);
		scanner.close();
	}	
	
}

