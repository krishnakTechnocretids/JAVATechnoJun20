/*String input = "1Hh9PR34QP";
Hint : 1+9+3+4 [all digits]
output : 17

To convert char to Integer.
Points to be remember:
1) String can be converted to int but there is no direct method to convert char to int.
2) char has to be converted first to string and then to integer.
*/

package nikhilMJun20;

public class CharToInteger {
	void sumOfInts(String str) {
		int sum=0;
		for(int index=0; index<str.length(); index++) {
			if(Character.isDigit(str.charAt(index))) {
				sum += Integer.parseInt(String.valueOf((str.charAt(index))));
			}
		}
		System.out.println("Sum of digits in the String = "+sum);
	}
	
	public static void main(String[] args) {
		CharToInteger charToInteger = new CharToInteger();
		
		String str = "1Hh9PR34QP";
		charToInteger.sumOfInts(str);
	}
}
