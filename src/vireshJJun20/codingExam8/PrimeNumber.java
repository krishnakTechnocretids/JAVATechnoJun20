/*
Exam-8:
Q2) find prime numbers between 1 -> 100 and return an arraylist.
*/

package vireshJJun20.codingExam8;

import java.util.ArrayList;

public class PrimeNumber {

	void findPrimeNum(int startNum, int endNum) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		boolean flag = true;
		for (int num = startNum; num <= endNum; num++) {
			for (int index = 2; index <= num / 2; index++) {
				 flag = true;
				if (num % index == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				ar.add(num);
			}
		}
		System.out.println(ar);
	}

	public static void main(String[] args) {

		new PrimeNumber().findPrimeNum(2, 100);
	}
}
