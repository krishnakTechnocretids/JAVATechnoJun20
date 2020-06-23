package deavinaSJun20;
import java.util.Scanner;

public class EvenSumArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the size of array");
		int size = scanner.nextInt();
		int[] numbers = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter Integer"+(i+1)+" : ");
			numbers[i] = scanner.nextInt();
		}
		System.out.println("The Sum of even integers in the entered array is :" + new EvenSumArray().evenSum(numbers));
		scanner.close();
	}
	//Calculating sum of even numbers
	int evenSum(int Arr[]) {
		int sum = 0;
		for (int j = 0; j < Arr.length; j++) {
			if (Arr[j] % 2 == 0) {
				sum += Arr[j];
			}
		}
		return sum;
	}

}
