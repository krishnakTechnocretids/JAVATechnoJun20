package aasthaJJun20;

import java.util.Scanner;

public class PositiveNegativeIntegers {
	
	void findPosNegNos(int[] input) {
		int countPos = 0;
		int countNeg = 0;
		for(int index = 0; index < input.length; index++){
			if(input[index] < 0)
				countNeg++;
			else
				countPos++;
		}
		System.out.println("There are total "+countPos+" postive and "+countNeg+" Negative numbers");
	}
	
	int getDiffOfPosNegNos(int[] input) {
		int diff = 0;
		for(int index = 0; index < input.length; index++){
			diff += input[index];
		}
		return diff;
	}
	
	public static void main(String[] args){
		PositiveNegativeIntegers positiveNegativeIntegers = new PositiveNegativeIntegers();
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
			positiveNegativeIntegers.findPosNegNos(input);
			System.out.println("The difference of positive number's sum & negative number's sum = " + positiveNegativeIntegers.getDiffOfPosNegNos(input));
			System.out.println("\nPress y if you want to continue");
			status = scanner.next();
		}while(status.equalsIgnoreCase("y"));
		scanner.close();
	}
}
