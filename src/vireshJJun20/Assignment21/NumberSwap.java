/*
Program 1: Swap two numbers without using third variable.
Input: num1= 10, num2 =20
output: num1=20, num2 =10
*/

package vireshJJun20.Assignment21;

public class NumberSwap {

	void getSwappedNumber(int num1, int num2) {
		System.out.println("Before Swapping: " + num1 + " " + num2);
		num1 += num2;
		num2 = num1 - num2;
		num1 = num1 - num2; 
		System.out.println("After Swapping: " + num1 + " " + num2);
	}

	public static void main(String[] args) {
		new NumberSwap().getSwappedNumber(10, 20);
	}
}
