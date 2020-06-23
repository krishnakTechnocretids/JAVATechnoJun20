package vireshJJun20.Exam21Jun;

import java.util.Scanner;

public class FindMaxMinNum {

	void findMax(int[] ar) {
		int max = ar[0];
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max)
				max = ar[i];
		}
		System.out.println("The Max number in given array is: " + max);
	}

	void findMin(int[] ar) {
		int min = ar[0];
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < min)
				min = ar[i];
		}
		System.out.println("The Min number in given array is: " + min);
	}

	public static void main(String[] args) {
		FindMaxMinNum findMaxMinNum = new FindMaxMinNum();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Array Size: ");
		int arrSize = scanner.nextInt();
		int[] ar = new int[arrSize];
		for (int i = 0; i < arrSize; i++) {
			System.out.print("Enter number " + (i + 1) + " :");
			int num = scanner.nextInt();
			ar[i] = num;
		}
		findMaxMinNum.findMax(ar);
		findMaxMinNum.findMin(ar);
		scanner.close();
	}
}
