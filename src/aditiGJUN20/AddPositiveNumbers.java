package aditiGJUN20;

import java.util.Scanner;

public class AddPositiveNumbers {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int sum=0;
		int count =1;
		while(count<=3)
		{
			System.out.println("Enter your next positive number");
	        int num=scanner.nextInt();
	        
	        if(num>0) {
	        	sum+=num;
	        	count++;
	        }
	        else {
	        	System.out.println("Negetive not allowed");
	        }
		}
		System.out.println("SUm is: "+sum);	
	}
}
