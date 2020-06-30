/*Program 1: Swap two numbers without using third variable.
Input: num1= 10, num2 =20
output: num1=20, num2 =10*/


package archanaNJun20;

public class SwapNumbers {
	void swapNumber(int num1,int num2){
		System.out.println("Before swap--> num1: "+num1 +" num2: "+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After swap--> num1 : "+num1 +" num2 : "+num2);
	}
	public static void main(String[] args){
		SwapNumbers swapNumbers=new SwapNumbers();
		swapNumbers.swapNumber(10,20);
		swapNumbers.swapNumber(12,15);
	}
}