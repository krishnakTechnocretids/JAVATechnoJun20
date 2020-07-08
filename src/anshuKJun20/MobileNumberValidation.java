package anshuKJun20;

import java.util.Scanner;

public class MobileNumberValidation {

	static Scanner scanner = new Scanner(System.in);

	void validatePhoneNumber(String number) {
		int length = number.length();
		if (length == 14 || length == 13) {         /// for number like +91 8340359932
			String string1 = new String("+91");
			String string2 = new String(number.substring(0, 3));
			if (string1.equals(string2)) {  // if number equals to +91 
				if (number.charAt(3) == ' ') { /// 3rd index must have space
					if (checkIsThisAllNumber(number) && Integer.parseInt(number.substring(4, 5)) > 6) { // for number start with 7/8/9.
						System.out.println("Accepted your mobile number");
					} else {
						System.out.println("Indian number starts with 7/8/9.Please check it once.");
					}
				} else {
					System.out.println("please enter space after +91");
				}
			} else {
				System.out.println("Please enter valid std code of India ");
			}
		} else if (length == 12) { // for number like 834 035 9932 
			if (number.charAt(3) == ' ' && number.charAt(7) == ' ') { // space after 3rd and 7th index
				if (checkIsThisAllNumber(number.replace(" ", ""))
						&& Integer.parseInt(number.replace(" ", "").substring(0, 1)) > 6) { // 834 035 9932 becomes 8340359932 and  number start with 7/8/9
					System.out.println("Accepted your mobile number");
				} else {
					System.out.println("Only number and number start with 7/8/9. Kindly check it once");
				}
			} else {
				System.out.println("Please enter your number like 000 000 0000");
			}
		}

		else if (length == 11) { // 08340359932
			if (number.charAt(0) == '0') {
				if (checkIsThisAllNumber(number) && Integer.parseInt(number.substring(1, 2)) > 6) { // number start with 7/8/9
					System.out.println("Accepted your mobile number");
				} else {
					System.out.println("Only number and number start with 7/8/9. Kindly check it once");
				}
			} else {
				System.out.println("Number start with 0");
			}
		}

		else if (length == 10) { // for number like 8340359932
			if (checkIsThisAllNumber(number) && Integer.parseInt(number.substring(0, 1)) > 6) {
				System.out.println("Accepted Your number");
			} else {
				System.out.println("Only number and number start with 7/8/9. Kindly check it once");
			}
		} else {
			System.out.println("Your mobile number length is not valid.Kindly check it");
		}
	}

	boolean checkIsThisAllNumber(String string) { // doesn't accept nay character in mumber.
		for (int index = 0; index < string.length(); index++) {
			if (Character.isLetter(string.charAt(index))) { 
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		MobileNumberValidation mobileNumberValidation = new MobileNumberValidation();
		String proceed = "";
		do {
			System.out.println("Enter your Mobilenumber :");
			String number = scanner.nextLine();
			mobileNumberValidation.validatePhoneNumber(number);
			System.out.println("Do you wnat to proceed again ? if yes press y & n for no://");
			proceed = scanner.nextLine();
		} while (proceed.equals("y"));
		scanner.close();
	}
}
