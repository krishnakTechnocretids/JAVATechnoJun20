/*
	Swap two numbers without using third variable.
	Input: num1= 10, num2 =20
	output: num1=20, num2 =10
*/

package aditiGJUN20;

public class SwapNumbers {

	// Method to swap two numbers without using temp/third variable..
	void swapNumbers(int num1, int num2) {
		System.out.println("Input Numbers:\nNumber1= " + num1 + "\tNumber2= " + num2);
		num1 += num2;
		num2 = num1 - num2;
		num1 -= num2;
		System.out.println("\nAfter Swap: \nNumber1= " + num1 + "\tNumber2= " + num2);
	}

	public static void main(String[] args) {
		new SwapNumbers().swapNumbers(10, 20);
	}
}