package maheshKJun20.NumbersExample;

public class FibonacciNumbers {
	
	void displayFibonacciNumber(int num) {
		int firstValue = 1, secondValue = 1, newValue = 0;
		System.out.print("Fibonacci Series for " + num + " Output: 1 1");
		for (int index=1;index<num;index++) {
			newValue = firstValue + secondValue;
			firstValue = secondValue;
			secondValue = newValue;
			System.out.print(" " + newValue);
		}
		System.out.println("");
		
	}
	
	public static void main(String[] args) {
		FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
		int num1 = 5, num2 = 10; 
		fibonacciNumbers.displayFibonacciNumber(num1);
		fibonacciNumbers.displayFibonacciNumber(num2);
	}
}
