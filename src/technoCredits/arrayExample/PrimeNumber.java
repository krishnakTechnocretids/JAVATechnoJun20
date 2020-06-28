package technoCredits.arrayExample;

public class PrimeNumber {

	void isPrime(int number) {
		boolean flag = true;
		for(int index=2;index<=Math.sqrt(number);index++) {
			if(number %index == 0) {
				flag = false;
				return;
			}
		}
		if(flag == true) {
			System.out.println(number + " is prime");
		}else {
			System.out.println(number + " is not prime");
		}
	}
	
	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.isPrime(15);
		primeNumber.isPrime(16);
		primeNumber.isPrime(17);
	}
}
