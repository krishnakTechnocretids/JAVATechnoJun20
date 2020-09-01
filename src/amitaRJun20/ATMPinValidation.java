/*Java Programming Test  : 31st Aug 2020

WAP to validate Pin number.

Pin number is valid if it follows below rules :
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
-> Without using collections.*/
package amitaRJun20;

import java.util.Arrays;

public class ATMPinValidation {

	void atmPinVerify(String pinNum) {

		boolean flag = true;
		char[] chArr = pinNum.toCharArray();
		Arrays.sort(chArr);
		String pinSort = String.valueOf(chArr);
		// System.out.println(pinSort);

		StringBuilder atmPin = new StringBuilder(pinSort);
		atmPin.reverse();
		// System.out.println(atmPin);

		if (pinNum.length() == 4) { // length 4
			for (int index = 0; index < pinNum.length(); index++) {
				char ch = pinNum.charAt(index);
				if (Character.isDigit(ch)) { // is digit
					for (int innerIndex = index + 1; innerIndex < pinNum.length(); innerIndex++) {
						flag = true;
						if ((pinNum.lastIndexOf(ch) == pinNum.indexOf(ch))) { // repeated
							if ((pinNum.equals(pinSort) || pinNum.equals(String.valueOf(atmPin)))) {
								flag = false;
							}
						}
					}
				}
			}
			if (flag == false)
				System.out.println(pinNum + " --> is Valid pin");
			else
				System.out.println(pinNum + " --> Invalid pin");
		} else
			System.out.println(pinNum + " --> Invalid pin");
	}

	public static void main(String[] args) {
		ATMPinValidation atmPinValidation = new ATMPinValidation();
		String[] pinNumber = { "9654", "3578", "97A2", "9553", "3687", "98765", "76$2", "4821", "3927" };
		for (int index = 0; index < pinNumber.length; index++) {
			atmPinValidation.atmPinVerify(pinNumber[index]);
		}
	}
}
