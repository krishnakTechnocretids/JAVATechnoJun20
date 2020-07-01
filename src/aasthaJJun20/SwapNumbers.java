package aasthaJJun20;

public class SwapNumbers {
	void swap(int num1, int num2){
		System.out.println("Before Swapping, the values are : num1 = "+num1+", num2 = "+num2);
		num1 += num2;
		num2 = num1 - num2;
		num1 -= num2;
		System.out.println("After Swapping, the values are : num1 = "+num1+", num2 = "+num2);
	}
	
	public static void main(String[] args){
		SwapNumbers swapNumbers = new SwapNumbers();
		swapNumbers.swap(10,20);
	}
}