package aavrutiDJun20.numbers;

import java.util.*;

public class PrimeNumberUsingCollections {
	
	List<Integer> primeNumbers() {
		ArrayList<Integer> primeNumberArray = new ArrayList<Integer>();
		for(int index=2;index<=100;index++) {
			boolean flag = true;
			for(int index2=2;index2<=index/2;index2++) {
				if(index%index2==0){
					flag = false;
					break;
				}
			}
			if(flag==true) {
				primeNumberArray.add(index);
			}				
		}	
		return primeNumberArray;
	}

	public static void main(String[] args) {
		PrimeNumberUsingCollections primeNumberUsingCollections = new PrimeNumberUsingCollections();
		System.out.println(primeNumberUsingCollections.primeNumbers());
	}
}
