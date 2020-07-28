package kARAN1595;

import java.util.Scanner;

public class ArraySumOfevenNumber {
	void sumOfEvenNumber(int[] array) {
		int sum = 0;
		for (int index = 0; index < array.length; index++) {
			if (array[index] % 2 == 0)
				sum = sum + array[index];
		}
		System.out.println("Sum of Even Number is " + sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArraySumOfevenNumber arraySumOfEvenNumber = new ArraySumOfevenNumber();
		System.out.println("Enter the size of an Array");
		int size = sc.nextInt();
		int[] array = new int[size];
		for (int index = 0; index < array.length; index++) {
			System.out.println("Enter the Number");
			array[index] = sc.nextInt();
		}
		arraySumOfEvenNumber.sumOfEvenNumber(array);
		sc.close();
	}
}
