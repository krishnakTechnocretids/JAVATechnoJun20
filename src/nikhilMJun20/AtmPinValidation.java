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

It would be great if you think solution by below approach :
-> One with collections.
-> Without using collections.
*/

package nikhilMJun20;

import java.util.Arrays;

public class AtmPinValidation {
	static void validate(String pin) {
			//Checking PIN length
			if(pin.length() != 4) {
				System.out.println(pin+" ---> Invalid PIN");
				return;
			}
			
			//Checking for all numerical value
			char[] num = pin.toCharArray();
			for(int index = 0; index<num.length; index++) {
				if(!Character.isDigit(num[index])) {
					System.out.println(pin+" ---> Invalid PIN");
					return;
				}
			}
			
			//Checking for repeated digits
			for(int index = 0; index<num.length; index++) {
				for(int innerIndex = index+1; innerIndex<num.length; innerIndex++) {
					if(num[index] == num[innerIndex]) {
						System.out.println(pin+" ---> Invalid PIN");
						return;
					}
				}
			}
			
			//Checking ascending or descending order
			StringBuilder strNum = new StringBuilder(pin);
			strNum.reverse();
			Arrays.sort(num);
			String newPin = String.valueOf(num);
			if(!(pin.equals(newPin) || newPin.equals(String.valueOf(strNum)))) {
				System.out.println(pin+" ---> Invalid PIN");
				return;
			}
			
			System.out.println(pin+" ---> Valid PIN");
	}
	
	public static void main(String[] args) {
		String[] pinArray = {"9654", "3578", "97A2", "9553", "3687", "98765", "76$2"};
		for(int index = 0; index<pinArray.length; index++) {
			validate(pinArray[index]);
		}
	}
}
