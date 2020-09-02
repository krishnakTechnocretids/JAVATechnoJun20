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
 */

package rajAJun20;

import java.util.ArrayList;

public class PinNumberValidation {

	public boolean checkAllDigit(String number) {
		for (int index = 1; index < number.length(); index++) {
			if (!Character.isDigit(number.charAt(index))) {
				return false;
			}
		}
		return true;
	} 

	public boolean checkAscendingOrder(String number) {
		for (int index = 1; index < number.length(); index++) {
			if (number.charAt(index) <= number.charAt(index - 1)) {
				return false;
			}
		}
		return true;
	}

	public boolean checkDescendingOrder(String number) {
		for (int index = 1; index < number.length(); index++) {
			if (number.charAt(index) >= number.charAt(index - 1)) {
				return false;
			}
		}
		return true;
	}

	void validatePinNumber(ArrayList<String> listOfPinNumbers) {

		for (int index = 0; index < listOfPinNumbers.size(); index++) {
			if (listOfPinNumbers.get(index).length() == 4) {
				String pinNumber = listOfPinNumbers.get(index);

				if (checkAllDigit(pinNumber) && checkAscendingOrder(pinNumber) || checkDescendingOrder(pinNumber)) {
					System.out.println(listOfPinNumbers.get(index) + " => Valid Pin Number");
				} else {
					System.out.println(listOfPinNumbers.get(index) + " => Invalid Pin Number");
				}
			}else
				System.out.println(listOfPinNumbers.get(index)+ " => Invalid Pin Number");
		}
	}

	public static void main(String[] args) {
		PinNumberValidation pinNumberValidation = new PinNumberValidation();

		ArrayList<String> list = new ArrayList<>();
		list.add("9654");
		list.add("3578");
		list.add("97A2");
		list.add("9553");
		list.add("3687");
		list.add("98765");
		list.add("76$2");

		pinNumberValidation.validatePinNumber(list);
	}
}
