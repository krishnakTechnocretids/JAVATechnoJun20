package aadeshJun20;

import java.util.Scanner;

public class SumOfEvenNos {
	int getSumOfEvenNos(int[] input) {
		int sum = 0;
		for(int index=0; index<input.length; index++) {
			if(input [index]%2==0){
				sum= sum+input[index];
			}
				
		}
		
		return sum;
	}

	public static void main(String[] args){
		SumOfEvenNos sumOfEvenNos = new SumOfEvenNos();
		Scanner scanner = new Scanner(System.in);
		String status = "";
		do{
			System.out.print("How many integers would you like to enter? : ");
			int size = scanner.nextInt();
			int[] input = new int[size];
				for(int index = 0; index < input.length; index++){
				System.out.print("Enter integer " + (index+1)+" : ");
				input[index] = scanner.nextInt();
			}
			System.out.println("Sum of all the even numbers entered by user : "+sumOfEvenNos.getSumOfEvenNos(input));
			System.out.println("\nPress y if you want to continue");
			status = scanner.next();
		}
				while(status.equalsIgnoreCase("y"));
				scanner.close();
	}
}

