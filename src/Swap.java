
public class Swap {
	static void swapNum(int num1, int num2) {
		num2 = num1 + num2;
		num1 = num2 - num1;
		num2 = num2 - num1;
		System.out.println(" Numbers After Swapping : " + (num1) + "," + num2);
	}

	public static void main(String[] args) {
		Swap.swapNum(10, 20);

	}
}
