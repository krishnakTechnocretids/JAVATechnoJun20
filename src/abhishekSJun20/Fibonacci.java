package abhishekSJun20;

public class Fibonacci {
	// Method to print Fibonacci Series
	void printFibonacciNumbers(int input) {
		int num1 = 0,num2 = 1, i;
		if (input < 1)
			return;
		for (i = 1; i <= input; i++) {
			System.out.print(num2 + " ");
			int next = num1 + num2;
			num1 = num2;
			num2 = next;
		}
	}

	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		System.out.println("Fibonacci Number output for value 5:");
		fibonacci.printFibonacciNumbers(5);
		System.out.println("\nFibonacci Number output for value 10:");
		fibonacci.printFibonacciNumbers(10);

	}
}
