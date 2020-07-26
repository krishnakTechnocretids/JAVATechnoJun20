package anupSJun20;
/* Q2) find prime numbers between 1 -> 100 and return an arraylist.*/

import java.util.ArrayList;

public class PrimeNumbersUsingArrayList {
	void getPrimeNumbers() {
		ArrayList<Integer> primeNumber = new ArrayList<Integer>();
		for(int index = 2;index<=100;index++) {
			boolean flag = true;
			for(int innerindex = 2;innerindex<=index/2;innerindex++) {
				if(index%innerindex == 0) {
					flag = false;
				}	
			}
			if(flag) {
				primeNumber.add(index);
			}
		}
		System.out.println(primeNumber);
		
	}
	public static void main(String[] args) {
		PrimeNumbersUsingArrayList primeNumbersUsingArrayList = new PrimeNumbersUsingArrayList();
		primeNumbersUsingArrayList.getPrimeNumbers();
	}

}
