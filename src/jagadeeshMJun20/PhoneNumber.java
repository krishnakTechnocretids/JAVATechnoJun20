/*Validate given phone number.
+91 9765463742 --> valid
09765463742 --> valid
976 546 3742 --> valid
9765463742 --> valid

9765463A42 --> Invalid
976546342 --> Invalid
6976546342 --> Invalid
Note : phone number is given in String format. */
package jagadeeshMJun20;

public class PhoneNumber {
	void validatePhoneNumber(String phNum){
		int length = phNum.length();
				phNum.length();
				if(length == 10)
					validatePhoneNumTenDigit(phNum);
				else if( length == 11)
					validatePhoneNumElevenDigit(phNum);	
				else if(length == 12)
					validatePhoneNumTwelveDigit(phNum);	
				else if(length == 14)
					validatePhoneNumFourteenDigit(phNum);	
				else
					System.out.println(phNum+ " --> invalid");
	}
//10 digit phone number Validation
	private void validatePhoneNumTenDigit(String phNum) {
		boolean flag = true;
		if (phNum.charAt(0) == '9' || phNum.charAt(0) == '8' || phNum.charAt(0) == '7') {
			for (int i = 0; i < phNum.length(); i++)
				if (Character.isAlphabetic(phNum.charAt(i))) {
					flag = false;
					break;
				}
			if (flag == true)
				System.out.println(phNum+" --> valid ");
			else
				System.out.println(phNum+" --> invalid ");

		} else
			System.out.println(phNum+" --> invalid ");
	}
// 11 digit phone number Validation
	private void validatePhoneNumElevenDigit(String phNum) {
		boolean flag = true;
		if (phNum.charAt(1) == '9' || phNum.charAt(1) == '8' || phNum.charAt(1) == '7') {
			for (int i = 0; i < phNum.length(); i++)
				if (Character.isAlphabetic(phNum.charAt(i))) {
					flag = false;
					break;
				}
			if (flag == true)
				System.out.println(phNum+" --> valid ");
			else
				System.out.println(phNum +" --> invalid ");
		} else
			System.out.println(phNum +" --> invalid ");
	}
	
	
// 12 digit phone number Validation	976 546 3742 --> valid
	private void validatePhoneNumTwelveDigit(String phNum) {
		String phoneNum = phNum.replace(" ", "");
		boolean flag = true;
		if(phoneNum.length() == 10) {
		if (phoneNum.charAt(0) == '9' || phoneNum.charAt(0) == '8' || phoneNum.charAt(0) == '7') {
			for (int i = 0; i < phoneNum.length(); i++)
				if (Character.isAlphabetic(phoneNum.charAt(i))) {
					flag = false;
					break;
				}
			if (flag == true)
				System.out.println(phNum+" --> valid ");
			else
				System.out.println(phNum+" --> invalid ");

		} else
			System.out.println(phNum+" --> invalid ");
		}else
			System.out.println(phNum+" --> invalid ");
	}
	
// 14 digit phone number Validation +91 9765463742 --> valid
	private void validatePhoneNumFourteenDigit(String phNum){
	if(phNum.substring(0,3).equals("+91")) {
		String phoneNum = phNum.substring(4);
		boolean flag = true;
		if (phoneNum.charAt(0) == '9' || phoneNum.charAt(0) == '8' || phoneNum.charAt(0) == '7') {
			for (int i = 0; i < phoneNum.length(); i++)
				if (Character.isAlphabetic(phoneNum.charAt(i))) {
					flag = false;
					break;
				}
			if (flag == true)
				System.out.println(phNum+" --> valid ");
			else
				System.out.println(phoneNum+" --> invalid ");

		} else
			System.out.println(phNum+" --> invalid ");
	}
	else System.out.println("invalid number" +phNum);
	}
//Main method	
	public static void main(String[] agrs) {
		PhoneNumber phoneNumber = new PhoneNumber();
		String phNum = "6976546342";
		phoneNumber.validatePhoneNumber(phNum);
			
	}

}
