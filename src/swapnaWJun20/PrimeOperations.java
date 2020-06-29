/*Program 1: Create a class to satisfy below requirements. 
                  a) Given number is prime or not. 
                  b) Print total count of prime numbers between 2->100.
                  c) Find sum of all prime numbers between 2->100
                  d) Find avg of prime numbers between 2->100*/

package swapnaWJun20;

public class PrimeOperations {

	void findPrimeNumberInGivenRange(int first, int last) {

		int sum = 0;
		int count = 0;
		for (int start = first; start <= last; start++) {
			boolean flag = isPrime(start);
			if (flag == true) {
				count++;
				sum = sum + start;
				System.out.println(start + " is the prime no");
			}
		}
		System.out.println("Total count of prime numbers is : " + count);
		System.out.println("Sum of prime numbers is : " + sum);
		System.out.println("Average of prime numbers is : " + (sum / count));
	}

	boolean isPrime(int number) {
		boolean flag = true;
		for (int index = 2; index < number; index++) {
			if (number % index == 0)
				flag = false;
		}
		return flag;
	}

	void isPrimeNo(int number) {
		boolean flag = isPrime(number);
		if (flag = true)
			System.out.println(number + " is not prime");
		else
			System.out.println(number + "  is prime");
	}

	public static void main(String[] args) {

		PrimeOperations primeOperations = new PrimeOperations();
		primeOperations.isPrimeNo(12);
		primeOperations.findPrimeNumberInGivenRange(2, 100);
	}
}
