package madhuraMJun20.scannerClass;

/*Program 1: Swap two numbers without using third variable.*/
public class SwapTwoNumbers {
	void swapNumbers(int num1, int num2) {
		System.out.println("Input -> Number 1 = " + num1 + ", Number 2 = " + num2);
		num2 = num1 + num2; // 30
		num1 = num2 - num1; // 20
		num2 = num2 - num1;
		System.out.println("Output -> Number 1 = " + num1 + ", Number 2 = " + num2);
	}

	public static void main(String[] args) {
		SwapTwoNumbers swapTwoNumbers = new SwapTwoNumbers();
		swapTwoNumbers.swapNumbers(10, 20);
	}
}