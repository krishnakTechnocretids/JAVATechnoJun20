package aasthaJJun20;

//Assignment-24 - Validate given phone number 
public class ValidateMobileNumber {
	// below method checks if there is any alphabet or special char in given number
	private boolean isNumber(String number) {
		for (int index = 0; index < number.length(); index++) {
			if (!Character.isDigit(number.charAt(index)))
				return false;
		}
		return true;
	}

	// below method checks if the given number starts with 9/8/7
	private boolean checkFirstDigit(char ch) {
		if (ch == '9' || ch == '8' || ch == '7')
			return true;
		return false;
	}

	public void verifyMobileNumber(String number) {
		switch (number.length()) {
		// below case - is to validate numbers like : +91 9765463742
		case 14:
			if ((number.startsWith("+91 ")) && (checkFirstDigit(number.charAt(4))) && isNumber(number.substring(4)))
				System.out.println(number + " --> Valid");
			else
				System.out.println(number + " --> Invalid");
			break;
		// below case - is to validate numbers like : 976 546 3742
		case 12:
			if ((number.charAt(3) == ' ') && (number.charAt(7) == ' ') && (checkFirstDigit(number.charAt(0)))
					&& isNumber(number.replace(" ", "")))
				System.out.println(number + " --> Valid");
			else
				System.out.println(number + " --> Invalid");
			break;
		// below case - is to validate numbers like : 09765463742
		case 11:
			if ((number.startsWith("0")) && (checkFirstDigit(number.charAt(1))) && isNumber(number))
				System.out.println(number + " --> Valid");
			else
				System.out.println(number + " --> Invalid");
			break;
		// below case - is to validate numbers like : 9765463742
		case 10:
			if ((checkFirstDigit(number.charAt(0))) && isNumber(number))
				System.out.println(number + " --> Valid");
			else
				System.out.println(number + " --> Invalid");
			break;
		// below case - is to validate numbers like : 123456
		default:
			System.out.println(number + " --> Invalid");
		}
	}

	public static void main(String[] args) {
		ValidateMobileNumber validateMobileNumber = new ValidateMobileNumber();
		String[] inputNumber = { "+91 9876543210", "+91 8876543210", "+91 7876543210", "09876543210", "08876543210",
				"07876543210", "987 654 3210", "887 654 3210", "787 654 3210", "9876543210", "8876543210", "7876543210",
				"+91 9876Z43210", "987 6X4 3210","09876K43210", "987654321P", "5269765463", "985524+236", "888888888",
				"+9109876543210", "976154613742" };
		for (int index = 0; index < inputNumber.length; index++) 
			validateMobileNumber.verifyMobileNumber(inputNumber[index]);
	}
}
