package rajAJun20;

public class PrimeNumberOperations {
	int sum = 0 ;
	int count = 0 ;
	
	boolean primeNumber(int number){
		boolean flag = false;
		for (int index = 2; index < number/Math.sqrt(number); index++) {
			if (number % index == 0) {
				flag = true;
				break;
			}
		}
		return flag;
	}	
	void numberIsPrimeorNot(int number) {
		if (primeNumber(number) == false)
			System.out.println(number + " is a Prime number");
		else
			System.out.println(number + " is not a prime number");
	}
	
	int totalCountOfPrimeNumbers(){
		
		for (int index = 2; index < 100; index++) {
			if(primeNumber(index) == false) {
				count++ ;
			} 
		}
			return count;	
	}

	int sumOfPrimeNumbers(){
		
		for(int index = 2 ; index < 100 ; index++ ) {
			if(primeNumber(index) == false)	{
			sum = sum + index;	
			}
		}
			return sum;
	}

	void avgOfPrimeNumbers(){
		System.out.println("Average of Prime Numbers are : " + sumOfPrimeNumbers()/totalCountOfPrimeNumbers());
	}
	
	public static void main(String[] args) {
		PrimeNumberOperations primeNumberOperations = new PrimeNumberOperations();
		int number = 23;
		primeNumberOperations.numberIsPrimeorNot(number);
		System.out.println("Total count of prime numbers between 2-100 are :" +primeNumberOperations.totalCountOfPrimeNumbers());
		System.out.println("Sum of prime numbers are : " + primeNumberOperations.sumOfPrimeNumbers());	
		primeNumberOperations.avgOfPrimeNumbers();
	}
}
