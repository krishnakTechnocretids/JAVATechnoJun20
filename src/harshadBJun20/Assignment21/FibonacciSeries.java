package harshadBJun20.Assignment21;
/*Program 2: To print first n Fibonacci Numbers.
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
	
	void printFibonacciSeries(int num) {
		int num1=0, num2=1;
		System.out.println("Fibonacci series for n: "+num);
		while(num>0) {
			num1 = num1 + num2;
			num2 = num1 - num2;
			System.out.print(num1+" ");
			num--;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		fibonacciSeries.printFibonacciSeries(6);
		fibonacciSeries.printFibonacciSeries(10);
	}
}
