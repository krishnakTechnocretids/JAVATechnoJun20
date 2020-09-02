/*
 Java Programming Test  : 31st Aug 2020

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

 */

package vireshJJun20.codingExam31Aug;

import java.util.Arrays;

public class FindValidPIN {

	public void validatePIN(String[] arr) {
		String pin = "";
		boolean isDigit = false;
		boolean islength = false;
		char[] charArrPin;
		String acsendingPin, descendingPin;
		StringBuilder sbuilder;
		for (int arrIndex = 0; arrIndex < arr.length; arrIndex++) {
			islength = false;
			pin = arr[arrIndex];

			if (arr[arrIndex].length() == 4) {
				islength = true;
				for (int oIndex = 0; oIndex < pin.length(); oIndex++) {
					// isDigit = true;
					for (int iIndex = oIndex + 1; iIndex < pin.length(); iIndex++) {
						if (Character.isDigit(pin.charAt(oIndex))) {
							charArrPin = pin.toCharArray();
							Arrays.sort(charArrPin);
							acsendingPin = String.valueOf(charArrPin);
							sbuilder = new StringBuilder(acsendingPin);
							descendingPin = String.valueOf(sbuilder.reverse());
							if (pin.lastIndexOf(pin.charAt(oIndex)) == pin.indexOf(pin.charAt(oIndex))) {
								if (pin.equals(acsendingPin) || pin.equals(descendingPin)) {
									isDigit = true;
								}
							} else if (!(pin.lastIndexOf(pin.charAt(oIndex)) == pin.indexOf(pin.charAt(oIndex)))) {
								isDigit = false;
							}
						} else if (!(Character.isDigit(pin.charAt(oIndex)))) {
							isDigit = false;
						}
					}
				}
			}
			if (islength == true && isDigit == true)
				System.out.println(pin + ": Valid PIN");
			else
				System.out.println(pin + ": Invalid PIN");
		}
	}

	public static void main(String[] args) {
		FindValidPIN vpin = new FindValidPIN();
		String[] arr = { "9654", "3578", "97A2", "9553", "3687", "98765", "76$2" };
		vpin.validatePIN(arr);
	}
}
