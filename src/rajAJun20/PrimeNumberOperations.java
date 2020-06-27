package rajAJun20;

public class PrimeNumberOperations {
	
	void numberIsPrimeOrNot(int number){
		boolean flag = false;
		for (int index = 2; index < number/Math.sqrt(number); index++) {
			if (number % 2 == 0) {
				flag = true;
				break;
			}
		}
		if (flag == true) {
			System.out.println("Number "+number+ " is not Prime");
		}
		else 
			System.out.println("Number "+ number+ " is Prime");
	}
	
	int totalCountOfPrimeNumbers(){
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

	int sumOfPrimeNumbers(){
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

	void avgOfPrimeNumbers(){
		System.out.println("Average of Prime Numbers are : " + sumOfPrimeNumbers()/totalCountOfPrimeNumbers());
	}
	
	public static void main(String[] args) {
		PrimeNumberOperations primeNumberOperations = new PrimeNumberOperations();
		int number = 23;
		primeNumberOperations.numberIsPrimeOrNot(number);
		System.out.println("Count of Prime numbers are :" + primeNumberOperations.totalCountOfPrimeNumbers());
		System.out.println("Sum of Prime numbers are : " + primeNumberOperations.sumOfPrimeNumbers());	
		primeNumberOperations.avgOfPrimeNumbers();
	}
}
