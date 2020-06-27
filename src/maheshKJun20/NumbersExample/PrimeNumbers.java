/*
Create a class to satisfy below requirements. 
  a) Given number is prime or not. 
  b) Print total count of prime numbers between 2->100.
  c) Find sum of all prime numbers between 2->100
  d) Find avg of prime numbers between 2->100
*/

package maheshKJun20.NumbersExample;

public class PrimeNumbers {
	
	int primeNumber(int num) {
		//Method to find if Number is Prime Number or not. It return num - If prime and returns 0 - If not Prime
		for (int index=2; index<=Math.sqrt(num);index++) {
			if (num%index == 0) {
				return 0;
			}
		}
		return num;
	}
	
	
	int countOfPrimeNumInRange(int startRange, int endRange) {
		//Method to find count of Prime number in given range. Is call primeNumber Method in a loop to check the individual elements
		//Method displays and return count of all the prime number in the range
		int count=0;
		for (int index=startRange;index<=endRange;index++) {
			if (primeNumber(index) > 0) {
				count++;
			}
		}
		System.out.println("Count of Prime Number between range "+ startRange + " - " + endRange + " is: " + count);
		return count;
	}
	
	int sumAllPrimeNumInRange(int startRange, int endRange) {
		//Method to calculate sum of Prime numbers in given range. Is call primeNumber Method in a loop to check the individual elements
		//Method displays and return sum of all the prime number in the range
		int sum=0;
		for (int index=startRange;index<=endRange;index++) {
				sum += primeNumber(index);
		}
		System.out.println("Sum of Prime Number between range "+ startRange + " - " + endRange + " is: " + sum);
		return sum;
	}
	
	double AverageAllPrimeNumInRange(int sumOfPrimeNum, int countOfPrimeNum) {
		//Method to calculte and return Average of all prime numbers in the Range. 
		//It take input value sum and count of all prime numbers, which can be derived using sumAllPrimeNumInRange and countOfPrimeNumInRange methods
		return (double)sumOfPrimeNum/countOfPrimeNum;
	}
	
	public static void main(String[] args) {
		PrimeNumbers primeNumbers = new PrimeNumbers();
		int startRange = 2, endRange = 100;
		int countOfPrimeNum = primeNumbers.countOfPrimeNumInRange(startRange, endRange);
		int sumOfPrimeNum = primeNumbers.sumAllPrimeNumInRange(startRange, endRange);
		System.out.println("Average of Prime Number between range "+ startRange + " - " + endRange + " is: " + primeNumbers.AverageAllPrimeNumInRange(sumOfPrimeNum, countOfPrimeNum));
	}
}
