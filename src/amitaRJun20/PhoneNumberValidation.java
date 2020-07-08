/*Validate given phone number.

+91 9765463742 --> valid
09765463742 --> valid
976 546 3742 --> valid
9765463742 --> valid

9765463A42 --> Invalid
976546342 --> Invalid
6976546342 --> Invalid

Note : phone number is given in String format.*/
package amitaRJun20;

public class PhoneNumberValidation {
	// method to if number contains only digit
	boolean isNumber(String phoneNumber) {
		phoneNumber = phoneNumber.replaceAll("\\+", "0").replaceAll(" ", "");
		for (int index = 0; index < phoneNumber.length(); index++) {
			if (!Character.isDigit(phoneNumber.charAt(index))) {
				return false;
			}
		}
		return true;
	}

	// method to check if phone number starts with +91
	boolean isValidCountryCode(String phoneNumber) {
		if (phoneNumber.startsWith("+91")) {
			return true;
		} else {
			System.out.println("\nplease enter correct country code");
			return false;
		}
	}

	// method to check if 10 digit phone number starts with 9/8/7
	boolean isFirstDigit(char ch) {
		if (ch == '9' || ch == '8' || ch == '7') {
			return true;
		}
		return false;
	}

	// method to check phone number validation
	void checkValidPhoneNumbers(String phoneNumber) {
		switch (phoneNumber.length()) {

		case 14:
			if (isNumber(phoneNumber) && isValidCountryCode(phoneNumber) && isFirstDigit(phoneNumber.charAt(4)))
				System.out.println(phoneNumber + "  is valid\n");
			else
				System.out.println(phoneNumber + " is Invalid\n");
			break;
		case 12:
			if (isNumber(phoneNumber.replace(" ", "")) && (phoneNumber.charAt(3) == ' ')
					&& (phoneNumber.charAt(7) == ' ') && (isFirstDigit(phoneNumber.charAt(0))))
				System.out.println(phoneNumber + "  is valid\n");
			else
				System.out.println(phoneNumber + " is Invalid\n");
			break;
		case 11:
			if (isNumber(phoneNumber) && (phoneNumber.startsWith("0")) && isFirstDigit(phoneNumber.charAt(1)))
				System.out.println(phoneNumber + "  is valid\n");
			else
				System.out.println(phoneNumber + " is Invalid\n");
			break;
		case 10:
			if (isNumber(phoneNumber) && isFirstDigit(phoneNumber.charAt(0)))
				System.out.println(phoneNumber + "  is valid\n");
			else
				System.out.println(phoneNumber + " is Invalid\n");
			break;
		default:
			System.out.println(phoneNumber + " number is invalid\n");
		}
	}

	public static void main(String[] args) {
		PhoneNumberValidation phNumberValidation = new PhoneNumberValidation();
		String[] phoneNumber = { "+91 7894561232", "+81 7894561230", "+91W 789456321", "-9178945612303",
				"+91 564123987", "0000000000", "w789456123", "09321456987", "789 456 1233", "789k456123", "9765463742",
				"976 546 3742", "5641230456" };
		for (int index = 0; index < phoneNumber.length; index++) {
			phNumberValidation.checkValidPhoneNumbers(phoneNumber[index]);
		}
	}
}