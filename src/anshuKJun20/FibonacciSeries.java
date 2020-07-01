package anshuKJun20;

public class FibonacciSeries {

	private void findFibbonacciSeries(int count) {
		System.out.println('\n' + "The fibonacci Series upto " + count + ":");
		int number1 = 0, number2 = 1;
		display(number2);
		for (int index = 1; index < count; index++) {
			int sum = number1 + number2;
			display(sum);
			number1 = number2;
			number2 = sum;
		}
	}

	void display(int number3) {
		System.out.print(number3 + " ");
	}

	public static void main(String[] args) {
		FibonacciSeries fibonacciseries = new FibonacciSeries();
		fibonacciseries.findFibbonacciSeries(5);
		fibonacciseries.findFibbonacciSeries(10);
	}

}
