package yashCJun20.Assignment24;
public class PhoneNumberValidation {

	boolean flag;

	private boolean numberIsValidOrNot(String phnNumber) {
		if (phnNumber.length() >= 10 && phnNumber.length() <= 14) {

			if (phnNumber.length() == 14) {
				for (int index = 0; index < phnNumber.length(); index++) {
					if (phnNumber.substring(0, 4).equals("+91 ")) {
						if (phnNumber.charAt(4) == '7' || phnNumber.charAt(4) == '8' || phnNumber.charAt(4) == '9') {
							flag = true;
							break;
						}
					} else {
						flag = false;
					}
				}
			}

			if (phnNumber.length() == 12) {
				for (int index = 0; index < phnNumber.length(); index++) {
					if (phnNumber.charAt(3) == ' ' && phnNumber.charAt(7) == ' ') {
						if (phnNumber.charAt(0) == '7' || phnNumber.charAt(0) == '8' || phnNumber.charAt(0) == '9') {
							flag = true;
							break;
						}
					} else {
						flag = false;
					}
				}
			}

			if (phnNumber.length() == 11) {
				if (phnNumber.charAt(1) == '7' || phnNumber.charAt(1) == '8' || phnNumber.charAt(1) == '9') {
					if (phnNumber.charAt(0) == '0') {
						flag = true;
					}
				} else {
					flag = false;
				}
			}

			if (phnNumber.length() == 10) {
				if (phnNumber.charAt(0) == '7' || phnNumber.charAt(0) == '8' || phnNumber.charAt(0) == '9') {
					for (int index = 0; index < phnNumber.length(); index++) {
						if (!Character.isDigit(phnNumber.charAt(index))) {
							flag = false;
							break;
						}
					}
				} else {
					flag = false;
				}
			}
		} else {
			flag = false;
		}
		return flag;
	}

	public void printValidity(String phnNumber) {
		numberIsValidOrNot(phnNumber);
		if (flag == true) {
			System.out.println(phnNumber + " --> Valid");
		} else
			System.out.println(phnNumber + " --> Invalid");
	}

	public static void main(String[] args) {
		PhoneNumberValidation phoneNumberValidation = new PhoneNumberValidation();

		phoneNumberValidation.printValidity("+91 9762463742");
		phoneNumberValidation.printValidity("09765463742");
		phoneNumberValidation.printValidity("976 546 3742");
		phoneNumberValidation.printValidity("9765463742");
		phoneNumberValidation.printValidity("9765463A42");
		phoneNumberValidation.printValidity("976546342");
		phoneNumberValidation.printValidity("6976546342");
	}
}