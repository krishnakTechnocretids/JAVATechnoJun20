/*
Program 1: Swap two numbers without using third variable.
Input: num1= 10, num2 =20
output: num1=20, num2 =10*/

package amitaRJun20;

public class SwapTwoNumbers {
	
	//method to display swapping of two numbers 
	void displaySwapNumber(int num1,int num2) {
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("Numbers After swap : num1 = "+num1+" num2 = "+num2);		
	}
	public static void main(String[] args) {
		SwapTwoNumbers swaptwonumbers=new SwapTwoNumbers();
		int num1=10,num2=20;
		System.out.println("Numbers before swap : num1 = "+num1+" num2 = "+num2);
		swaptwonumbers.displaySwapNumber(num1,num2);
	}
}