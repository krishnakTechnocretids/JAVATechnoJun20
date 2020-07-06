package maheshKJun20.NumbersExample;

public class ValidatePhoneNumber {

	//Method to check if the Number is Valid phone number or not
	void checkValidPhoneNumber(String phoneNumber) {
		switch (phoneNumber.length()) {
			case 14:
				if (isValidCountryCode(phoneNumber.substring(0, 4))) 
					phoneNumber = phoneNumber.substring(4, phoneNumber.length());
			case 12:
				if(String.valueOf(phoneNumber.charAt(3)).equals(" ") && String.valueOf(phoneNumber.charAt(7)).equals(" "))
					phoneNumber = phoneNumber.replaceAll(" ", "");
			case 11:
				if (String.valueOf(phoneNumber.charAt(0)).equals("0") )
					phoneNumber = phoneNumber.substring(1, phoneNumber.length());
			case 10:
				if (checkNumberFormat(phoneNumber))
					System.out.println(phoneNumber + " - is valid phone number");
				else
					System.out.println(phoneNumber + " - is invalid phone number");
				break;
			default:
				System.out.println(phoneNumber + " - is invalid phone number");
		}
	}
	
	//Method to validate the country code is valid or not
	boolean isValidCountryCode(String countryCode) {
		boolean flag = true;
		if (!String.valueOf(countryCode.charAt(0)).equals("+") || !String.valueOf(countryCode.charAt(1)).equals("9") || !String.valueOf(countryCode.charAt(2)).equals("1") || !String.valueOf(countryCode.charAt(3)).equals(" ")) {
			flag = false;
		}
		return flag;
	}
	
	//Method to validate 10 digit phone number is in correct format or not
	boolean checkNumberFormat(String number) {
		if (String.valueOf(number.charAt(0)).equals("9") || String.valueOf(number.charAt(0)).equals("8") || String.valueOf(number.charAt(0)).equals("7")) {
			for(int index=1;index<number.length();index++) {
				if (!Character.isDigit(number.charAt(index)))
					return false;
			}
		}else {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		ValidatePhoneNumber validatePhoneNumber = new ValidatePhoneNumber();
		validatePhoneNumber.checkValidPhoneNumber("+91 9167755341");
		validatePhoneNumber.checkValidPhoneNumber("09167755341");
		validatePhoneNumber.checkValidPhoneNumber("916 775 5341");
		validatePhoneNumber.checkValidPhoneNumber("9167755341");
		validatePhoneNumber.checkValidPhoneNumber("916775541");
		validatePhoneNumber.checkValidPhoneNumber("916775A341");
		validatePhoneNumber.checkValidPhoneNumber("6167755341");
	}
}
