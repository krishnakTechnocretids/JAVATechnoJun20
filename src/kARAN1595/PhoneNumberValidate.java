package kARAN1595;

public class PhoneNumberValidate {
	void numberValidation(String phNumber) {

		boolean ValidNumber = true;
		if (phNumber.length() > 14 || phNumber.length() < 10)
			ValidNumber = false;
		else {
			for (int index = 0; index < phNumber.length(); index++) {
				if (Character.isDigit(phNumber.charAt(index)) == false && phNumber.charAt(7) != ' '
						&& phNumber.charAt(3) != ' ' && phNumber.charAt(0) != '+') {
					ValidNumber = false;
					break;
				}
			}
		}

		if (ValidNumber == true) {
			if (phNumber.startsWith("+91 ") && phNumber.length() == 14)
			{
				System.out.println(phNumber + " --> valid");
			}
			else if (phNumber.startsWith("0") && phNumber.length() == 11)
			{
				System.out.println(phNumber + " --> valid");
			}
			else if (phNumber.length() == 12 && phNumber.charAt(3) == ' ' && phNumber.charAt(7) == ' ')
			{
				System.out.println(phNumber + " --> valid");
			}
			else if (phNumber.length() == 10 && phNumber.contains(" ") == false) {
				System.out.println(phNumber + " --> valid");
			}
			else {
				System.out.println(phNumber + " --> invalid");
				}
			}
			else {
				System.out.println(phNumber + " --> invalid");
			}
		}

	  public static void main(String[] args) {
			PhoneNumberValidate phoneNumberValidate=new PhoneNumberValidate();
			System.out.println("Validation of phone numbers:");
			phoneNumberValidate.numberValidation("+91 976543742");
			phoneNumberValidate.numberValidation("09765463742");
			phoneNumberValidate.numberValidation("976 546 3742");
			phoneNumberValidate.numberValidation("9765463742");
			phoneNumberValidate.numberValidation("9765463A42"); 
			phoneNumberValidate.numberValidation("976546342"); 
			phoneNumberValidate.numberValidation("6976546342");
	}
	}

