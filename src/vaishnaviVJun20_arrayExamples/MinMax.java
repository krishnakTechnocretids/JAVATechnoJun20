package vaishnaviVJun20_arrayExamples;

import java.util.Scanner;

public class MinMax {
		
	int getMin(int[] input) {
		int min = input[0];
		for(int index=0;index<input.length;index++) {
			if(input[index]<min) 
				min = input[index];
		}
		return min;
	}
	int getMax(int[] input) {
		int max = input[0];
		for(int index=0;index<input.length;index++) {
			if(input[index]>max) 
				max = input[index];
		}
		return max;		
	}

	public static void main(String[] args) {
		MinMax minMax = new MinMax();
		Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter size of an array: ");
        int size = scanner.nextInt();
        int[] num = new int[size];
        for(int index=0;index<size;index++) {
            System.out.print("Please input numbers of an array: ");
            num[index] = scanner.nextInt();
        }      
       System.out.println("Minimum number out of given array is: "+minMax.getMin(num));
       System.out.println("Maximum number out of given array is: "+minMax.getMax(num));
       scanner.close();
	}
}
