package madhuraMJun20.scannerClass;
/*Program 1: Create a class to satisfy below requirements. 
a) Given number is prime or not. 
b) Print total count of prime numbers between 2->100.
c) Find sum of all prime numbers between 2->100
d) Find avg of prime numbers between 2->100*/

public class PrimeNumber {
	int count;
	int sum;

	boolean isPrimeNumber(int num) {
		boolean flag = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	void findPrimeNum(int num) {
		boolean flag=isPrimeNumber(num);
		if(flag==true)
			System.out.println(num+" is a Prime number");
		else
			System.out.println(num+ " is not a prime number");
	}

	void countPrime(int num1, int num2) {
		for (int i = num1; i <= num2; i++) {
			boolean flag = isPrimeNumber(i);
			if (flag == true) {
				count++;
				System.out.println(i);
			}
		}
		System.out.println("Total Prime numbers between 2->100 : " + count);
	}

	void sumOfPrimeNum(int num1, int num2) {
		boolean flag;
		for (int index = num1; index <= num2; index++) {
			flag = isPrimeNumber(index);
			if (flag == true)
				sum = sum + index;
		}
		System.out.println("Sum of all Prime numbers between " + num1 + "->" + num2 + " : " + sum);
	}

	void avgPrimeNum(int num1, int num2) {
		System.out.println("Avereage of prime numbers bet 2->100 : " + (sum / count));
	}

	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		int num = 16;
		int num1 = 2;
		int num2 = 100;
		primeNumber.isPrimeNumber(num);
		primeNumber.findPrimeNum(num);
		System.out.println("Prime numbers between " + num1 + " -> " + num2 + " are : ");
		primeNumber.countPrime(num1, num2);
		primeNumber.sumOfPrimeNum(num1, num2);
		primeNumber.avgPrimeNum(num1, num2);
	}
}