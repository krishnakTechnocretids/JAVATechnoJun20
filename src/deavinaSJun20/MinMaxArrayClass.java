package deavinaSJun20;

import java.util.Scanner;

public class MinMaxArrayClass {
	 static int min;
	 static int max;
	 static int size;
	 
	void findminmaxfromarray(int[] Arr ) {
		for (int index = 0; index < size; index++) {
			if (Arr[index] > max) {
				max = Arr[index];
			}
			if (Arr[index] < min) {
				min = Arr[index];
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of Array");
		size = scanner.nextInt();
		int[] Arr = new int[size];
		System.out.println("Enter first element");
		Arr[0] = scanner.nextInt();
		min = Arr[0];
		max = Arr[0];
		for (int index = 1; index < size; index++) {
			System.out.println("Enter element " + (index + 1));
			Arr[index] = scanner.nextInt();
		}
		MinMaxArrayClass minmaxarrayclass=new MinMaxArrayClass();
		minmaxarrayclass.findminmaxfromarray(Arr);
		System.out.println("maximum number " + max);
		System.out.println("minimim number " + min);
		scanner.close();
	}

}
