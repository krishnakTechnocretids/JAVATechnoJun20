package vaishnaviVJun20_arrayExamples;

/*Validate given phone number.

+91 9765463742 --> valid
09765463742 --> valid
976 546 3742 --> valid
9765463742 --> valid

9765463A42 --> Invalid
976546342 --> Invalid
6976546342 --> Invalid

Note : phone number is given in String format. */

public class ValidateGivenPhone {
	int startsWith;
	
	void validateGivenPhoneNumber(String phoneNo) {
		    switch(phoneNo.length()){
		    case 14:
		    	if(containsLetter(phoneNo) == false && validateCountryCode(phoneNo) == true) {
					System.out.println(phoneNo+" is a valid Phone Number");
				}else {
					System.out.println(phoneNo+" is NOT a valid Phone Number");
				}
				break;
				
		    case 12:
		    	if(phoneNo.charAt(3) == ' ' && phoneNo.charAt(7) == ' ' &&  containsLetter(phoneNo) == false && validateCountryCode(phoneNo) == true) {
		    		System.out.println(phoneNo+" is a valid Phone Number");
				}else {
					System.out.println(phoneNo+" is NOT a valid Phone Number");
				}
				break;
				
		    case 10:
		    	if(containsLetter(phoneNo) == false && validateCountryCode(phoneNo) == true) {
		    		System.out.println(phoneNo+" is a valid Phone Number");
				}else {
					System.out.println(phoneNo+" is NOT a valid Phone Number");
				}
				break;
		   
		    case 11:
		    	if(containsLetter(phoneNo) == false && validateCountryCode(phoneNo) == true) {
		    		System.out.println(phoneNo+" is a valid Phone Number");
				}else {
					System.out.println(phoneNo+" is NOT a valid Phone Number");
				}
				break;
		    
		    default:
				System.out.println(phoneNo+" is NOT a valid Phone Number.");
				break;	
				
		    }		
	}
	
	boolean containsLetter(String phNo)
	{
		phNo = phNo.replaceAll("\\+", "0").replaceAll(" ", "0");
		for(int index=0;index<phNo.length();index++) {
			if(!Character.isDigit(phNo.charAt(index))) 
			    return true;
		}
		     return false;
	}
	
	boolean validateCountryCode(String phNo) {
		for(int index=0;index<phNo.length();index++) {
			if(phNo.substring(0,4).equals("+91 ") || phNo.charAt(startsWith) == '0'   || phNo.charAt(startsWith) == '9' || phNo.charAt(startsWith) == '7' || phNo.charAt(startsWith) == '8') {
				return true;
			}	
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		ValidateGivenPhone validateGivenPhone = new ValidateGivenPhone();
		String[] phoneNo =  {"+91 9765463742","09765463742","976 546 3742","9765463742","9765463A42","976546342","6976546342"};
		for(int index=0;index<phoneNo.length;index++) {
		validateGivenPhone.validateGivenPhoneNumber(phoneNo[index]);
		}
	}
}
