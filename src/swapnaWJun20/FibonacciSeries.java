package swapnaWJun20;

public class FibonacciSeries {
	public static void main(String[] args) {
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		fibonacciSeries.calculateFibonacciSeries(5);
	}

	private void calculateFibonacciSeries(int input) {
		System.out.println("Fibonacci Series for " + input + " numbers : ");
		int first = 0;
		int second = 1;
		int result = 0;

		for (int index = 0; index < input; index++) {
			result = first + second;
			System.out.print(second + " ");
			first = second;
			second = result;
		}
	}
}