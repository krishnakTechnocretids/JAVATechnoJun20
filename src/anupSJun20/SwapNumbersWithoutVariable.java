package anupSJun20;
/*Program 1: Swap two numbers without using third variable.
Input: num1= 10, num2 =20
output: num1=20, num2 =10*/

public class SwapNumbersWithoutVariable {
	static void swapTwoNumbers(int number1,int number2) {
		System.out.println(" The numbers before swap are " + "Number1 = "+number1 +" Number 2 = " +number2);
		number1 = number1+number2;
		number2 = number1 -number2;
		number1 = number1 - number2;
		System.out.println(" The numbers before swap are " + "Number1 = "+number1 +" Number 2 = " +number2);
	}
	
	public static void main(String[] args) {
		swapTwoNumbers(10,20);
	}
}