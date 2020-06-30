package swapnaWJun20;

public class FibonacciSeries {
	public static void main(String[] args) {
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		fibonacciSeries.calculateFibonacciSeries(5);
	}

	private void calculateFibonacciSeries(int input) {

		if (input == 0) {
			System.out.println("0");
		} else if (input == 1) {
			System.out.println("0 1");
		} else {
			int first = 0;
			int second = 1;
			int result;
			System.out.print("1 ");
			for (int index = 0; index < input; index++) {
				result = first + second;
				System.out.print(result + " ");
				first = second;
				second = result;
			}
		}
	}
}
