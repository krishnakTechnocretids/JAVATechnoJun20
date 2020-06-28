package technoCredits.modifiers;

public class PrimeNumber {
	private int x;
	private boolean isPrime(int number) {
		System.out.println(x);
		return true;
	}
	
	void primeNumberInRange(int startNumber, int endNumber) {
		for(int index = startNumber; index<=endNumber;index++) {
			isPrime(index);
		}
	}
}
