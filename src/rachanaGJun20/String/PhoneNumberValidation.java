/*Assignment 24 :- 5th Jul'2020 
Validate given phone number.

+91 9765463742 --> valid
09765463742 --> valid
976 546 3742 --> valid
9765463742 --> valid

9765463A42 --> Invalid
976546342 --> Invalid
6976546342 --> Invalid

Note : phone number is given in String format.*/
package rachanaGJun20.String;

public class PhoneNumberValidation {
	// method will validate given number for prefix
	void validatePhNumber(String phoneNumber) {

		phoneNumber = phoneNumber.replaceAll(" ", "");

		if (phoneNumber.startsWith("+91")) {
			phoneNumber = phoneNumber.substring(3);
			validNumber(phoneNumber);
		} else if (phoneNumber.startsWith("0")) {
			phoneNumber = phoneNumber.substring(1);
			validNumber(phoneNumber);
		} else
			validNumber(phoneNumber);
	}

	// method will perform required validations on given phone number
	void validNumber(String phoneNumber) {
		if (phoneNumber.length() == 10) {
			if (phoneNumber.startsWith("9") || phoneNumber.startsWith("8") || phoneNumber.startsWith("7")) {
				if (isAllDigits(phoneNumber)) {
					System.out.println("Number is Valid");
				} else
					System.out.println("Number not valid");
			} else
				System.out.println("Number not valid");
		} else
			System.out.println("Number not valid");
	}

	// it will check that number does not contains any character
	boolean isAllDigits(String phoneNumber) {

		boolean flag = true;
		for (int index = 1; index < phoneNumber.length(); index++) {
			if (!Character.isDigit(phoneNumber.charAt(index))) {
				flag = false;
			}
		}
		if (flag)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		PhoneNumberValidation phonenumbervalidation = new PhoneNumberValidation();
		String[] phNumber = { "+91 9765463742", "09765463742", "976 546 3742", "9765463742", "9765463A42", "976546342",
				"6976546342" };
		for (int i = 0; i < phNumber.length; i++) {
			phonenumbervalidation.validatePhNumber(phNumber[i]);
		}
	}
}
