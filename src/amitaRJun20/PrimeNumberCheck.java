package amitaRJun20;

public class PrimeNumberCheck {
	// Method to check if a number is prime number or not
	boolean primeNumber(int num) {
		boolean flag = false;
		for (int index = 2; index <= Math.sqrt(num); index++) {
			if (num % index == 0) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	void isPrimeNumber(int num) {
		if (primeNumber(num) == false)
			System.out.println(num + " is a Prime number");
		else
			System.out.println(num + " is not a prime number");
	}

	// Method to find count of all prime number between 2 & 100
	int countPrimeNumbers(int startnum, int endnum) {
		int count = 0;
		for (int index = startnum; index <= endnum; index++) {
			if (primeNumber(index) == false) {
				count++;
			}
		}
		return count;
	}

	//// Method to find sum of all prime number between 2 & 100
	int sumAllPrimeNumbers(int startnum, int endnum) {
		int sum = 0;
		for (int index = startnum; index <= endnum; index++) {
			if (primeNumber(index) == false) {
				sum += index;
			}
		}
		return sum;
	}

	// Method to find average of all prime number between 2 & 100
	double averageOfAllPrimeNumbers(int startnum, int endnum) {
		return sumAllPrimeNumbers(startnum, endnum) / countPrimeNumbers(startnum, endnum);
	}

	public static void main(String[] args) {
		PrimeNumberCheck primenumber = new PrimeNumberCheck();
		int startnum = 2;
		int endnum = 100;
		primenumber.isPrimeNumber(121);
		System.out.println(
				"Total Prime number count in range(2--100) are " + primenumber.countPrimeNumbers(startnum, endnum));
		System.out.println(
				"Sum of all prime numbers in range(2--100) is " + primenumber.sumAllPrimeNumbers(startnum, endnum));
		System.out.println("Average of Prime Number between range(2--100) is "
				+ primenumber.averageOfAllPrimeNumbers(startnum, endnum));
	}

}
