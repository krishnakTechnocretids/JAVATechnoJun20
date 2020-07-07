package pranitaPJun20;

public class ValidPhoneNumber {
	void checkValidPhoneNumber(String phoneNumber) {
		int length = phoneNumber.length();
		if (length < 10 || length > 14) {
			System.out.println("\nPhone number " + phoneNumber + " having length "+length +"---> Invalid length number entered");
		} 
		else {
			switch (length) {
			case 10:
				if (checkIsDigit(phoneNumber) == true && (phoneNumber.startsWith("7") || phoneNumber.startsWith("8")
						|| phoneNumber.startsWith("9"))) {
					System.out.println("\nPhone number " + phoneNumber + " having length "+length +" is a valid Phone Number");
				} else {
					System.out.println("\n" + phoneNumber + " is not a valid Phone Number.");
				}
				break;

			case 11:
					if (phoneNumber.startsWith("0") && checkIsDigit(phoneNumber) == true && (phoneNumber.charAt(1) =='7' || phoneNumber.charAt(1) =='8'
							|| phoneNumber.charAt(1) =='9')) {
						System.out.println("\nPhone number " + phoneNumber + " having length "+length +" is a valid Phone Number");
					} else {
						System.out.println("\n" + phoneNumber + " is not a valid Phone Number.");
					}
				break;

			case 12:
				if (phoneNumber.charAt(3) == ' ' && phoneNumber.charAt(7) == ' ' && checkIsDigit(phoneNumber) == true
						&& (phoneNumber.startsWith("7") || phoneNumber.startsWith("8")
								|| phoneNumber.startsWith("9"))) {
					System.out.println("\nPhone number " + phoneNumber + " having length "+length +" is a valid Phone Number");
				} else {
					System.out.println("\n" + phoneNumber + " is not a valid Phone Number.");
				}
				break;

			case 14:
				if (phoneNumber.startsWith("+91 ")&& (phoneNumber.charAt(1) =='7' || phoneNumber.charAt(1) =='8'
						|| phoneNumber.charAt(1) =='9') && checkIsDigit(phoneNumber) == true) {
					System.out.println("\nPhone number " + phoneNumber + " having length "+length +" is a valid Phone Number");
				} else {
					System.out.println("\n" + phoneNumber + " is not a valid Phone Number.");
				}
				break;

			default:
				System.out.println("\n" + phoneNumber + " is not a valid Phone Number.");
				break;

			}
		}
	}

	boolean checkIsDigit(String phoneNumber) {
		for (int index = 0; index < phoneNumber.length(); index++) {
			if (Character.isLetter(phoneNumber.charAt(index))) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		ValidPhoneNumber validPhoneNumber = new ValidPhoneNumber();
		String phoneNumber = "+91 9765463742";
		validPhoneNumber.checkValidPhoneNumber(phoneNumber);
		phoneNumber = "09765463742";
		validPhoneNumber.checkValidPhoneNumber(phoneNumber);
		phoneNumber = "976 546 3742";
		validPhoneNumber.checkValidPhoneNumber(phoneNumber);
		phoneNumber = "8485033276";
		validPhoneNumber.checkValidPhoneNumber(phoneNumber);
		phoneNumber = "9765463A42";
		validPhoneNumber.checkValidPhoneNumber(phoneNumber);
		phoneNumber = "976546342";
		validPhoneNumber.checkValidPhoneNumber(phoneNumber);
		phoneNumber = "6669766000";
		validPhoneNumber.checkValidPhoneNumber(phoneNumber);
	}

}
