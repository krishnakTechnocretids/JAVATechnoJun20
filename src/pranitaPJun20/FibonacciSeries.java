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
//Method to find Fibonacci series for given no of terms
	static void printFibonacciNumbers(int num1, int num2, int length) {
		int iterationValue = 2;// iteration starts from 3rd term
		int term1 = num1;
		int term2 = num2;
		System.out.print(term1 + "," + term2);// Printing values at index 0 and 1
		while (iterationValue < length) {
			int term3 = term1 + term2;
			System.out.print("," + term3);
			term1 = term2;
			term2 = term3;
			iterationValue++;
		}
		/*
		 * for(int iterationValue=2;iterationValue<=n;iterationValue++) { int
		 * term3=term1+term2; System.out.print(","+term3); term1=term2; term2=term3; }
		 */
	}

	public static void main(String[] args) {
		int term1 = 1, term2 = 1;
		int totalTerms1 = 6, totalTerms2= 10;
		System.out.println("\nFibonacci series for "+totalTerms1+" terms");
		FibonacciSeries.printFibonacciNumbers(term1, term2, totalTerms1);
		System.out.println("\nFibonacci series for "+totalTerms2+" terms");
		FibonacciSeries.printFibonacciNumbers(term1, term2, totalTerms2);
	}
}
