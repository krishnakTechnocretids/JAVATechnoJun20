/*Program 2: To print first n Fibonacci Numbers.
Input n = 5
Output = 1 1 2  3  5  8 

Input: n = 10 
Output :  1 1 2  3  5  8 13  21 34 55*/
package amitaRJun20;

public class FibonacciNumbers {

	//method to display fibonacci series of input numbers
	void displayFibonacciNumbers(int number) {
		
		int startnum = 0, nextnum = 1, sum = 0;
		System.out.print(" " + nextnum);
		for (int index = 1; index <= number; index++) {
			sum = startnum + nextnum;
			System.out.print(" " + sum);
			startnum = nextnum;
			nextnum = sum;
		}
	}
	public static void main(String[] args) {
		FibonacciNumbers fibonaccinumbers = new FibonacciNumbers();
		int inputnumber = 5;
		System.out.println("Display first " + inputnumber + " Fibonacci series ");
		fibonaccinumbers.displayFibonacciNumbers(inputnumber);
		
		int inputnumber2 = 10;
		System.out.println("\nDisplay first " + inputnumber2 + " Fibonacci series ");
		fibonaccinumbers.displayFibonacciNumbers(inputnumber2);
	}
}