/*Program 1: Create a class to satisfy below requirements. 
                  a) Given number is prime or not. 
                  b) Print total count of prime numbers between 2->100.
                  c) Find sum of all prime numbers between 2->100
                  d) Find avg of prime numbers between 2->100*/

package rachanaGJun20.Array;

import java.util.Scanner;

public class PrimeNumber {

	boolean isNumberPrime(int number) {

		boolean flag = true;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				flag = false;
				return flag;
			}
		}
		return flag;
	}

	int findcountOfPrimeNumbers() {
		boolean flag;
		int primenumbercount = 0;
		for (int num = 2; num <= 100; num++) {
			flag = isNumberPrime(num);
			if (flag == true) {
				primenumbercount++;
			}
		}
		System.out.println("Count of prime numbers between 2 to 100: " + primenumbercount);
		return primenumbercount;
	}

	int findSumOfPrimeNumbers() {
		boolean flag;
		int primenumbersum = 0;
		for (int num = 2; num <= 100; num++) {
			flag = isNumberPrime(num);
			if (flag == true) {
				primenumbersum = primenumbersum + num;
			}
		}
		System.out.println("Sum of prime numbers between 2 to 100: " + primenumbersum);
		return primenumbersum;
	}

	void findAverageOfPrimeNumber(int primenumbersum, int primenumbercount) {

		System.out.println("Average of Prime numbers between 2 to 100: " + primenumbersum / primenumbercount);
	}

	public static void main(String[] args) {
		PrimeNumber primenumber = new PrimeNumber();
		int primenumbercount = primenumber.findcountOfPrimeNumbers();
		int sumOfPrimeNumbers = primenumber.findSumOfPrimeNumbers();
		primenumber.findAverageOfPrimeNumber(sumOfPrimeNumbers, primenumbercount);
		Scanner scanner = new Scanner(System.in);
		for(int i=1;i<=2;i++) {
			System.out.println("Please enter a number");
			int number = scanner.nextInt();
			if(primenumber.isNumberPrime(number))
				System.out.println("Number is Prime");
			else
				System.out.println("Number is not prime");
			
		}
		scanner.close();
	}

}
