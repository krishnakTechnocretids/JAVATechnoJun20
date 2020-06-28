/*
 Create a class to satisfy below requirements. 
                  a) Given number is prime or not. 
                  b) Print total count of prime numbers between 2->100.
                  c) Find sum of all prime numbers between 2->100
                  d) Find avg of prime numbers between 2->100
 
 */
package shrutiDJun20;

public class PrimeOperations {
	int count = 0;
	int sum = 0;

	boolean isNumberPrime(int num) {
		boolean flag = true;
		for (int i = 2; i <= (num / 2); ++i) {
			if (num % i == 0) {
				flag = false;
				break;
				// return false;
			}
		}
		if (flag == true) {
			count++;
			//System.out.println(num + " is a prime number");
			return true;
		} else {
		//	System.out.println(num + " is not a prime number");
			return false;
		}
	}

	void sumAndCountOfPrime(int start, int end) {
		for (int i = start; i <= end; i++) {
			if (isNumberPrime(i))
				sum = sum + i;
		}
		System.out.println("Sum of Prime: " + sum);
		System.out.println("Count of Prime: " + count);
	}

	void findAvg() {

		double avg = sum / count;
		System.out.println("Avg of Prime: " + avg);

	}

	public static void main(String[] args) {
		PrimeOperations primeOperations = new PrimeOperations();
		// primeOperations.isNumberPrime(14);
		primeOperations.sumAndCountOfPrime(2, 100);
		primeOperations.findAvg();
	}
}
