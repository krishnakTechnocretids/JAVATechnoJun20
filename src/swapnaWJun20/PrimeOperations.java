/*Program 1: Create a class to satisfy below requirements. 
                  a) Given number is prime or not. 
                  b) Print total count of prime numbers between 2->100.
                  c) Find sum of all prime numbers between 2->100
                  d) Find avg of prime numbers between 2->100*/

package swapnaWJun20;

public class PrimeOperations {

	void totalCount(int a, int b) {
		int sum = 0;
		int count = 0;
		for (int start = a; start < b; start++) {
			boolean flag = false;
			for (int index = 2; index <= Math.sqrt(start); index++) {
				if (start % index == 0) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				count++;
				sum = sum + start;
				System.out.println(start + " is the prime no");
			}
		}
		System.out.println("Total count of prime numbers is : " + count);
		System.out.println("Sum of prime numbers is : " + sum);
		System.out.println("AVerage of prime numbers is : " + (sum / count));
	}

	void isPrime(int number) {
		boolean flag = true;
		for (int index = 2; index < number; index++) {
			if (number % index == 0)
				flag = false;
			else
				flag = true;
		}
		if (flag = true)
			System.out.println(number + " no is not prime");
		else
			System.out.println(number + " no is prime");
	}

	public static void main(String[] args) {

		PrimeOperations primeOperations = new PrimeOperations();
		primeOperations.isPrime(12);
		primeOperations.totalCount(2, 100);
	}
}
