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
package palakSJun20;
import java.util.ArrayList;

public class ValidatePIN {

	void checkPinNumber(ArrayList<String> list) {
		int size = list.size();
		for (int index = 0; index < size; index++) {
			if (list.get(index).length() == 4) {
				String pinNumber = list.get(index);
				if (isAllDigit(pinNumber) && isAscendingOrder(pinNumber) || isDescendingOrder(pinNumber)) {
					System.out.println("Input : "+ list.get(index) + " -> Valid Number");
				} else {
					System.out.println("Input : "+ list.get(index) + " -> Invalid Number");
				}
			}else System.out.println("Input : " + list.get(index)+ " -> Invalid Number");
		}
	}

	public boolean isAscendingOrder(String number) {
		for (int index = 1; index < number.length(); index++) {
			if (number.charAt(index) <= number.charAt(index - 1)) {
				return false;
			}
		}
		return true;
	}

	public boolean isDescendingOrder(String number) {
		for (int index = 1; index < number.length(); index++) {
			if (number.charAt(index) >= number.charAt(index - 1)) {
				return false;
			}
		}
		return true;
	}

	public boolean isAllDigit(String number) {
		for (int index = 1; index < number.length(); index++) {
			if (!Character.isDigit(number.charAt(index))) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		ValidatePIN validatePIN = new ValidatePIN();

		ArrayList<String> list = new ArrayList<>();
		list.add("9654");
		list.add("3578");
		list.add("97A2");
		list.add("9553");
		list.add("3687");
		list.add("98765");
		list.add("76$2");
		validatePIN.checkPinNumber(list);
	}

}
