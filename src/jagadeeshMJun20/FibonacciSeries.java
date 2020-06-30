/*Program 2: To print first n Fibonacci Numbers.
Input n = 5
Output = 1 1 2  3  5  8 

Input: n = 10 
Output :  1 1 2  3  5  8 13  21 34 55

Hint :
The next number is found by adding up the two numbers before it:
the 2 is found by adding the two numbers before it (1+1),
the 3 is found by adding the two numbers before it (1+2),
the 5 is (2+3),
and so on! */
package jagadeeshMJun20;

import java.util.Scanner;

public class FibonacciSeries {
	private int num;

	void getInput(int number) {
		num = number;

		displayOutput();
	}

	private void displayOutput() {
		int[] arr = new int[num];
		for (int index = 0; index < num; index++) {
			if (index == 0 || index == 1)
				arr[index] = 1;
			else
				arr[index] = arr[index - 1] + arr[index - 2];
		}System.out.print("Output is: ");
		for (int index = 0; index < arr.length; index++)
			System.out.print(arr[index] + " ");

	}

	public static void main(String[] agrs) {
		System.out.println("Enter any number");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		new FibonacciSeries().getInput(number);
		scanner.close();
	}
}