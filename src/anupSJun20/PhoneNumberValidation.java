package anupSJun20;
/*Assignment 24 :- 5th Jul'2020 
Validate given phone number.

+91 9765463742 --> valid
09765463742 --> valid
976 546 3742 --> valid
9765463742 --> valid

9765463A42 --> Invalid
976546342 --> Invalid
6976546342 --> Invalid

Note : phone number is given in String format.*/

public class PhoneNumberValidation {
	
	static void findPhoneNumberhavingCharacter(String number) {
		boolean flag = true;
		for (int index = 0; index < number.length(); index++) {
			if (Character.isLetter(number.charAt(index))) {
				System.out.println("The phone number : " + number + " is invalid ");
				flag = false;
			} 
		}
		if(flag) {
		verifyPhoneNumber(number);
		}
	}
	static void verifyPhoneNumber(String number) {
		
				if (number.length() < 10 || number.length() > 14) {
					System.out.println("The phone number : " + number + " is invalid ");
				} else if (number.length() == 14) {
					if (number.startsWith("+91") && number.charAt(3) == ' ' || number.charAt(4) == '7'
							|| number.charAt(4) == '8' || number.charAt(4) == '9') {
						System.out.println("The phone number : " + number + " is valid");
					} else {
						System.out.println("The phone number : " + number + " is invalid ");
					}
				} else if (number.length() == 11) {
					if ((number.startsWith("09") || number.startsWith("08") || number.startsWith("07"))
							&& !number.contains(" ")) {
						System.out.println("The phone number : " + number + " is valid");
					} else {
						System.out.println("The phone number : " + number + " is invalid ");
					}
				} else if (number.length() == 12) {
					if ((number.startsWith("9") || number.startsWith("8") || number.startsWith("7"))
							&& number.charAt(3) == ' ' && number.charAt(7) == ' ') {
						System.out.println("The phone number : " + number + " is valid");
					} else {
						System.out.println("The phone number : " + number + " is invalid ");
					}
				} else if (number.length() == 10) {
					if ((number.startsWith("9") || number.startsWith("8") || number.startsWith("7"))
							&& !number.contains(" ")) {
						System.out.println("The phone number : " + number + " is valid");
					} else {
						System.out.println("The phone number : " + number + " is invalid ");
					}
				} else {
					System.out.println("The phone number : " + number + " is invalid ");
				}
			}
	

	public static void main(String[] args) {
		String number = "+91 9765463742";
		findPhoneNumberhavingCharacter("09765463742");
		findPhoneNumberhavingCharacter("976 546 3742");
		findPhoneNumberhavingCharacter("9765463742");
		findPhoneNumberhavingCharacter("9765463A42");
		findPhoneNumberhavingCharacter("976546342");
		findPhoneNumberhavingCharacter("6976546342");
		findPhoneNumberhavingCharacter("97845 6788");

	}

}
