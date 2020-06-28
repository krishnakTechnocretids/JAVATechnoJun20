package vaishnaviVJun20_arrayExamples;

import java.util.Scanner;

public class SumOfEvenNumbers {
	
	void sum(int[] input) {
		int addition =0;
		for(int index=0;index<input.length;index++) {
			if(input[index]%2==0) {
				addition = addition+input[index];
			}
		}
		System.out.println("Addition of even numbers from given array is: "+addition);
	}

	public static void main(String[] args) {
		SumOfEvenNumbers sumOfEvenNumbers = new SumOfEvenNumbers();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter size of an array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for(int index=0;index<size;index++) {
        	System.out.print("Please enter numbers to add: ");
        	array[index]=scanner.nextInt();
        }
        sumOfEvenNumbers.sum(array);
        scanner.close();
	}

}
