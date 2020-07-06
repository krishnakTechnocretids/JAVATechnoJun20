package deavinaSJun20;

public class ValidatePhoneNumber {

	public void validPhoneNo(String phoneNo) {
		switch (phoneNo.length()) {
			case 14:
				checkFourteenDigit(phoneNo);
				break;
			case 11:
				checkElevenDigit(phoneNo);
				break;
			case 12:
				checkTwelveDigit(phoneNo);
				break;
			case 10:
				checkTenDigit(phoneNo);
				break;
			default:
				System.out.println(phoneNo + " is in valid phone no");
		}
	}

	public void checkFourteenDigit(String phoneNo) {
		if (phoneNo.charAt(0) == '+' && phoneNo.charAt(1) == '9' && phoneNo.charAt(2) == '1' && phoneNo.charAt(3) == ' '
				&& (phoneNo.charAt(4) == '9' || phoneNo.charAt(4) == '8' || phoneNo.charAt(4) == '7')
				&& (Character.isDigit(phoneNo.charAt(5))) && (Character.isDigit(phoneNo.charAt(6)))
				&& (Character.isDigit(phoneNo.charAt(7))) && (Character.isDigit(phoneNo.charAt(8)))
				&& (Character.isDigit(phoneNo.charAt(9))) && (Character.isDigit(phoneNo.charAt(10)))
				&& (Character.isDigit(phoneNo.charAt(11))) && (Character.isDigit(phoneNo.charAt(12)))
				&& (Character.isDigit(phoneNo.charAt(13))))
			System.out.println(phoneNo + " is a valid phone no");
		else
			System.out.println(phoneNo + " is an invalid phone no");
	}

	public void checkElevenDigit(String phoneNo) {
		if (phoneNo.charAt(0) == '0'
				&& (phoneNo.charAt(1) == '9' || phoneNo.charAt(1) == '8' || phoneNo.charAt(1) == '7')
				&& (Character.isDigit(phoneNo.charAt(2))) && (Character.isDigit(phoneNo.charAt(3)))
				&& (Character.isDigit(phoneNo.charAt(4))) && (Character.isDigit(phoneNo.charAt(5)))
				&& (Character.isDigit(phoneNo.charAt(6))) && (Character.isDigit(phoneNo.charAt(7)))
				&& (Character.isDigit(phoneNo.charAt(8))) && (Character.isDigit(phoneNo.charAt(9)))
				&& (Character.isDigit(phoneNo.charAt(10))))
			System.out.println(phoneNo + " is a valid phone no");
		else
			System.out.println(phoneNo + " is an invalid phone no");
	}

	private void checkTwelveDigit(String phoneNo) {
		if ((phoneNo.charAt(0) == '9' || phoneNo.charAt(0) == '8' || phoneNo.charAt(0) == '7')
				&& (Character.isDigit(phoneNo.charAt(1))) && (Character.isDigit(phoneNo.charAt(2)))
				&& phoneNo.charAt(3) == ' ' && (Character.isDigit(phoneNo.charAt(4)))
				&& (Character.isDigit(phoneNo.charAt(5))) && (Character.isDigit(phoneNo.charAt(6)))
				&& phoneNo.charAt(7) == ' ' && (Character.isDigit(phoneNo.charAt(8)))
				&& (Character.isDigit(phoneNo.charAt(9))) && (Character.isDigit(phoneNo.charAt(10))))
			System.out.println(phoneNo + " is a valid phone no");
		else
			System.out.println(phoneNo + " is an invalid phone no");
	}

	private void checkTenDigit(String phoneNo) {
		if ((phoneNo.charAt(0) == '9' || phoneNo.charAt(0) == '8' || phoneNo.charAt(0) == '7')
				&& (Character.isDigit(phoneNo.charAt(1))) && (Character.isDigit(phoneNo.charAt(2)))
				&& (Character.isDigit(phoneNo.charAt(3))) && (Character.isDigit(phoneNo.charAt(4)))
				&& (Character.isDigit(phoneNo.charAt(5))) && (Character.isDigit(phoneNo.charAt(6)))
				&& (Character.isDigit(phoneNo.charAt(7))) && (Character.isDigit(phoneNo.charAt(8)))
				&& (Character.isDigit(phoneNo.charAt(9))))
			System.out.println(phoneNo + " is a valid phone no ");
		else
			System.out.println(phoneNo + " is an invalid phone no");
	}

	public static void main(String[] args) {
		String[] Phone = { "+91 9765463742", "09765463742", "976 546 3742", "9765463742", "9765463A42", "976546342",
				"6976546342", "-69 76546342", "9765 463 742" };
		for (int index = 0; index < Phone.length; index++) {
			new ValidatePhoneNumber().validPhoneNo(Phone[index]);
		}
	}
}
