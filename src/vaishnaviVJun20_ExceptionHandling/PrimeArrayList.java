package vaishnaviVJun20_ExceptionHandling;

import java.util.ArrayList;

/* Exam-8:
Q2) find prime numbers between 1 -> 100 and return an arraylist. */

public class PrimeArrayList {

	void findPrimeNumbersUsingArrayList() {

		ArrayList<Integer> prime = new ArrayList<Integer>();
		for (int number = 2; number <= 100; number++) {
			boolean flag = true;
			for (int index = 2; index <= number / 2; index++) {
				if (number % index == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				prime.add(number);
			}
		}
		System.out.println("Array lis of Prime numbers between 1 to 100 is: " + prime);
	}

	public static void main(String[] args) {
		new PrimeArrayList().findPrimeNumbersUsingArrayList();
	}

}
