/*Pin number is valid if it follows below rules :
1) ATM pin length should be 4.
2) All characters must be digit.
3) Either all digits are in ascending order or in descending order. 
4) Same digit should not be repeated in a pin number.

Input : 9654 -> Valid pin
Input : 3578 -> Valid pin
Input : 97A2 -> Invalid pin
Input : 9553 -> Invalid pin
Input : 3687 -> Invalid pin
Input : 98765 -> Invalid pin
Input : 76$2 -> Invalid pin

It would be great if you think solution by below approach :
-> One with collections.
-> Without using collections.
*/

package aditiGJUN20;

import java.util.*;

public class ATMPinValidations {

	void validatePIN(String inputPIN) {
		if (inputPIN.length() == 4) {
			if (validateAllDigits(inputPIN) && isrepeated(inputPIN) && isAscending(inputPIN)
					|| isDescending(inputPIN))
				System.out.println(inputPIN + " -> Valid Pin");
			else
				System.out.println(inputPIN + " -> Invalid Pin");
		} else {
			System.out.println(inputPIN + " -> Invalid Pin");
		}
	}

	boolean validateAllDigits(String inputPIN) {
		boolean flag = true;
		for (int index = 0; index < inputPIN.length(); index++) {
			if (!(inputPIN.charAt(index) >= '0' && inputPIN.charAt(index) <= '9')) {
				flag = false;
			}
		}
		return flag;
	}

	boolean isrepeated(String inputPIN) {
		boolean flag = true;
		Set<Character> charSet = new HashSet<Character>();
		for (int index = 0; index < inputPIN.length(); index++) {
			if (charSet.add(inputPIN.charAt(index)) == false)
				flag = false;
		}
		return flag;
	}

	boolean isAscending(String inputPIN) {
		boolean flag = true;
		for (int index = 1; index < inputPIN.length(); index++) {
			if (inputPIN.charAt(index) <= inputPIN.charAt(index - 1)) {
				flag = false;
			}
		}
		return flag;
	}

	boolean isDescending(String inputPIN) {
		boolean flag = true;
		for (int index = 1; index < inputPIN.length(); index++) {
			if (inputPIN.charAt(index) >= inputPIN.charAt(index - 1)) {
				flag = false;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		ATMPinValidations atmPinValidations = new ATMPinValidations();
		String[] inputPIN = { "9654", "3578", "97A2", "9553", "3687", "98765", "76$2", "9876" };
		for (int index = 0; index < inputPIN.length; index++) {
			atmPinValidations.validatePIN(inputPIN[index]);
		}
	}
}
