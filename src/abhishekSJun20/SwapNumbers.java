package abhishekSJun20;

public class SwapNumbers {
//method to swapping number
	void swappingNumbersWithoutThirdVariable(int num1, int num2) {
		System.out.println("Numbers after swapping: " + num1 + " " + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("Given Swapping numbers: " + num1 + " " + num2);
	}
	
	public static void main(String[] args) {
		SwapNumbers swapnumbers = new SwapNumbers();
		swapnumbers.swappingNumbersWithoutThirdVariable(10, 20);
	}
}
		
