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
	boolean flag = true;
	
	void validateGivenPhoneNumber(String[] array) {
		for(int index=0;index<array.length;index++) {
			if(array[index].length() == 14 || array[index].length() == 12 || array[index].length() == 11 || array[index].length() ==10) {
				if(array[index].substring(0,4).equals("+91 ") || array[index].charAt(startsWith) == '0'   || array[index].charAt(startsWith) == '9' || array[index].charAt(startsWith) == '7' || array[index].charAt(startsWith) == '8') {
					for(int innerIndex=0;innerIndex<array[index].length();innerIndex++) {
						if(Character.isLetter(array[index].charAt(innerIndex))) {
							flag = false;
							System.out.println(array[index] +":  This phone number is Invalid");
						}	
					}
					if(flag == true)
						System.out.println(array[index] +":  This phone number is Valid");
				}
				else
					System.out.println(array[index] +":  This phone number is invalid");
			}
			else
				System.out.println(array[index] +":  This phone number is invalid");
		}
	}

	public static void main(String[] args) {
		ValidateGivenPhone validateGivenPhone = new ValidateGivenPhone();
		String[] phoneNo =  {"+91 9765463742","09765463742","976 546 3742","9765463742","9765463A42","976546342","6976546342"};
		validateGivenPhone.validateGivenPhoneNumber(phoneNo);
	}
}
