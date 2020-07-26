/*find prime numbers between 1 -> 100 and return an arraylist.*/

package swapnaWJun20;

import java.util.ArrayList;

public class PrimeNoArrayList {

	void displayPrimeNos(int startRange, int endRange) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int index = startRange; index <= endRange; index++) {
			boolean flag = false;
			for (int innerIndex = 2; innerIndex <= index / 2; innerIndex++) {
				if (index % innerIndex == 0) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				numbers.add(index);
			}
		}
		System.out.println("Prime Numbers ranging between " + startRange + " to " + endRange + " : ");
		for (int arrayListIndex = 0; arrayListIndex < numbers.size(); arrayListIndex++) {
			System.out.println(numbers.get(arrayListIndex));
		}
	}

	public static void main(String[] args) {
		new PrimeNoArrayList().displayPrimeNos(1, 100);
	}
}
