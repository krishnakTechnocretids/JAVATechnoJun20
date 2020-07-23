package piyushPJun20;
import java.util.Scanner;

public class MaxMin {
	
	void maximum(int[] input) {
		int max = input[0];
		for(int index=1; index<input.length; index++) {
			if(input[index]>max)
				max = input[index];
		}
		System.out.println(" Maximum Number is: " + max);
	}
	
	void minimum(int[] input) {
		int min = input[0];
		for(int index=1; index<input.length; index++) {
			if(input[index]<min)
				min = input[index];
		}
		System.out.println(" Minimum Number is: " + min);
	}

	public static void main(String[] args) {
		MaxMin maxmin = new MaxMin();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" How Many Numbers you want to Enter :");
		int size = scanner.nextInt();
		int[] input = new int[size];

		for(int index=0;index<input.length;index++) {
			System.out.println(" Enter Number " + (index+1) + ":");
			input[index] = scanner.nextInt();
		}
		maxmin.maximum(input);
		maxmin.minimum(input);
		
		scanner.close();
	}

}
