package prashantCJune20;

public class SwapNumber {
	void swapNumbers(int number1,int number2) {		
		System.out.println("Before swaping num1 is "+number1+ "  num2 is "+number2);				
		number1=number1+number2;
		number2=number1-number2;
		number1=number1-number2;		
		System.out.println("After swaping num1 is "+number1+ "  num2 is "+number2);
	}	
	public static void main (String[] args){
		SwapNumber swap = new SwapNumber();
		swap.swapNumbers(20, 10);		
		}
}
