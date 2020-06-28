package barkhaPJun20;

import java.util.Scanner;

public class MaxMin {
	
	void getMaxNumber(int[]  array) {
		int max=array[0];
		for(int index=0;index<array.length;index++) {
			if (array[index]>max)
			max=array[index];
		}
		
		System.out.println("Max number is "+max);
	}
	void getMinNumber(int[]  array) {
		int min=array[0];
		for(int index=0;index<array.length;index++) {
			if (array[index]<min)
			min=array[index];
		}
		
		System.out.println("Max number is "+min);
	}
	
	public static void main(String[] args) {
		MaxMin maxmin=new MaxMin();
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Please let us know how many numbers you want to comapre: ");
		int size=scanner.nextInt();
		int[] array=new int [size];
		for (int index=0;index<size;index++) {
			System.out.print("Please enter " +(index+1) +" number to comapre: ");
			array[index]=scanner.nextInt();
		
		}	
		scanner.close();
		maxmin.getMaxNumber(array);
		maxmin.getMinNumber(array);
		
	}
	
	
	
	
}
		
	
		
		
		
	