package anshuKJun20;

import java.util.ArrayList;

public class PrimeNumberByCollection {

	void findPrimeNumbersUsingArrayList() {

		ArrayList<Integer> prime = new ArrayList<Integer>();
		for (int integer = 2; integer <= 100; integer++) {
			boolean flag = true;
			for (int innerIndex = 2; innerIndex <= integer / 2; innerIndex++) {
				if (integer % innerIndex == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				prime.add(integer);
			}
		}
		System.out.println("Prime numbers between 1 to 100 is: " + prime);
	}

	public static void main(String[] args) {
		new PrimeNumberByCollection().findPrimeNumbersUsingArrayList();
	}
}
