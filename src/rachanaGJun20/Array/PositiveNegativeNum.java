package rachanaGJun20.Array;

import java.util.Scanner;

public class PositiveNegativeNum {

	void findCount(int[] num) {		// method will count positive and negative numbers in given array

		int positiveCount = 0;
		int negativeCount = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > 0)
				positiveCount++;
			else
				negativeCount++;
		}
		System.out.println("Positive numbers from the given array" + positiveCount);
		System.out.println("Negative numbers from the given array" + negativeCount);
	}

	int findDifference(int[] num) {		// method will find the difference of positive number sum and negative number sum

		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		return sum;
	}

	public static void main(String[] args) {

		PositiveNegativeNum positivenegativenum = new PositiveNegativeNum();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter how many numbers you want");
		int size = scanner.nextInt();
		System.out.println("Please enter numbers");
		int[] numbers = new int[size];
		for (int i = 0; i < size; i++) {
			numbers[i] = scanner.nextInt();
		}
		positivenegativenum.findCount(numbers);
		System.out.println("Difference of Positive and negative number sum is:" +  positivenegativenum.findDifference(numbers));
		scanner.close();
	}

}
