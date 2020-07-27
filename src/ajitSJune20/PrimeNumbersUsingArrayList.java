/*Exam-8:
Q2) find prime numbers between 1 -> 100 and return an arraylist.*/
package ajitSJune20;

import java.util.ArrayList;

public class PrimeNumbersUsingArrayList {
	void displayPrimeList(int startNum, int endNum) {
		ArrayList<Integer> primeNumberslist = new ArrayList<Integer>();
		for (int index = startNum; index <= endNum; index++) {
			boolean flag = true;
			for (int innerIndex = 2; innerIndex <= Math.sqrt(index); innerIndex++) {
				if (index % innerIndex == 0) {
					flag = false;
				}
			}
			if (flag) {
				primeNumberslist.add(index);
			}
		}
		System.out.println("Prime numbers from " + startNum + " to " + endNum + " are :\n" + primeNumberslist);
	}

	public static void main(String[] args) {
		new PrimeNumbersUsingArrayList().displayPrimeList(2, 100);
	}
}