/*Swap two numbers without using third variable.
Input: num1= 10, num2 =20
output: num1=20, num2 =10
*/

package nikhilMJun20;

public class NumberSwap {
	void swapNum(int num1, int num2) {
		System.out.println("Originally Given Numbers:-\nNumber1 -> "+num1+"     Number2 -> "+num2);
		num1 += num2;
		num2 = num1 - num2;
		num1 -= num2;
		System.out.println("\nSwapped Numbers:-\nNumber1 -> "+num1+"     Number2 -> "+num2);
	}
	
	public static void main(String[] args) {
		int num1=25, num2=35;
		new NumberSwap().swapNum(num1, num2);
	}
}
