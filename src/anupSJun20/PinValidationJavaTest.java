package anupSJun20;
import java.util.ArrayList;
import java.util.Collections;

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
public class PinValidationJavaTest {
	public void pinvalidation(String[] num) {
		for (int index = 0; index < num.length; index++) {
			if (num[index].length() == 4) {
				try {
					int validPin = Integer.parseInt(num[index]);
					if (ascendingnumbers(validPin) || descendingnumbers(validPin)) {
						System.out.println("The pin is valid " + num[index]);
					} else {
						System.out.println("The pin is invalid " + num[index]);
					}
				} catch (Exception e) {
					System.out.println("The pin is invalid " + num[index]);
				}
			} else {
				System.out.println("The pin is invalid " + num[index]);
			}
		}

	}

	boolean ascendingnumbers(int num) {
		boolean flag = true;
		int currentNum;
		int temp2 = num;
		while (num > 0) {
			currentNum = num % 10;
			num = num / 10;
			if (currentNum < temp2) {
				temp2 = currentNum;
			} else {
				return false;
			}
		}

		return flag;
	}

	boolean descendingnumbers(int num) {
		boolean flag = true;
		int currentNum;
		int temp2 = 0;
		while (num > 0) {
			currentNum = num % 10;
			num = num / 10;
			if (currentNum > temp2) {
				temp2 = currentNum;
			} else {
				return false;
			}
		}

		return flag;
	}
	
	
	public static void main(String[] args) {
		PinValidationJavaTest validatePinNumber = new PinValidationJavaTest();
		String[] num = { "9654", "3578", "97A2", "9553", "3687", "98765", "76$2" };
		validatePinNumber.pinvalidation(num);
	}
}
