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
		int no1 = 0, no2 = 1, no3, index;
		System.out.print( no2);
		for (index = 2; index <= count; ++index) {
			no3 = no1 + no2;
			System.out.print(" " + no3);
			no1 = no2;
			no2 = no3;
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
