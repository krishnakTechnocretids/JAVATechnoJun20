package aasthaJJun20;

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

public class AtmPinValidator {

	private boolean isAllCharsDigit(char[] input) {
		for (int index = 0; index < input.length; index++) {
			if (!Character.isDigit(input[index])) {
				return false;
			}
		}
		return true;
	}

	private boolean isAscendingOrder(char[] input) {
		for (int index = 1; index < input.length; index++) {
			if (input[index] <= input[index - 1])
				return false;
		}
		return true;
	}

	private boolean isDescendingOrder(char[] input) {
		for (int index = 1; index < input.length; index++) {
			if (input[index] >= input[index - 1])
				return false;
		}
		return true;
	}

	public void validatePin(String pin) {
		boolean flag = false;
		if (pin.length() == 4) {
			char[] arrPin = pin.toCharArray();
			if (isAllCharsDigit(arrPin) && (isAscendingOrder(arrPin) || isDescendingOrder(arrPin))) {
				flag = true;
			}
		}
		if (flag)
			System.out.println(pin + " -> Valid pin");
		else
			System.out.println(pin + " -> Invalid pin");
	}

	public static void main(String[] args) {
		AtmPinValidator atmPinValidator = new AtmPinValidator();
		String[] pins = { "9654", "3578", "97A2", "9553", "3687", "98765", "76$2", "1123", "4566", "0000", "9857" };
		for (int index = 0; index < pins.length; index++)
			atmPinValidator.validatePin(pins[index]);
	}
}

