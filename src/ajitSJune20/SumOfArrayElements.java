package ajitSJune20;

import java.util.Scanner;

public class SumOfArrayElements {

	int sumOfEvenNum(int[] array) {
		int sum = 0;
		for (int index = 0; index < array.length; index++) {
			if ((array[index] % 2) == 0) {
				sum += array[index];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		SumOfArrayElements sumOfArrayElements = new SumOfArrayElements();

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter no of Elements you want in Array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];

		System.out.print("\nPlease enter " + size + " Integer Elements in the Array:\n");
		for (int index = 0; index < array.length; index++) {
			array[index] = scanner.nextInt();
		}

		System.out.print("Elements of the array are :");
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " , ");
		}

		int sum = sumOfArrayElements.sumOfEvenNum(array);
		System.out.println("\nSum of All Even number element of Array: " + sum);
		scanner.close();
	}

}
