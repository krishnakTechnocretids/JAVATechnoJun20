/*Assignment 24
Validate given phone number::
+91 9765463742 --> valid
09765463742 --> valid
976 546 3742 --> valid
9765463742 --> valid
9765463A42 --> Invalid
976546342 --> Invalid
6976546342 --> Invalid
Note : phone number is given in String format.*/

package rajAJun20;

public class MobileNumberValidation {
	
	void validatePhoneNumber(String mobNumber) {

		// 1st Case - +91 9765463742 have to check for + sign
		boolean flag = false;
		String specialCharacter = "!@#$%^&*()-/`~:<>/?|=.,";
		if (mobNumber.startsWith("+") && mobNumber.length() == 14) {
			for (int index = 1; index < mobNumber.length(); index++) {
				if ((Character.isDigit((mobNumber.charAt(index))) || Character.isSpaceChar((mobNumber.charAt(index))))
						&& (!(specialCharacter.contains(Character.toString(mobNumber.charAt(index)))))
						&& (!(Character.isLetter(mobNumber.charAt(index))))) {
					flag = true;
				} else {
					System.out.println(mobNumber + "Mobile Number is Invalid");
					flag = false;
					break;
				}
			}
			if (flag == true) {
				System.out.println("Mobile Number " + mobNumber + " is Valid");
			}
		}

		// 2nd Case - 09765463742
		else if (mobNumber.startsWith("0") && mobNumber.length() == 11) {
			for (int index = 0; index < mobNumber.length(); index++) {
				flag = false;
				if (Character.isDigit(mobNumber.charAt(index)) && (!(Character.isLetter(mobNumber.charAt(index))))) {
					flag = true;
				} else {
					System.out.println(mobNumber + "Mobile Number is Invalid");
					break;
				}
			}
			if (flag == true) {
				System.out.println("Mobile Number " + mobNumber + " is Valid");
			}
		}

		// 3rd Case - 976 546 3742
		else if (mobNumber.startsWith("9") && mobNumber.length() == 12) {
			for (int index = 0; index < mobNumber.length(); index++) {
				flag = false;
				if (Character.isDigit(mobNumber.charAt(index)) || Character.isSpaceChar((mobNumber.charAt(index)))
						&& (!(Character.isLetter(mobNumber.charAt(index))))) {
					flag = true;
				} else {
					System.out.println("Mobile Number " + mobNumber + " is Invalid");
					break;
				}
			}
			if (flag == true)
				System.out.println("Mobile Number " + mobNumber + " is Valid");
		}

		// 4th Case - 9765463742
		else if (mobNumber.startsWith("9") && mobNumber.length() == 10) {
			for (int index = 0; index < mobNumber.length(); index++) {
				flag = false;
				if (Character.isDigit(mobNumber.charAt(index)) && (!(Character.isLetter(mobNumber.charAt(index))))) {
					flag = true;
				} else {
					System.out.println("Mobile Number " + mobNumber + " is Invalid");
					break;
				}
			}
			if (flag == true)
				System.out.println("Mobile Number " + mobNumber + " is Valid");
		} else
			System.out.println("Mobile Number " + mobNumber + " is Invalid");
	}

	public static void main(String[] args) {
		MobileNumberValidation mobileNumber = new MobileNumberValidation();
		mobileNumber.validatePhoneNumber("+91 9765463742");
		mobileNumber.validatePhoneNumber("09765464742");
		mobileNumber.validatePhoneNumber("976 546 3742");
		mobileNumber.validatePhoneNumber("9765463742");
		System.out.println("_______________________");
		mobileNumber.validatePhoneNumber("9765463A42"); 
		mobileNumber.validatePhoneNumber("976546342"); 
		mobileNumber.validatePhoneNumber("6976546342"); 
		}
}
