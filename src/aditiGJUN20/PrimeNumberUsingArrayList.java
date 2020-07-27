package aditiGJUN20;

import java.util.ArrayList;
import java.util.Iterator;

public class PrimeNumberUsingArrayList {

	boolean isPrimeNumber(int num) {

		for (int index = 2; index <= Math.sqrt(num); index++) {
			if (num % index == 0) {
				return false;
			}
		}
		return true;
	}

	void displayPrimeNumber(int startRange, int endRange) {
		ArrayList<Integer> primeNumberList = new ArrayList<Integer>();
		for (int index = startRange; index <= endRange; index++) {
			if (isPrimeNumber(index)) {
				primeNumberList.add(index);
			}
		}
		System.out.println(primeNumberList);
	}

	public static void main(String[] args) {
		int startRange = 2, endRange = 100;
		new PrimeNumberUsingArrayList().displayPrimeNumber(startRange, endRange);
	}
}