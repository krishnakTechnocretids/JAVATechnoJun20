/*Q2) find prime numbers between 1 -> 100 and return an arraylist.*/
package palakSJun20;

import java.util.ArrayList;

public class PrimeNumberReturnArrayList {

	ArrayList<Integer> findPrimeNumber() {
		ArrayList<Integer> primeNumbersList = new ArrayList<>();
		int count = 0;
		for (int index = 2; index < 100; index++) {
			boolean flag = false;
			for (int innerIndex = 2; innerIndex < index; innerIndex++) {
				if (index % innerIndex == 0) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				count++;
				primeNumbersList.add(index);
			}
		}
		System.out.println("Total count of prime Numbers -> " + count);
		return primeNumbersList;
	}

	public static void main(String[] args) {
		PrimeNumberReturnArrayList returnArrayList = new PrimeNumberReturnArrayList();
		ArrayList<Integer> primeNumberList = returnArrayList.findPrimeNumber();
		System.out.println("Prime Numbers between 1-100 -> " + primeNumberList);
	}

}
