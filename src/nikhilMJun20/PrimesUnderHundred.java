/*
Exam-8:
Q2) find prime numbers between 1 -> 100 and return an arraylist.
*/

package nikhilMJun20;

import java.util.ArrayList;

public class PrimesUnderHundred {
	boolean isPrime(int number) {
		boolean flag = true;
		for(int div=2; div<=Math.sqrt(number); div++) {
			if(number % div == 0) {
				flag = false;
				break;
			}
		}		
		return flag;
	}
	
	public static void main(String[] args) {
		PrimesUnderHundred primesUnderHundred = new PrimesUnderHundred();
		ArrayList<Integer> primeNumbers = new ArrayList<Integer> ();
		for(int number = 1; number <= 100; number++) {
			if(primesUnderHundred.isPrime(number))
				primeNumbers.add(number);
		}
		System.out.println("Prime numbers between 1 to 100 are :-\n"+primeNumbers.toString().replace('[', ' ').replace(']',' '));
	}
}
