/*Assignment 19 : 27th Jun'2020

Program 1: Create a class to satisfy below requirements. 
                  a) Given number is prime or not. 
                  b) Print total count of prime numbers between 2->100.
                  c) Find sum of all prime numbers between 2->100
                  d) Find avg of prime numbers between 2->100
*/

package pranitaPJun20;

public class AllPrimeNumber {
	// Method to check Given number is prime or not.
	void isPrime(int num) {
		boolean flag = true;
		for (int index = 2; index <= num / 2; num++) {
			if (num % index == 0) {
				System.out.println("Given number " + num + " is not prime");
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println("Given number " + num + " is prime");
		}
	}
	// Method to check Count,Sum and average of all prime numbers in range
	void checkPrimeNumb() {
		int sumOfPrimeNum = 0;
		int countOfPrimeNumb = 0;
		for (int num = 2; num <= 100; num++) {
			boolean flag = true;
			for (int index = 2; index <= num / 2; index++) {
				if (num % index == 0) {
					flag = false;
					break;
				}
			}
		if (flag == true) {
			//System.out.print(num + " ");
			countOfPrimeNumb++;
			sumOfPrimeNum = sumOfPrimeNum + num;
		}
	}
		System.out.println("\nTotal prime numbers in range 2 to 100 are: " + countOfPrimeNumb);
		System.out.println("\nSum of  prime numbers in range 2 to 100 is: " + sumOfPrimeNum);
		System.out.println("\nAverage of prime numbers in range 2 to 100 is: " + (sumOfPrimeNum / countOfPrimeNumb));
	}

	public static void main(String[] args) {
		AllPrimeNumber allPrimeNumber = new AllPrimeNumber();
		int num = 15;
		allPrimeNumber.isPrime(num);
		allPrimeNumber.checkPrimeNumb();
		}
	}


