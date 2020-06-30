package anshuKJun20;

public class SwapNumber {

	private void swapMethod(int number1, int number2) {
		System.out.println("Input = ("+number1+" "+number2+")");
		 number1 = number1*number2;
		 number2 = number1/number2;
	     number1 = number1/number2;
		display(number1, number2);
	}

	void display(int number1, int number2) {
		System.out.println("Output = ("+number1+" "+number2+")");
	}

	public static void main(String[] args) {
		SwapNumber swapno = new SwapNumber();
		swapno.swapMethod(10, 20);
		
	}
}
