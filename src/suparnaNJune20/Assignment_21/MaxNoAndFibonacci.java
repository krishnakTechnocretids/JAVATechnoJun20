/*
 * Assignment 21 : 30th Jun 2020


Program 2: To print first n Fibonacci Numbers.
Input n = 6
Output = 1 1 2  3  5  8

Input: n = 10 
Output :  1 1 2  3  5  8 13  21 34 55

 */
package suparnaNJune20.Assignment_21;

public class MaxNoAndFibonacci {
	void fibonacciSeries(int count) {
		int num1 = 0, num2=1;
		int num =num1+num2; //1 
		for(int index=1; index<=count; index++) {
			System.out.print(num+" "); 
			num = num1 + num2; 
			num1= num2; 
		    num2 = num; 
		}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(" \n\n fibonacci Seriesn n = 6 \n ");
		new MaxNoAndFibonacci().fibonacciSeries(6);
		System.out.print(" \n\n fibonacci Seriesn n = 10 \n ");
		new MaxNoAndFibonacci().fibonacciSeries(10);
	}
}
