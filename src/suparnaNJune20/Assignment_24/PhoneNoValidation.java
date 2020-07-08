/*
 * Assignment 24 :- 5th Jul'2020
Validate given phone number.

+91 9765463742 --> valid
09765463742 --> valid
976 546 3742 --> valid
9765463742 --> valid

9765463A42 --> Invalid
976546342 --> Invalid
6976546342 --> Invalid
*/
package suparnaNJune20.Assignment_24;

public class PhoneNoValidation {
void validPhoneNo(String phoneNo) {
		switch (phoneNo.length()) {
		case 14:
			if (phoneNo.charAt(0) == '+' && phoneNo.charAt(1) == '9' && phoneNo.charAt(2) == '1'
					&& phoneNo.charAt(3) == ' '
					&& (phoneNo.charAt(4) == '9' || phoneNo.charAt(4) == '8' || phoneNo.charAt(4) == '7')
					&& (Character.isDigit(phoneNo.charAt(5))) && (Character.isDigit(phoneNo.charAt(6)))
					&& (Character.isDigit(phoneNo.charAt(7))) && (Character.isDigit(phoneNo.charAt(8)))
					&& (Character.isDigit(phoneNo.charAt(9))) && (Character.isDigit(phoneNo.charAt(10)))
					&& (Character.isDigit(phoneNo.charAt(11))) && (Character.isDigit(phoneNo.charAt(12)))
					&& (Character.isDigit(phoneNo.charAt(13))))
				System.out.println(phoneNo + " is valid phone no");
			else
				System.out.println(phoneNo + " is in valid phone no");

			break;
		case 11:
			if (phoneNo.charAt(0) == '0'
					&& (phoneNo.charAt(1) == '9' || phoneNo.charAt(1) == '8' || phoneNo.charAt(1) == '7')
					&& (Character.isDigit(phoneNo.charAt(2))) && (Character.isDigit(phoneNo.charAt(3)))
					&& (Character.isDigit(phoneNo.charAt(4))) && (Character.isDigit(phoneNo.charAt(5)))
					&& (Character.isDigit(phoneNo.charAt(6))) && (Character.isDigit(phoneNo.charAt(7)))
					&& (Character.isDigit(phoneNo.charAt(8))) && (Character.isDigit(phoneNo.charAt(9)))
					&& (Character.isDigit(phoneNo.charAt(10))))
				System.out.println(phoneNo + " is valid phone no");
			else
				System.out.println(phoneNo + " is in valid phone no");
			break;
		case 12:
			if ((phoneNo.charAt(0) == '9' || phoneNo.charAt(0) == '8' || phoneNo.charAt(0) == '7')
					&& (Character.isDigit(phoneNo.charAt(1))) && (Character.isDigit(phoneNo.charAt(2))) &&

					phoneNo.charAt(3) == ' ' && (Character.isDigit(phoneNo.charAt(4)))
					&& (Character.isDigit(phoneNo.charAt(5))) && (Character.isDigit(phoneNo.charAt(6)))
					&& phoneNo.charAt(7) == ' ' && (Character.isDigit(phoneNo.charAt(8)))
					&& (Character.isDigit(phoneNo.charAt(9))) && (Character.isDigit(phoneNo.charAt(10))))
				System.out.println(phoneNo + " is valid phone no");
			else
				System.out.println(phoneNo + " is in valid phone no");
			break;
		case 10:
			if ((phoneNo.charAt(0) == '9' || phoneNo.charAt(0) == '8' || phoneNo.charAt(0) == '7')
					&& (Character.isDigit(phoneNo.charAt(1))) && (Character.isDigit(phoneNo.charAt(2)))
					&& (Character.isDigit(phoneNo.charAt(3))) && (Character.isDigit(phoneNo.charAt(4)))
					&& (Character.isDigit(phoneNo.charAt(5))) && (Character.isDigit(phoneNo.charAt(6)))
					&& (Character.isDigit(phoneNo.charAt(7))) && (Character.isDigit(phoneNo.charAt(8)))
					&& (Character.isDigit(phoneNo.charAt(9))))
				System.out.println(phoneNo + " is valid phone no ");
			else
				System.out.println(phoneNo + " is in valid phone no");
			break;
		default:
			System.out.println(phoneNo + " is in valid phone no");

		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PhoneNoValidation().validPhoneNo("+91 9765463742");
		new PhoneNoValidation().validPhoneNo("09765463742");
		new PhoneNoValidation().validPhoneNo("976 546 3742");
		new PhoneNoValidation().validPhoneNo("9765463742");
		new PhoneNoValidation().validPhoneNo("9765463A42");
		new PhoneNoValidation().validPhoneNo("976546342");
		new PhoneNoValidation().validPhoneNo("6976546342");
		new PhoneNoValidation().validPhoneNo("-69 76546342");
		new PhoneNoValidation().validPhoneNo("9765 463 742");
	}
}
