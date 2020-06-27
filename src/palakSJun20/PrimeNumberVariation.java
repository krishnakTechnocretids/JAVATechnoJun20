/* Program 1: Create a class to satisfy below requirements. 
                  a) Given number is prime or not. 
                  b) Print total count of prime numbers between 2->100.
                  c) Find sum of all prime numbers between 2->100
                  d) Find avg of prime numbers between 2->100*/
package palakSJun20;

public class PrimeNumberVariation {

		// Given number is prime or not. 
		void findGivenNumberPrimeOrNot(int number){
			boolean flag = false;
			for (int i = 2; i < number/Math.sqrt(number); i++) {
				if (number % 2 == 0) {
					flag = true;
					break;
				}
			}
			if (flag == true) {
				System.out.println("Number "+number+ " is not prime");
			}
			else 
				System.out.println("Number "+ number+ " is Prime");
		}
		
		//Print Total count of prime number b/w 2-100
		int printTotalCountOfPrimeNumber(){
			int count = 0;
			for (int i = 2; i < 100; i++) {
				boolean flag = false;
				for (int j = 2; j < i ; j++) {
					if(i % j == 0 ) {
						flag = true;
						break;
					}
				}
				if(flag == false){
					count++;
				}
			}
			return count;
		}
		
		//Find sum of all prime numbers between 2->100
		int findSumOfPrimeNumbers(){
			int sum = 0;
			for (int i = 2; i < 100; i++) {
				boolean flag = false;
				for (int j = 2; j < i; j++) {
					if ( i%j == 0) {
						flag = true;
						break;
					}
				}
				if (flag == false) {
					sum = sum + i;
				}
			}
			return sum;
		}
		
		//Find avg of prime numbers between 2->100
		void findAvgOfPrimeNumber(){
			System.out.println("Average of Prime Number is : " + findSumOfPrimeNumbers()/printTotalCountOfPrimeNumber());
		}

		
	public static void main(String[] args) {
		PrimeNumberVariation primeNumberVariation = new PrimeNumberVariation();
		int number = 13;
		primeNumberVariation.findGivenNumberPrimeOrNot(number);
		
		//Calling Count of Prime number Method
		System.out.println("Total Count of Prine Number is : " +primeNumberVariation.printTotalCountOfPrimeNumber());
		
		//calling Sum of Prime Number Method 
		System.out.println("Total Sum of Prime Number is : "+primeNumberVariation.findSumOfPrimeNumbers());
		
		//Calling Average Method 
		primeNumberVariation.findAvgOfPrimeNumber();
		
	}

}
