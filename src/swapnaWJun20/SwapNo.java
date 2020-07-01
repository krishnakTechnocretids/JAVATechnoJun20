package swapnaWJun20;

public class SwapNo {

	void doSwapNo(int num1, int num2) {
		System.out.println("Input : num1 : " + num1 + ", Two : " + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("Output : num1 : " + num1 + ", Two : " + num2);
	}

	public static void main(String[] args) {
		SwapNo swapNo = new SwapNo();
		swapNo.doSwapNo(10, 20);
	}
}