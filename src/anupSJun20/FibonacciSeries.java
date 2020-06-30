package anupSJun20;
/* Program 2: To print first n Fibonacci Numbers.
Input n = 6
Output = 1 1 2  3  5  8

Input: n = 10 
Output :  1 1 2  3  5  8 13  21 34 55

Hint :
The next number is found by adding up the two numbers before it:
the 2 is found by adding the two numbers before it (1+1),
the 3 is found by adding the two numbers before it (1+2),
the 5 is (2+3),
and so on! */

public class FibonacciSeries {
	static void calculateFibonacciSeries(int input) {
		int first = 0;
		int second = 1;
		int result;
		for (int index = 0; index < input; index++) {
			result = first + second;
			System.out.print(second + " ");
			first = second;
			second = result;
		}
	}

	public static void main(String[] args) {
		calculateFibonacciSeries(10);
	}
}