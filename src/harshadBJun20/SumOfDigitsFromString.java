package harshadBJun20;

/*String input = "1Hh9PR34QP";
Hint : 1+9+3+4 [all digits]
output : 17*/

public class SumOfDigitsFromString {
	
	void calSumOfDigits(String str) {
		int sumOfDigit=0;
		for(int index=0;index<str.length();index++) {
			if(!Character.isLetter(str.charAt(index))) {
				String charValue = String.valueOf(str.charAt(index));
				int digit = Integer.parseInt(charValue);
				sumOfDigit += digit;
			}
		}
		System.out.println("Sum of digits in String: "+sumOfDigit);	
	}
	
	public static void main(String[] args) {
		SumOfDigitsFromString sumOfDigitsFromString = new SumOfDigitsFromString();
		String str="1Hh9PR34QP";
		sumOfDigitsFromString.calSumOfDigits(str);
	}
}
