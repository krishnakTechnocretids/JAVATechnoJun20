//print Fibonacci series
package aavrutiDJun20;

public class FibonacciSeries {
	
	void printFibonacciSeries(int totalNum) {
		int fibonacciCount = 1;
		int num1 = 0;
		int num2 = 1;
		System.out.println("Fibonacci Series for input " + totalNum + " is:\n");
		do {
			System.out.print(num2 + " ");
			num2 = num1 + num2;
			num1 = num2 - num1;			
			fibonacciCount++;
		}while(fibonacciCount<=totalNum);
	}

	public static void main(String[] args) {
		FibonacciSeries fibonacciSeries = new  FibonacciSeries();
		fibonacciSeries.printFibonacciSeries(10);
	}
}