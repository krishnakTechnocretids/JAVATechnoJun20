package aadeshJun20;

import java.util.Scanner;

public class PosNegInt {
	
	int maxNumber(int[] numbers) {
		int max = numbers[0];
		for(int index = 1; index < numbers.length; index++) {
			if(numbers[index] > max)
				max = numbers[index];
		}
		return max;
	}
	
	int minNumber(int[] numbers) {
		int min = numbers[0];
		for(int index = 1; index < numbers.length; index++) {
			if(numbers[index] < min)
				min = numbers[index];
		}
		return min;
	}
	
	public static void main(String[] args) {
		PosNegInt findMaxMinNumber = new PosNegInt();
		Scanner scanner = new Scanner(System.in);
		String status = "";


		do{
			int size ;
			do {
				System.out.println("How many integers you will enter, to get max/min no.");
				size = scanner.nextInt();
				if(size<=0)
					System.out.println("Please enter a valid number");
			}while(size<=0);
			
			int[] numbers = new int[size];
			for(int index=0 ; index < size ; index++) {
				System.out.println("Enter value no. "+ (index+1));
				numbers[index] = scanner.nextInt();
			}
			System.out.println("The largest number is : " + findMaxMinNumber.maxNumber(numbers));
			System.out.println("The smallest number is : " + findMaxMinNumber.minNumber(numbers));
			
			
			System.out.println("Press Y if you wish to continue, else press N");
			status = scanner.next();
		}while(status.equals("Y"));
		
		
		scanner.close();
	}
}
