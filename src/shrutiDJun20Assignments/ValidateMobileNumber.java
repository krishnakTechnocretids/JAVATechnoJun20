package shrutiDJun20Assignments;

public class ValidateMobileNumber {
	void checkForValidNumber(String number) {

		boolean flag = false;

		if (number.length() >= 10 && number.length() <= 14) {
			if (number.startsWith("9") || number.startsWith("8")
					|| number.startsWith("7") || number.startsWith("+")
					|| number.startsWith("0")) {
				for (int index = 1; index < number.length(); index++) {
					if (Character.isDigit(number.charAt(index))
							|| Character.isSpaceChar(number.charAt(index)))
						flag = true;
					else {
						flag = false;
						break;
					}
				}
			} else
				flag = false;
		} else
			flag = false;
		
		if (flag == true)
			System.out.println(number + " is valid");
		else
			System.out.println(number + " is invalid");

	}

	public static void main(String[] args) {
		ValidateMobileNumber validateMobileNumber = new ValidateMobileNumber();
		validateMobileNumber.checkForValidNumber("+91 9765463742");
		validateMobileNumber.checkForValidNumber("09765463742");
		validateMobileNumber.checkForValidNumber("976 546 3742");
		validateMobileNumber.checkForValidNumber("9765463742");
		System.out.println();
		validateMobileNumber.checkForValidNumber("9765463A42");
		validateMobileNumber.checkForValidNumber("976546342");
		validateMobileNumber.checkForValidNumber("6976546342");
	}
}
