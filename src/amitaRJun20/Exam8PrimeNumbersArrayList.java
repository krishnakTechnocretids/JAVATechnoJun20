/*Exam-8:
Q2) find prime numbers between 1 -> 100 and return an arraylist.*/
package amitaRJun20;

import java.util.ArrayList;

public class Exam8PrimeNumbersArrayList {
	void displayPrimeList(int startNum, int endNum) {
		ArrayList<Integer> primelist = new ArrayList<Integer>();
		for (int index = startNum; index <= endNum; index++) {
			boolean flag = true;
			for (int innerIndex = 2; innerIndex <= Math.sqrt(index); innerIndex++) {
				if (index % innerIndex == 0) {
					flag = false;
				}
			}
			if (flag) {
				primelist.add(index);
			}
		}
		System.out.println("Prime numbers from " + startNum + " to " + endNum + " are " + primelist);
	}

	public static void main(String[] args) {
		Exam8PrimeNumbersArrayList primeNumbersList = new Exam8PrimeNumbersArrayList();
		primeNumbersList.displayPrimeList(2, 100);
	}
}
