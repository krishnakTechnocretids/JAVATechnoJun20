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
package palakSJun20;

public class ValidatePhoneNumber {

	void validatePhoneNumber(String pNumber) {
	
		// 1st Case - +91 9765463742 have to check for + sign
		boolean flag = false;
		if (pNumber.startsWith("+") && pNumber.length() == 14) {

			for (int index = 1; index < pNumber.length(); index++) {
				if ((Character.isDigit((pNumber.charAt(index))) || Character.isSpaceChar((pNumber.charAt(index))))
						&& (!(Character.isLetter(pNumber.charAt(index))))) {
					flag = true;
				} else
					System.out.println(pNumber + " Number is Invalid");
			}
			if (flag == true) {
				System.out.println("Number "+pNumber+" is Valid");
			}
		}

		// 2nd Case - 09765463742
		else if (pNumber.startsWith("0") && pNumber.length() == 11) {
			for (int index = 0; index < pNumber.length(); index++) {
				flag = false;
				if (Character.isDigit(pNumber.charAt(index)) && (!(Character.isLetter(pNumber.charAt(index))))) {
					flag = true;
				} else {
					System.out.println(pNumber + " Number is Invalid");
					break;
				}
			}
			if (flag == true) {
				System.out.println("Number "+pNumber+" is Valid");
			}
		}
		
		// 3rd Case - 976 546 3742
		else if (pNumber.startsWith("9") && pNumber.length() == 12) {
			for (int index = 0; index < pNumber.length(); index++) {
				flag = false;
				if (Character.isDigit(pNumber.charAt(index))
						|| Character.isSpaceChar((pNumber.charAt(index))) && (!(Character.isLetter(pNumber.charAt(index))))) {
					flag = true;
				} else {
					System.out.println("Number "+pNumber+" is Invalid");
					break;
				}
			}
			if (flag == true)
				System.out.println("Number "+pNumber+" is Valid");
		}
		
		// 4th Case - 9765463742
		else if (pNumber.startsWith("9") &&  pNumber.length() == 10) {
			for (int index = 0; index < pNumber.length(); index++) {
				flag = false;
				if (Character.isDigit(pNumber.charAt(index)) && (!(Character.isLetter(pNumber.charAt(index))))) {
					flag = true;
				} else {
					System.out.println("Number "+pNumber+" is Invalid");
					break;
				}
			}
			if (flag == true)
				System.out.println("Number "+pNumber+" is Valid");
		}
		else
			System.out.println("Number "+pNumber+" is  Invalid");
	}

	public static void main(String[] args) {
		ValidatePhoneNumber phoneNumber = new ValidatePhoneNumber();
		phoneNumber.validatePhoneNumber("+91 9754463742");
		phoneNumber.validatePhoneNumber("09765463742");
		phoneNumber.validatePhoneNumber("976 546 3742");
		phoneNumber.validatePhoneNumber("9765463742");
		phoneNumber.validatePhoneNumber("9765463A42"); // Invalid 
		phoneNumber.validatePhoneNumber("976546342"); // Invalid 
		phoneNumber.validatePhoneNumber("6976546342"); // Invalid 
	}

}
