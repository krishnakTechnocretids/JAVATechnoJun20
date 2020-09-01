package madhuraMJun20.assignment30Plus;

import java.util.Arrays;

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
public class Exam_11_ValidatePinNumber {
	void pinValidations(String input) {

		String pin = "";
		if (input.length() == 4) {
			for (int index = 0; index < 4; index++) {
				char ch = input.charAt(index);
				if (Character.isDigit(ch)) {
					if (input.lastIndexOf(ch) == input.indexOf(ch)) {
						pin = ch + pin;

						if (pin.length() == 4) {
							char[] array = pin.toCharArray();
							Arrays.sort(array);
							String pinSorted = String.valueOf(array);

							StringBuilder pinReverse = new StringBuilder(pinSorted);
							pinReverse.reverse();
							if (input.equals(pinSorted) || input.equals(String.valueOf(pinReverse))) {
								System.out.println(input + " ---> Valid PIN");
							} else {
								System.out.println(input + " --> Invalid PIN");
							}
						}

					} else {
						System.out.println(input + " --> Invalid PIN");
					}
				} else {
					System.out.println(input + " --> Invalid PIN");
				}
			}

		} else {
			System.out.println(input + "  --> Invalid PIN");
		}
	}

	public static void main(String[] args) {
		Exam_11_ValidatePinNumber exam_11_ValidatePinNumber = new Exam_11_ValidatePinNumber();
		String[] inputArray = { "9654", "3578", "97A2", "9553", "3687", "98765", "76$2" };
		for (int index = 0; index < inputArray.length; index++) {
			exam_11_ValidatePinNumber.pinValidations(inputArray[index]);
		}
	}
}