package harshadBJun20.Assignment21;

/*Assignment 21 : 30th Jun 2020

Program 1: Swap two numbers without using third variable.
Input: num1= 10, num2 =20
output: num1=20, num2 =10*/

public class SwapNumbersWithoutUsingThirdVar {
	
	void swapNumbers(int num1, int num2) {
		System.out.println("Before swapping Number 1: "+num1+" and Number 2: "+num2);
		
			num1 = num1 + num2;
			num2 = num1 - num2;
			num1 = num1 - num2;
		
		System.out.println("After swapping Number 1: "+num1+" and Number 2: "+num2);	
	}
	public static void main(String[] args) {
		SwapNumbersWithoutUsingThirdVar swapNumbersWithoutUsingThirdVar = new SwapNumbersWithoutUsingThirdVar();
		swapNumbersWithoutUsingThirdVar.swapNumbers(10, 20);
	}
}
