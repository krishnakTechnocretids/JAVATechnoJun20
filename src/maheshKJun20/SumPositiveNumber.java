package maheshKJun20;

import java.util.Scanner;

public class SumPositiveNumber {
	
	public static void main(String[] args) {
		int sum = 0, counter = 0;
		while (counter < 3) { 
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please Enter a Number");
			int num = scanner.nextInt();
			if (num > 0) {
				sum += num;
				counter++;
			}
		}
		System.out.println("Sum of first 3 positive numbers is: " + sum);
	}
}
