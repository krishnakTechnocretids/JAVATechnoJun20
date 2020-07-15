package kARAN1595;

public class FibonacciSeries {
	void printFibonacciNumbers(int input) {
		int num1 = 0, num2 = 1;
		if (input < 1)
			return;
		for (int index = 1; index <= input; index++) {
			System.out.print(num2 + " ");
			int next = num1 + num2;
			num1 = num2;
			num2 = next;
		}
	}

	public static void main(String[] args) {
		FibonacciSeries fibonacci = new FibonacciSeries();
		System.out.println("Fibonacci Number value 5:");
		fibonacci.printFibonacciNumbers(5);
		System.out.println("\nFibonacci Number value 10:");
		fibonacci.printFibonacciNumbers(10);
	}
}