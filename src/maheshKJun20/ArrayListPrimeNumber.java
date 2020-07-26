/*
Exam-8:
Q2) find prime numbers between 1 -> 100 and return an arraylist
*/

package maheshKJun20;

import java.util.ArrayList;

public class ArrayListPrimeNumber {
	
	void displaylistOfPrimeNumber() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int index=2;index<=100;index++) {
			if(primeNumber(index) > 0 ) {
				list.add(index);
			}
		}
		System.out.println("Prime Number between 1 to 100 are: " + list);
	}
	int primeNumber(int num) {
		//Method to find if Number is Prime Number or not. It return num - If prime and returns 0 - If not Prime
		for (int index=2; index<=Math.sqrt(num);index++) {
			if (num%index == 0) {
				return 0;
			}
		}
		return num;
	}
	
	public static void main(String[] args) {
		ArrayListPrimeNumber arrayListPrimeNumber = new ArrayListPrimeNumber();
		arrayListPrimeNumber.displaylistOfPrimeNumber();
		
	}

}
