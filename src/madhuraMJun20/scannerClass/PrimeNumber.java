package madhuraMJun20.scannerClass;
/*Program 1: Create a class to satisfy below requirements. 
a) Given number is prime or not. 
b) Print total count of prime numbers between 2->100.
c) Find sum of all prime numbers between 2->100
d) Find avg of prime numbers between 2->100*/

public class PrimeNumber {
	int count;
	int sum;

	void isPrimeNumber(int num) {
		boolean flag = false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println(num + " is a prime number");
			count++;
		} else
			System.out.println(num + " is not a prime number");
	}

	void countPrime(int num1, int num2) {
		for (int i = num1; i <= num2; i++) {
			isPrimeNumber(i);
		}
		System.out.println("Total Prime numbers between 2->100 : " + count);
	}

	void sumOfPrimeNum(int num1, int num2) {
		boolean flag;
		for (int i = num1; i <= num2; i++) {
			flag = true;
			for (int j = num1; j <= i / 2; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true)
				sum = sum + i;
		}
		System.out.println("Sum of all Prime numbers between " + num1 + "->" + num2 + " : " + sum);
	}

	void avgPrimeNum(int num1, int num2) {
		System.out.println("Avereage of prime numbers bet 2->100 : " + (sum / count));
	}

	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		int num = 16;
		primeNumber.isPrimeNumber(num);
		primeNumber.countPrime(2, 100);
		primeNumber.sumOfPrimeNum(2, 100);
		primeNumber.avgPrimeNum(2, 100);
	}
}