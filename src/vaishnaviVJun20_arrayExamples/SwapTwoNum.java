package vaishnaviVJun20_arrayExamples;

//Swap two numbers without using third variable.

public class SwapTwoNum {
	
	void swapTwoNumbers(int num1,int num2) {
		System.out.println("Values before swapping: X=" +num1 +", Y="+num2);
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		System.out.println("Values after swapping: X=" +num1 +", Y="+num2);
	}

	public static void main(String[] args) {
		SwapTwoNum swapTwoNum = new SwapTwoNum();
		int num1 = 10, num2=20;
		swapTwoNum.swapTwoNumbers(num1, num2);
	}
}
