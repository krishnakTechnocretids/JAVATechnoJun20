package shrutiDJun20Assignments;

public class SwapTwoNum {

	void numberSwap(int num1, int num2) {
		System.out
				.println("Number before swapping is : " + num1 + " , " + num2);
		num1 = num1 + num2;// 60=40+20
		num2 = num1 - num2;// 60-20
		num1 = num1 - num2; // 60-40
		System.out.println("Number after swapping is : " + num1 + " , " + num2);
	}

	public static void main(String[] args) {
		SwapTwoNum swapTwoNum = new SwapTwoNum();
		swapTwoNum.numberSwap(40, 20);
	}
}
