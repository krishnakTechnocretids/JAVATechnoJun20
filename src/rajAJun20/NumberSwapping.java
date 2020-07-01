package rajAJun20;

public class NumberSwapping {
	
	void displaySwapNumbers(int num1 , int num2) {
		System.out.println("Number before swapping is : " +num1+ " & " +num2);
		num1 = num1 + num2; //30
		num2 = num1 - num2; //10
		num1 = num1 - num2; //20
		System.out.println("Number after swapping is : " +num1+ " & " +num2);
	}

	public static void main(String[] args) {
		NumberSwapping numberSwap = new NumberSwapping();
		numberSwap.displaySwapNumbers(10, 20);
	}
}
