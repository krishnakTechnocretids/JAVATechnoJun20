/*
To convert char to Integer.
Points to be remember:
1) String can be converted to int but there is no direct method to convert char to int
2) char has to be coverted first to string and then to interger.
String input = "1Hh9PR34QP";
Hint : 1+9+3+4 [all digits]
output : 17
 */

package maheshKJun20;



public class SumOfDigitsInString {
	
	void sumOfDigits (String str) {
		int sum = 0;
		for (int index=0;index<str.length();index++) {
			if (Character.isDigit(str.charAt(index))) {
				sum += Integer.parseInt(str.valueOf(str.charAt(index)));
			}
		}
		System.out.println("Sum of all digits in String is: " + sum);
	}
	
	public static void main(String[] args) {
		SumOfDigitsInString sumOfDigitsInString = new SumOfDigitsInString();
		String str = "1Hh9PR34QP";
		sumOfDigitsInString.sumOfDigits(str);
	}

}
