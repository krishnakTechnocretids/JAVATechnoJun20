package maheshKJun20.NumbersExample;

public class FibonacciNumbers {
	
	void displayFibonacciNumber(int num) {
		int firstValue = 1, secondValue = 1, newValue = 0;
		System.out.print("\nFibonacci Series for " + num + " Output: " + firstValue + " " + secondValue);
		for (int index=1;index<num-1;index++) {
			newValue = firstValue + secondValue;
			firstValue = secondValue;
			secondValue = newValue;
			System.out.print(" " + newValue);
		}
		
	}
	
	public static void main(String[] args) {
		FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
		fibonacciNumbers.displayFibonacciNumber(6);
		fibonacciNumbers.displayFibonacciNumber(10);
	}
}
