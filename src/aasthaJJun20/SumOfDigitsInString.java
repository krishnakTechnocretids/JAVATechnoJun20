package aasthaJJun20;

public class SumOfDigitsInString {
	void findSumOfDigits(String input){
		int sum = 0;
		for(int index=0; index<input.length(); index++){
			if(Character.isDigit(input.charAt(index))){
				sum += Integer.parseInt(String.valueOf(input.charAt(index)));
			}
		}
		System.out.println("Sum of Digits in provided String '"+input+"' is = "+sum);
	}
	
	public static void main(String[] args){
		SumOfDigitsInString sumOfDigitsInString = new SumOfDigitsInString();
		sumOfDigitsInString.findSumOfDigits("1Hh9PR34QP");
	}
}
