package abhishekSJun20;

public class PhoneNumberValidation {
	
 void numberValidation(String phNumber) {
	 
	 boolean isNumberValid = true;	
		if(phNumber.length()>14 || phNumber.length()<10)
			isNumberValid = false;	
		else {
			for(int index=0;index<phNumber.length();index++) {
				if(Character.isDigit(phNumber.charAt(index))==false &&  phNumber.charAt(7)!=' ' && phNumber.charAt(3)!=' ' && phNumber.charAt(0)!='+') {
					isNumberValid = false;					
					break;
				}
			}
		}

		if(isNumberValid == true) {
			if(phNumber.startsWith("+91 ") && phNumber.length() == 14)
				System.out.println(phNumber + " --> valid");
			else if(phNumber.startsWith("0") && phNumber.length() == 11)
				System.out.println(phNumber + " --> valid");
			else if(phNumber.length() == 12 && phNumber.charAt(3) ==' ' && phNumber.charAt(7) ==' ')
				System.out.println(phNumber + " --> valid");
			else if(phNumber.length() == 10  && phNumber.contains(" ")==false)
				System.out.println(phNumber + " --> valid");
			else
				System.out.println(phNumber + " --> invalid");
		}
		else {
			System.out.println(phNumber + " --> invalid");
		}
	}

  public static void main(String[] args) {
		PhoneNumberValidation phoneNumberValidation=new PhoneNumberValidation();
		phoneNumberValidation.numberValidation("+91 976543742");
		phoneNumberValidation.numberValidation("09765463742");
		phoneNumberValidation.numberValidation("976 546 3742");
		phoneNumberValidation.numberValidation("9765463742");
		phoneNumberValidation.numberValidation("9765463A42"); 
		phoneNumberValidation.numberValidation("976546342"); 
		phoneNumberValidation.numberValidation("6976546342");
}
}
