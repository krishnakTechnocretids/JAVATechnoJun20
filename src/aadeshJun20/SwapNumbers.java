package aadeshJun20;

public class SwapNumbers {

	void displaySwapping(int num1, int num2) {
		System.out.println("Input number 1= " + num1 + ", number 2 = " + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("output: num1= " + num1 + ", num2 = " + num2);
	}

	
	public static void main(String[] args) {
		SwapNumbers swapTwoNumbers = new SwapNumbers();
		int num1 = 200, num2 = 88;
		swapTwoNumbers.displaySwapping(num1, num2);
	}

}