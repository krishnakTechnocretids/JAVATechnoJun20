package shrutiDJun20Assignments;

public class ValidateMobileNumber {
	void checkForValidNumber(String number) {

		boolean flag = false;
		String mobileNumber = number;
		mobileNumber = mobileNumber.replace(" ", "");

		if (mobileNumber.length() >= 10 && mobileNumber.length() < 14) {
			if (mobileNumber.startsWith("9") || mobileNumber.startsWith("8")
					|| mobileNumber.startsWith("7") || mobileNumber.startsWith("+")
					|| mobileNumber.startsWith("0")) {
				for (int index = 1; index < mobileNumber.length(); index++) {
					if (Character.isDigit(mobileNumber.charAt(index)))
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
		validateMobileNumber.checkForValidNumber("+91  456789");
		validateMobileNumber.checkForValidNumber("6976546342");
	}
}
