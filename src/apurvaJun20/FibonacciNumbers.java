package apurvaJun20;

public class FibonacciNumbers {
	 void printFibonacciNumbers(int n) {
		int f1 = 0, f2 = 1, i;

		if (n < 1)
			return;

		for (i = 1; i <= n; i++) {
			System.out.print(f2 + " ");
			int next = f1 + f2;
			f1 = f2;
			f2 = next;
		}
	}

	public static void main(String[] args) {
		FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
		System.out.println("Fibonacci Number output for n's value 5:");
		fibonacciNumbers.printFibonacciNumbers(5);
		System.out.println("\nFibonacci Number output for n's value 10:");
		fibonacciNumbers.printFibonacciNumbers(10);

	}
}
