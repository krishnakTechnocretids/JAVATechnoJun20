package aasthaJJun20;

import java.util.ArrayList;

public class PrimeNumberWithArrayList {
	boolean isPrimeNumber(int input) {
		for (int index = 2; index <= Math.sqrt(input); index++) {
			if (input % index == 0)
				return false;
		}
		return true;
	}

	void displayPrimeNumbers(int start, int end) {
		ArrayList<Integer> listOfPrimeNumbers = new ArrayList<Integer>();
		for (int index = start; index <= end; index++) {
			if (isPrimeNumber(index))
				listOfPrimeNumbers.add(index);
		}
		System.out.println(listOfPrimeNumbers);
	}

	public static void main(String[] args) {
		new PrimeNumberWithArrayList().displayPrimeNumbers(1, 100);
	}
}
