package deavinaSJun20;

import java.util.Scanner;
import java.lang.Math;

public class PositiveNegativeArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter size of array");
		int size = scanner.nextInt();
		int[] numbers = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter Integer");
			numbers[i] = scanner.nextInt();
		}
		new PositiveNegativeArray().positiveNegative(numbers);
		System.out.println("Difference between sum of positive number and negative number is : "
				+ new PositiveNegativeArray().differenceIntegers(numbers));
		scanner.close();
	}
	//find positive & negative numbers in the entered array
	void positiveNegative(int Arr[]) {
		int count = 0;
		int countN = 0;
		for (int j = 0; j < Arr.length; j++) {
			if (Arr[j] > 0) {
				count++;
			} else if (Arr[j] < 0) {
				countN++;
			}
		}
		System.out.println("total number of positive numbers in entered array is : " + count);
		System.out.println("total number of negative numbers in entered array is : " + countN);
	}
	//find difference between sum of positive & negative numbers in the entered array
	int differenceIntegers(int Arr[]) {
		int sumP = 0;
		int sumN = 0;
		for (int j = 0; j < Arr.length; j++) {
			if (Arr[j] > 0) {
				sumP += Arr[j];
			} else {
				sumN += Arr[j];
			}
		}
		return (sumP - Math.abs(sumN));
	}

}