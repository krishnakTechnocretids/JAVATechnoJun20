package shrutiDJun20Assignments;

public class ValidateNumber {

	void checkForValidNumber(String number) {

		boolean flag = false;
		if (number.startsWith("+") && number.length() == 14) {
			for (int index = 1; index < number.length(); index++) {
				if (Character.isDigit(number.charAt(index))
						|| Character.isSpaceChar(number.charAt(index)))
					flag = true;
			}
		}
		if (number.startsWith("0") && number.length() == 11) {
			for (int index = 0; index < number.length(); index++) {
				if (Character.isDigit(number.charAt(index))
						&& (!Character.isLetter(index)))

					flag = true;
			}
		}
		if (number.length() >= 10 && number.length() <= 13) {
			if (number.startsWith("9") || number.startsWith("8")
					|| number.startsWith("7")) {
				for (int index = 0; index < number.length(); index++) {
					if (Character.isDigit(number.charAt(index))
							|| Character.isSpaceChar(number.charAt(index)))
						flag = true;
					else if (!Character.isLetter(index))
						flag = false;
					break;
				}
			}
		}
		if (flag == true)
			System.out.println(number + " is valid");
		else
			System.out.println(number + " is invalid");
	}

	public static void main(String[] args) {
		ValidateNumber validateNumber = new ValidateNumber();
		//validateNumber.checkForValidNumber("+91 9765463742");
	//	validateNumber.checkForValidNumber("09765463742");
		//validateNumber.checkForValidNumber("976 546 3742");
		//validateNumber.checkForValidNumber("9765463742");
		validateNumber.checkForValidNumber("9765463A42");
	//	validateNumber.checkForValidNumber("6976546342");
	//	validateNumber.checkForValidNumber("A9765463742");

	}
}
