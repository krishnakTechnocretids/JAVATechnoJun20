package abhishekSJun20;

import java.util.ArrayList;

public class PrimenumberInArrayList {
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
		System.out.println("Arraylist of Prime numbers between 1 to 100 : " + prime);
	}

	public static void main(String[] args) {
		new PrimenumberInArrayList().findPrimeNumbersUsingArrayList();
	}

}
