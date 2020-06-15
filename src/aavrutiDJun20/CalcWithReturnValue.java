package aavrutiDJun20;

public class CalcWithReturnValue {

	int add(int number1, int number2) {
		return number1+number2;
	}
	
	int subtraction(int number1, int number2) {
		return number1-number2;
	}
	
	int multi(int number1, int number2) {
		return number1*number2;
	}
	
	int div(int number1, int number2) {
		return number2/number1;
	}
	
	public static void main(String[] args) {
		CalcWithReturnValue calcWithReturnValue = new CalcWithReturnValue();
		
		int totalSum = calcWithReturnValue.add(10,20) + calcWithReturnValue.subtraction(20,10) + calcWithReturnValue.multi(10,20) + calcWithReturnValue.div(10,20);
		
		System.out.println("Addition of numbers are: " + totalSum);
		
	}
}