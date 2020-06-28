/*Program 1: Create a class to satisfy below requirements. 
                  a) Given number is prime or not. 
                  b) Print total count of prime numbers between 2->100.
                  c) Find sum of all prime numbers between 2->100
                  d) Find avg of prime numbers between 2->100*/

package rachanaGJun20.Array;

import java.util.Scanner;

public class PrimeNumberClass {

	void findIsNumberPrime(int number) {

		boolean flag = true;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true)
			System.out.println("Number is Prime\n");
		else
			System.out.println("Number is not Prime\n");
	}

	int findcountOfPrimeNumbers() {
		boolean flag;
		int primenumbercount = 0;
		for (int num = 2; num <= 100; num++) {
			flag = true;
			for (int j = 2; j <= num / 2; j++) {
				if (num % j == 0) {
					flag = false;
					break;
				}
			}
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
			flag = true;
			for (int j = 2; j <= num / 2; j++) {
				if (num % j == 0) {
					flag = false;
					break;
				}
			}
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
		PrimeNumberClass primenumberclass = new PrimeNumberClass();
		int primenumbercount = primenumberclass.findcountOfPrimeNumbers();
		int sumOfPrimeNumbers = primenumberclass.findSumOfPrimeNumbers();
		primenumberclass.findAverageOfPrimeNumber(sumOfPrimeNumbers, primenumbercount);
		System.out.println("Please enter a number");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		primenumberclass.findIsNumberPrime(number);
		System.out.println("Please enter a number");
		primenumberclass.findIsNumberPrime(scanner.nextInt());
		scanner.close();
	}

}
