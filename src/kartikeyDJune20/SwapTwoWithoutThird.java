package kartikeyDJune20;

public class SwapTwoWithoutThird {

	static void swapTwoNum(int num1, int num2) {
		num2 = num1 + num2;
		num1 = num2 - num1;
		num2 = num2 - num1;
		System.out.println("Swap of provided no. is" + (num1) + " & " + num2);
	}

	public static void main(String[] args) {
		SwapTwoWithoutThird.swapTwoNum(10, 20);
	}

}
