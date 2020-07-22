/*Assignment 32 : 21st July 2020

WAP to do sum of numbers in given statement. (Use split method and Exception handling concept. Do not use character class methods and ascii concept.)

Input : I have 5 Years 6 month of experience.
Output : 11*/
package rachanaGJun20.exceptionHandling;

import java.util.Scanner;

public class SumOfNumbers {

	void calculateSum(String str) {
		Scanner scanner = new Scanner(System.in);
		String[] strtemp = str.split(" ");
		double sum = 0.0;
		for (int index = 0; index < strtemp.length; index++) {
			try {
				sum+=Double.parseDouble(strtemp[index]);
				//sum += Integer.parseInt(strtemp[index]);
			} catch (NumberFormatException e) {
		}
	}
		System.out.println("Sum of digits: " + sum);
		scanner.close();
	}
	public static void main(String[] args) {
		String str = "I have 5 Years 6 month of experience";
		System.out.println(str);
		new SumOfNumbers().calculateSum(str);
	}
}
