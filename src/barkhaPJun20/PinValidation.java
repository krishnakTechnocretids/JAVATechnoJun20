/*WAP to validate Pin number.

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
package barkhaPJun20;

public class PinValidation {

	boolean isDigit(String pin) {
		for (int index = 0; index < pin.length(); index++) {
			if (Character.isDigit(pin.charAt(index)))
				return true;
		}
		return false;
	}

	boolean isUniqueNum(String pin) {
		for (int index = 0; index < pin.length(); index++) {
			for (int innerIndex = index + 1; innerIndex < pin.length(); innerIndex++) {
				if (pin.charAt(index) == pin.charAt(innerIndex)) {
					return false;
				}
			}
		}
		return true;
	}

	boolean isDescending(String pin) {
		for (int index = 1; index < pin.length(); index++) {
			if (pin.charAt(index) > pin.charAt(index - 1))
				return false;
		}
		return true;
	}

	boolean isAscending(String pin) {
		for (int index = 1; index < pin.length(); index++) {
			if (pin.charAt(index) < pin.charAt(index - 1))
				return false;
		}
		return true;
	}

	void validatePin(String pin) {

		if (pin.length() == 4) {
			if (isDigit(pin) && isUniqueNum(pin) && (isAscending(pin) || isDescending(pin))) {
				System.out.println(pin + " ==> Valid Pin");
			} else
				System.out.println(pin + " ==> Invalid Pin");
		} else
			System.out.println(pin + " ==> Invalid Pin");
	}

	public static void main(String[] args) {
		PinValidation PinValidation = new PinValidation();
		PinValidation.validatePin("9553");
	}
}