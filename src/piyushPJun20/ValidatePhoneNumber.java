package piyushPJun20;
class ValidatePhoneNumber {

	void verifyPhoneNumber(String phoneNo) {
		boolean isNumberValid = true;
		if (phoneNo.length() > 14 || phoneNo.length() < 10)
			isNumberValid = false;
		else {
			for (int index = 0; index < phoneNo.length(); index++) {
				if (Character.isDigit(phoneNo.charAt(index)) == false && phoneNo.charAt(3) != ' '
						&& phoneNo.charAt(7) != ' ') {
					isNumberValid = false;

				}
			}
		}

		if (isNumberValid == true) {
			if (phoneNo.startsWith("+91") && phoneNo.length() == 14 && phoneNo.charAt(3) == ' ')
				System.out.println(phoneNo + " -->Valid");
			else if (phoneNo.startsWith("0") && phoneNo.length() == 11 && phoneNo.contains(" ") == false)
				System.out.println(phoneNo + " -->Valid");
			else if (phoneNo.startsWith("9") && phoneNo.length() == 10 && phoneNo.contains(" ") == false)
				System.out.println(phoneNo + " -->Valid");
			else if (phoneNo.startsWith("9") && phoneNo.length() == 12 && phoneNo.charAt(3) == ' '
					&& phoneNo.charAt(7) == ' ')
				System.out.println(phoneNo + " -->Valid");
			else
				System.out.println(phoneNo + " -->InValid");
		} else {
			System.out.println(phoneNo + " -->InValid");
		}
	}

	public static void main(String[] args) {
		ValidatePhoneNumber validatePhoneNumber = new ValidatePhoneNumber();
		validatePhoneNumber.verifyPhoneNumber("+91 9765463742");
		validatePhoneNumber.verifyPhoneNumber("09765463742");
		validatePhoneNumber.verifyPhoneNumber("976 546 3742");
		validatePhoneNumber.verifyPhoneNumber("9765463742");
		System.out.println("");
		validatePhoneNumber.verifyPhoneNumber("9765463A42");
		validatePhoneNumber.verifyPhoneNumber("976546342");
		validatePhoneNumber.verifyPhoneNumber("6976546342");

	}
}