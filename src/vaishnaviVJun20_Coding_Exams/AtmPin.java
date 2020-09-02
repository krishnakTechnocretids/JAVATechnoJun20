package vaishnaviVJun20_Coding_Exams;

import java.util.Arrays;

/* WAP to validate Pin number.

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
-> Without using collections. */

public class AtmPin {

	void validatePinNumber(String pin) {
		boolean flag = false;
		char[] chArray = pin.toCharArray();
		Arrays.sort(chArray);
		String sortedArray = String.valueOf(chArray);

		StringBuilder strReverse = new StringBuilder(sortedArray);
		strReverse.reverse();

		if (pin.length() == 4) {
			for (int index = 0; index < pin.length(); index++) {
				for (int innerIndex = index + 1; innerIndex < pin.length(); innerIndex++) {
					flag = false;
					if (Character.isDigit(pin.charAt(index))) {
						if (pin.lastIndexOf(pin.charAt(index)) == pin.indexOf(pin.charAt(index))) {
							if (pin.equals(sortedArray) || pin.equals(String.valueOf(strReverse)))
								flag = true;
						}
					}

				}
			}
			if (flag == true)
				System.out.println(pin + " :Valid Pin");
			else
				System.out.println(pin + " :Invalid Pin");

		} else
			System.out.println(pin + " :Invalid Pin");

	}

	public static void main(String[] args) {
		AtmPin atmPin = new AtmPin();
		String[] pinNum = { "9654", "3578", "97A2", "9553", "3687", "98765", "76@2" };
		for (int index = 0; index < pinNum.length; index++) {
			atmPin.validatePinNumber(pinNum[index]);
		}
	}

}
