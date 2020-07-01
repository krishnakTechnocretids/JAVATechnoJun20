/*
 * To print first n Fibonacci Numbers.
 * Input n = 5
 * Output = 1 1 2  3  5  8 
 * Input: n = 10 
 * Output :  1 1 2  3  5  8 13  21 34 55
 * Hint :
 * The next number is found by adding up the two numbers before it:
 * the 2 is found by adding the two numbers before it (1+1),
 * the 3 is found by adding the two numbers before it (1+2),
 * the 5 is (2+3),and so on!
*/

package aditiGJUN20;

public class FibonacciSeries {
	// Method to display Fibonacci Series for requested number of elements and logic
	// to calculate fibonacci numbers.
	void displayFibonacciSeries(int elementCount) {
		System.out.println("\n\nFibonacci Series for first " + elementCount + " numbers: ");
		int lastNum = 0, nextNum = 1, sum = 0;
		for (int index = 0; index < elementCount; index++) {
			sum = lastNum + nextNum;
			System.out.print(nextNum + "  ");
			lastNum = nextNum;
			nextNum = sum;
		}
	}

	public static void main(String[] args) {
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		fibonacciSeries.displayFibonacciSeries(5);
		fibonacciSeries.displayFibonacciSeries(10);
	}
}