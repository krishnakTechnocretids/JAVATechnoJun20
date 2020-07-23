/* P1
Create a class to satisfy below requirements. 
  a) Given number is prime or not. 
  b) Print total count of prime numbers between 2->100.
  c) Find sum of all prime numbers between 2->100
  d) Find avg of prime numbers between 2->100
*/
package piyushPJun20;
public class PrimeNumber {

	int primeNumber(int num) {

		for (int index = 2; index <= Math.sqrt(num); index++) {
			if (num % index == 0) {
				return 0;
			}
		}

		return num;

	}

	int countOfPrimeNum(int startRange, int endRange) {

		int count = 0;
		for (int index = startRange; index <= endRange; index++) {
			if (primeNumber(index) > 0) {
				count++;
			}
		}
		System.out.println(
				" Total Count of Prime Number between range " + startRange + " - " + endRange + " is -> " + count);
		return count;
	}

	int sumAllPrimeNum(int startRange, int endRange) {

		int sum = 0;
		for (int index = startRange; index <= endRange; index++) {
			sum += primeNumber(index);
		}
		System.out.println(" Sum of all Prime Number between range " + startRange + " - " + endRange + " is -> " + sum);
		return sum;
	}

	double AverageAllPrimeNum(int sumOfPrimeNum, int countOfPrimeNum) {

		return (double) sumOfPrimeNum / countOfPrimeNum;
	}

	public static void main(String[] args) {
		PrimeNumber prime = new PrimeNumber();
		int startRange = 2, endRange = 100;
		int countOfPrimeNum = prime.countOfPrimeNum(startRange, endRange);
		int sumOfPrimeNum = prime.sumAllPrimeNum(startRange, endRange);
		
		System.out.println(" Average of Prime Number between range " + startRange + " - " + endRange + " is -> "
				+ prime.AverageAllPrimeNum(sumOfPrimeNum, countOfPrimeNum));
	}
}
