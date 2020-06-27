/*
 * String input = "1Hh9PR34QP";
Hint : 1+9+3+4 [all digits]
output : 17
 */
package pranitaPJun20;

public class Test {
	
	public static void main(String[] args) {
		Test test=new  Test();
		String input ="1Hh9PR34QP";
		test.findSumDigitCharString(input);
	}
		
	void findSumDigitCharString(String input) {
		int countDigit=0;
		int sum=0;
		String temp ="";

		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
				if(Character.isDigit(ch)) {
					countDigit++;
					temp= String.valueOf(ch);
					int number1=Integer.parseInt(temp);
					sum=sum+number1;
				}
		}
			System.out.println("Sum of the digits in input string:"+sum);
			System.out.println("Count of the digits in input string:"+countDigit);
			

	}
}
