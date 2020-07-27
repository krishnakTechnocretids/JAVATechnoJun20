package deavinaSJun20;

import java.util.ArrayList;

public class PrimenumberArrayList {

	public static void main(String[] args) {
		new PrimenumberArrayList().listofPrimenumbers(2, 100);
	}

	boolean isPrimeNumber(int number) {
		boolean flag = true;
		for (int index = 2; index < Math.sqrt(number); index++) {
			if (number % index == 0) {
				flag = false;
				return false;
			}
		}
		if (flag == true) {
			// System.out.println(number + " is a prime number.");
			return true;
		} else {
			// System.out.println(number + " is not a prime number.");
			return false;
		}
	}

	void listofPrimenumbers(int startIndex, int lastIndex) {
		// boolean flag1=false;

		ArrayList<Integer> primenumbers = new ArrayList<Integer>();
		for (int index = startIndex; index <= lastIndex; index++) {
			boolean flag1 = isPrimeNumber(index);

			if (flag1 == true) {
				primenumbers.add(index);

			}
		}

		for (int index = 0; index < primenumbers.size(); index++) {
			System.out.println(primenumbers.get(index));
		}
	}
}
