/*
Exam-8:
Q2) find prime numbers between 1 -> 100 and return an arraylist
*/

package maheshKJun20;

import java.util.ArrayList;

public class ArrayListPrimeNumber {
	
	//Method to print list of prime numbers between start and end range
	void displaylistOfPrimeNumber(int startRange, int endRange) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (startRange < endRange && startRange >=2) {
			for (int index=startRange;index<=endRange;index++) {
				if(primeNumber(index) > 0 ) {
					list.add(index);
				}
			}
			System.out.println("Prime Number between " + startRange + " to " + endRange + " are: " + list);
		}else {
			System.out.println("Please provide valid range to search prime number \nHints: \n1. StartRange should be greater than 2 \n2. StartRange should be less than EndRange");
		}
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
		arrayListPrimeNumber.displaylistOfPrimeNumber(2, 100);
	}
}
