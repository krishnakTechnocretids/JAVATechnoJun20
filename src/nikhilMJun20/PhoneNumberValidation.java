/*Validate given phone number.

+91 9765463742 --> valid
09765463742 --> valid
976 546 3742 --> valid
9765463742 --> valid

9765463A42 --> Invalid
976546342 --> Invalid
6976546342 --> Invalid

Note : phone number is given in String format.
*/

package nikhilMJun20;

public class PhoneNumberValidation {
	void validatePhoneNumber(String phNo) {		
		switch (phNo.length()) {
			case 10:
				if(containsLetter(phNo) == false && validateCountrySpecs(phNo) == true) {
					System.out.println("\n"+phNo+" is a valid Phone Number.");
				}else {
					System.out.println("\n"+phNo+" is NOT a valid Phone Number.");
				}
				break;
				
			case 11:
				if(containsLetter(phNo) == false && validateCountrySpecs(phNo) == true) {
					System.out.println("\n"+phNo+" is a valid Phone Number.");
				}else {
					System.out.println("\n"+phNo+" is NOT a valid Phone Number.");
				}
				break;
				
			case 12:
				if(phNo.charAt(3) ==' ' && phNo.charAt(7)==' ' && phNo.replaceAll(" ", "").length() == 10 && containsLetter(phNo) == false && validateCountrySpecs(phNo) == true) {
					System.out.println("\n"+phNo+" is a valid Phone Number.");
				}else {
					System.out.println("\n"+phNo+" is NOT a valid Phone Number.");
				}
				break;
				
			case 14:
				if(phNo.charAt(3) ==' ' && phNo.replaceAll(" ", "").length() == 13 && containsLetter(phNo) == false && validateCountrySpecs(phNo) == true) {
					System.out.println("\n"+phNo+" is a valid Phone Number.");
				}else {
					System.out.println("\n"+phNo+" is NOT a valid Phone Number.");
				}
				break;
				
			default:
				System.out.println("\n"+phNo+" is NOT a valid Phone Number.");
				break;
		}
	}
	
	boolean containsLetter(String phNo) {
		//Replacing '+' sign and spaces with 0 and then, checking for digits
		phNo = phNo.replaceAll("\\+", "0").replaceAll(" ", "0");
		for(int index=0; index<phNo.length(); index++) {
			if(!Character.isDigit(phNo.charAt(index))) {
				return true;
			}
		}
		return false;
	}
	
	boolean validateCountrySpecs(String phNo) {
		switch (phNo.length()) {
			case 10:
			case 12:
				if(phNo.substring(0, 1).equals("9") || phNo.substring(0, 1).equals("8")){
					return true;
				}else {
					return false;
				}
		
			case 11:
				if(phNo.substring(0, 2).equals("09") || phNo.substring(0, 2).equals("08")){
					return true;
				}else {
					return false;
				}
					
			case 14:
				if(phNo.substring(0, 5).equals("+91 9") || phNo.substring(0, 5).equals("+91 8")){
					return true;
				}else {
					return false;
				}
					
			default:
				return false;
		}
	}
	
	public static void main(String[] args) {
		PhoneNumberValidation phoneNumberValidation = new PhoneNumberValidation();
		String[] phNos = {"+91 9765463742", "09765463742", "976 546 3742", "9765463742", "9765463A42", "976546342", "6976546342"};
		//Calling validation on Phone No.
		for(int index=0; index<phNos.length; index++) {
			phoneNumberValidation.validatePhoneNumber(phNos[index]);
		}
	}
}
