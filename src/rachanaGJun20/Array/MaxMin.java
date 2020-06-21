package rachanaGJun20.Array;

import java.util.Scanner;

public class MaxMin {

	int findMax(int[] num) {
		int max = num[0];
		for (int index = 0; index < num.length; index++) {
			if (num[index] > max)
				max = num[index];
		}
		return max;
	}

	int findMin(int[] num) {
		int min=num[0];
		for(int index=0;index < num.length;index++) {
			if(num[index] < min)
				min=num[index];
		}
		return min;
	}

	public static void main(String[] args) {

		MaxMin mainclass = new MaxMin();
		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter how many numbers you want");
		int limit = sc.nextInt();
		System.out.println("Enter numbers");
		int[] number = new int[limit];

		for (int i = 0; i < limit; i++) {
			number[i] = sc.nextInt();
		}
		System.out.println("Entered numbers are:");
		for (int j = 0; j < limit; j++) {
			System.out.print(number[j] + " ");
		}
		System.out.println("\nMaximum number :" + mainclass.findMax(number));
		System.out.println("Minimum number :"+mainclass.findMin(number));
	}
}
