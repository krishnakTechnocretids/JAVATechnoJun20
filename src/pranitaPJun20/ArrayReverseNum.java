/*
 * Program 3: WAP to reverse number (Consider Input as Integer not as String).
Example:-
Input:- 12345
Output:- 54321
 */
package pranitaPJun20;

public class ArrayReverseNum {
	// Method to find the reverse of the given number
	void findReverseOfNumber(int number) {
		int reverse = 0;
		int input = number;
		while (number > 0) {
			int lastDigit = number % 10;
			reverse = (reverse * 10) + lastDigit;
			number = number / 10;
		}
		System.out.println("Revesre of number " + input + " is: " + reverse);
	}

	public static void main(String[] args) {
		int number = 12345;
		ArrayReverseNum arrayReverseNum = new ArrayReverseNum();
		arrayReverseNum.findReverseOfNumber(number);

	}

}
