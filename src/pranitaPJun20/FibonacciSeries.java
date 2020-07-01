/*
 * Assignment 21 : 30th Jun 2020
Program 2: To print first n Fibonacci Numbers.
Input n = 5
Output = 1 1 2  3  5  8 

Input: n = 10 
Output :  1 1 2  3  5  8 13  21 34 55

Hint :
The next number is found by adding up the two numbers before it:
the 2 is found by adding the two numbers before it (1+1),
the 3 is found by adding the two numbers before it (1+2),
the 5 is (2+3),
and so on! 
 */
package pranitaPJun20;

public class FibonacciSeries {
	static void printFibonacciNumbers(int totalTerms) {
		System.out.println("\nFibonacci series to display first "+totalTerms+" numbers:");
		int previousNum = 0, nextNum = 1, sum = 0;
		for (int index = 0; index < totalTerms; index++) {
			System.out.print(nextNum + " ");
			sum = previousNum + nextNum;
			previousNum = nextNum;
			nextNum = sum;
		}
	}
	/*static void printFibonacciNumbers(int range) {
	System.out.println("\nFibonacci series to display first "+range+" numbers:");
	int term1 = 0, term2 = 1;
	System.out.print(term2);
	//generation starts from third term.hence iterationValue=2
	for (int iterationValue = 2; iterationValue <=range; iterationValue++) {
		int term3 = term1 + term2;
		System.out.print(" " + term3);
		term1 = term2;
		term2 = term3;
	}

}*/
	public static void main(String[] args) {
		FibonacciSeries.printFibonacciNumbers(5);
		FibonacciSeries.printFibonacciNumbers(10);
	}
}
