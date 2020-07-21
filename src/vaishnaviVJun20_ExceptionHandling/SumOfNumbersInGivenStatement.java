package vaishnaviVJun20_ExceptionHandling;

import java.util.InputMismatchException;

/* WAP to do sum of numbers in given statement. (Use split method and Exception handling concept. Do not use character class methods and ascii concept.) 

Input : I have 5 Years 6 month of experience.
Output : 11 */

public class SumOfNumbersInGivenStatement {

	void findSumOfNumbersInGivenStatement(String str) {
		String[] array = str.split(" ");
		int sum = 0;
		for (int index = 0; index < array.length; index++) {
			try {
				int num = Integer.parseInt(array[index]);
				sum += num;
			} catch (NumberFormatException e) {

			}
		}
		System.out.println("Addition is: " + sum);
	}

	public static void main(String[] args) {
		new SumOfNumbersInGivenStatement().findSumOfNumbersInGivenStatement("I have 5 Years 6 month of experience");

	}

}
