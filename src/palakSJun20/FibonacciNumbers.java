/*Program 2: To print first n Fibonacci Numbers.
Input n = 5
Output = 1 1 2  3  5  8 

Input: n = 10 
Output :  1 1 2  3  5  8 13  21 34 55*/
package palakSJun20;

public class FibonacciNumbers {

	void printFibonacciSeries(int input) {
		int i = 0;
		int num1 = 0, num2 = 1, sum = 0;
		System.out.println("Input n = " + input);
		System.out.print(num2 + " "); // Printing 1st Number: 1

		while (i < input) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			i++;
			System.out.print(sum + " ");
		}
		System.out.print("\n");
	}

	public static void main(String[] args) {
		FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
		fibonacciNumbers.printFibonacciSeries(5);
		fibonacciNumbers.printFibonacciSeries(10);
	}
}
