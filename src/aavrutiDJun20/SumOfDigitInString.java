package aavrutiDJun20;

public class SumOfDigitInString {
	
	void sumOfDigit(String input){
		int sum = 0;
		for(int index=0;index<input.length();index++){
			char ch = input.charAt(index);
			if(Character.isDigit(ch) == true)
				sum += Integer.parseInt(String.valueOf(ch));
		}
		System.out.println("Sum of Digit is " + sum);
	}
	
	public static void main(String[] args){
		SumOfDigitInString sumOfDigitInString = new SumOfDigitInString();
		String input = "1Hh9PR34QP";
		sumOfDigitInString.sumOfDigit(input);
	}
}
