package ajitSJune20;

public class SwapOfNum {

	static void swapOperation(int num1, int num2) {
		System.out.println("Before swapping: num1= " + num1 + " num2= " + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("After  swapping: num1= " + num1 + " num2= " + num2);
	}

	public static void main(String[] args) {
		swapOperation(10, 20);
	}
}
