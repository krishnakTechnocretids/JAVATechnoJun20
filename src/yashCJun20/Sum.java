package yashCJun20;

import java.util.Scanner;
class Sum{
	
	void SumOfArray(int[] num){

		int sum = 0;
		for(int index=0;index<num.length;index++) {
			
			if (num[index] %2==0)
			sum = sum+num[index];
		}
		System.out.println("Total sum is: " + sum);
	}
	public static void main(String[] args){
		int size=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many numbers you want to pass?");
		size=scanner.nextInt();
		int[] num = new int[size];
		for (int i=0;i<size;i++) {
			System.out.println("Please enter the numbers");
			num [i]=scanner.nextInt();
	} 
		Sum sum =new Sum();
		sum.SumOfArray(num);
	}  

}

