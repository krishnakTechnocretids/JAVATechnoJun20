/*
Assignment 24 :- Validate given phone number.
+91 9765463742 --> valid
09765463742 --> valid
976 546 3742 --> valid
9765463742 --> valid

9765463A42 --> Invalid
976546342 --> Invalid
6976546342 --> Invalid

Note : phone number is given in String format.
Please get approval from your reviewer before 9 PM Monday.
*/

package aditiGJUN20;

public class MobileNumberValidation {

	// Method to validate length of phone number
	boolean isValidLength(String inputNumber) {
		boolean validLength = true;
		String mobNumber = inputNumber.replace("+91", "").replaceAll(" ", "");
		if (mobNumber.length() < 10) {
			System.out.println(inputNumber + " -> Invalid Phone Number -> Phone number must be of 10 digit");
			validLength = false;
		} else if (inputNumber.length() > 14) {
			System.out.println(inputNumber + "-> Invalid Phone Number -> Phone number must be of 10 digit");
			validLength = false;
		}
		return validLength;
	}

	// Method to check mobile number contains letters
	boolean isContainLetter(String mobNumber) {
		boolean isLetter = true;
		for (int index = 0; index < mobNumber.length(); index++) {
			char inputChar = mobNumber.charAt(index);
			if (Character.isLetter(inputChar)) {
				isLetter = false;
				System.out.println(mobNumber + "-> Invalid Phone Number - Phone number must not contain Alphabets.");
				break;
			}
		}
		return isLetter;
	}

	// Method to check country valid country code (India -> +91).
	boolean isCountryCode(String mobNumber) {
		if (mobNumber.startsWith("+91"))
			return true;
		else {
			System.out.println(mobNumber + " -> Invalid Phone Number -> Enter correct country code.");
			return false;
		}
	}

	// Method to check phone number starts with 7/8/9
	boolean isFirstDigit(String mobNumber, char digit) {
		if (digit == '7' || digit == '8' || digit == '9')
			return true;
		else {
			System.out.println(mobNumber + " -> Invalid Number -> Number not starting with 7/8/9");
			return false;
		}
	}

	void validatePhoneNumber(String mobNumber) {
		switch (mobNumber.length()) {
		case 14:
			if (isCountryCode(mobNumber) && isValidLength(mobNumber) && isContainLetter(mobNumber)
					&& isFirstDigit(mobNumber, mobNumber.charAt(4))) {
				System.out.println(mobNumber + " -> Is Valid");
			} else
				System.out.println(mobNumber + " -> Is Invalid");
			break;

		case 12:
			if (isValidLength(mobNumber) && isContainLetter(mobNumber) && isFirstDigit(mobNumber, mobNumber.charAt(0))
					&& mobNumber.charAt(3) == ' ' && mobNumber.charAt(7) == ' ')
				System.out.println(mobNumber + " -> Is Valid");
			else
				System.out.println(mobNumber + " -> Is Invalid");
			break;

		case 11:
			if (mobNumber.startsWith("0") && isValidLength(mobNumber) && isContainLetter(mobNumber)
					&& isFirstDigit(mobNumber, mobNumber.charAt(1)))
				System.out.println(mobNumber + " -> Is Valid");
			else
				System.out.println(mobNumber + " -> Is Invalid");
			break;

		case 10:
			if (isValidLength(mobNumber) && isContainLetter(mobNumber) && isFirstDigit(mobNumber, mobNumber.charAt(0)))
				System.out.println(mobNumber + " -> Is Valid");
			else
				System.out.println(mobNumber + " -> Is Invalid");
			break;
		default:
			if (isValidLength(mobNumber))
				;
			if (isContainLetter(mobNumber))
				;
			if (isCountryCode(mobNumber))
				;
		}

	}

	public static void main(String[] args) {
		MobileNumberValidation mobileNumberValidation = new MobileNumberValidation();
		// String[] mobileNumber=" +91 aaaa678190";
		String[] phoneNumber = { "+91 9426205997", "942 620 5997", "09426205997", "9426205997", "9426205A97",
				"94262059", "+11 7426205997", "+32 34r567d99900" };
		for (int index = 0; index < phoneNumber.length; index++) {
			mobileNumberValidation.validatePhoneNumber(phoneNumber[index]);
			System.out.println("\n");
		}
	}
}
