/*
 * Assignment 21 : 30th Jun 2020

Program 1: Swap two numbers without using third variable.
Input: num1= 10, num2 =20
output: num1=20, num2 =10 
 */
package pranitaPJun20;

import java.util.Scanner;

public class SwapVariables {
	// Method to swap numbers using addition and subtraction
	void swapNumberUsingArithmaticOperator1(int num1, int num2) {
		num1 = num1 + num2;// (10+20=30)
		num2 = num1 - num2;// (30-20=10)
		num1 = num1 - num2;// (30-10=20)
		System.out.println("\nNumbers after swap \n num1 = " + num1 + "  num2 = " + num2);
	}

	/*// Method to swap numbers using division and multiplication
	void swapNumberUsingArithmaticOperator2(int num1, int num2) {
		num1 = num1 * num2;// 10*20=200
		num2 = num1 / num2;// 200/20=10
		num1 = num1 / num2;// 200/10=20
		System.out.println("\nNumbers after swap using Method 2 \n num1 = " + num1 + "  num2 = " + num2);
	}*/

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=scanner.nextInt();
		System.out.println("Enter second number");
		int num2=scanner.nextInt();
		SwapVariables swapVariables = new SwapVariables();
		swapVariables.swapNumberUsingArithmaticOperator1(num1, num2);
		//swapVariables.swapNumberUsingArithmaticOperator2(num1, num2);

	}
}
