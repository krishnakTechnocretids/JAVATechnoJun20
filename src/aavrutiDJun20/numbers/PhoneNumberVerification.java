package aavrutiDJun20.numbers;

public class PhoneNumberVerification {
	
	void phoneNumberValidOrNot(String phoneNumber) {
		boolean isNumberValid = true;	
		if(phoneNumber.length()>14 || phoneNumber.length()<10)
			isNumberValid = false;	
		else {
			for(int index=0;index<phoneNumber.length();index++) {
				if(Character.isDigit(phoneNumber.charAt(index))==false &&  phoneNumber.charAt(7)!=' ' && phoneNumber.charAt(3)!=' ' && phoneNumber.charAt(0)!='+') {
					isNumberValid = false;					
					break;
				}
			}
		}
		
		if(isNumberValid == true) {
			if(phoneNumber.startsWith("+91 ") && phoneNumber.length() == 14)
				System.out.println(phoneNumber + " --> valid.\n");
			else if(phoneNumber.startsWith("0") && phoneNumber.length() == 11)
				System.out.println(phoneNumber + " --> valid.\n");
			else if(phoneNumber.length() == 12 && phoneNumber.charAt(3) ==' ' && phoneNumber.charAt(7) ==' ')
				System.out.println(phoneNumber + " --> valid.\n");
			else if(phoneNumber.length() == 10  && phoneNumber.contains(" ")==false)
				System.out.println(phoneNumber + " --> valid.\n");
			else
				System.out.println(phoneNumber + " --> invalid.\n");
		}
		else {
			System.out.println(phoneNumber + " --> invalid.\n");
		}
	}

	public static void main(String[] args) {
		PhoneNumberVerification phoneNumberVerification = new PhoneNumberVerification();
		String phoneNumber = "+91 8485033276";
		phoneNumberVerification.phoneNumberValidOrNot(phoneNumber);		
		phoneNumber = "08485033276";
		phoneNumberVerification.phoneNumberValidOrNot(phoneNumber);
		phoneNumber = "848 503 3276";
		phoneNumberVerification.phoneNumberValidOrNot(phoneNumber);
		phoneNumber = "8485033276";
		phoneNumberVerification.phoneNumberValidOrNot(phoneNumber);
		phoneNumber = "84850332A6";
		phoneNumberVerification.phoneNumberValidOrNot(phoneNumber);
		phoneNumber = "84850332@6";
		phoneNumberVerification.phoneNumberValidOrNot(phoneNumber);
		phoneNumber = "848503327";
		phoneNumberVerification.phoneNumberValidOrNot(phoneNumber);
		phoneNumber = "68485033276";
		phoneNumberVerification.phoneNumberValidOrNot(phoneNumber);
		phoneNumber = "848 533276";
		phoneNumberVerification.phoneNumberValidOrNot(phoneNumber);
		phoneNumber = "+91  8485033276";
		phoneNumberVerification.phoneNumberValidOrNot(phoneNumber);
	}
}
