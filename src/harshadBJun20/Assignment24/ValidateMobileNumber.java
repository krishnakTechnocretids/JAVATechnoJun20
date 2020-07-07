package harshadBJun20.Assignment24;

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

public class ValidateMobileNumber {

	void checkMobileNumberValidOrNot(String mobNumber){
		String checkMobNumber = mobNumber;
		boolean flag=false;
		if(mobNumber.length()>=10) {
			if(mobNumber.startsWith("+91") || mobNumber.startsWith("0",0) || mobNumber.startsWith("9",0) || mobNumber.startsWith("8",0) || mobNumber.startsWith("7",0)) {
				flag = true;
				mobNumber = mobNumber.replace("+","").replace(" ","");

				for(int index=0;index<mobNumber.length();index++) {
					if(Character.isDigit(mobNumber.charAt(index))) {
						flag = true;
					}else {
						flag = false;
						break;
					}		
				}			

			}else {
				flag = false;
			}
		}else {
			flag = false;
		}


		if(flag == true) {
			System.out.println(checkMobNumber+" --> Valid");
		}else {
			System.out.println(checkMobNumber+" --> Invalid");
		}
	}
	public static void main(String[] args) {
		ValidateMobileNumber validateMobileNumber = new ValidateMobileNumber();
		validateMobileNumber.checkMobileNumberValidOrNot("+91 9765463742");
		validateMobileNumber.checkMobileNumberValidOrNot("09765463742");
		validateMobileNumber.checkMobileNumberValidOrNot("976 546 3742");
		validateMobileNumber.checkMobileNumberValidOrNot("9765463742");
		validateMobileNumber.checkMobileNumberValidOrNot("9765463A42");
		validateMobileNumber.checkMobileNumberValidOrNot("976546342");
		validateMobileNumber.checkMobileNumberValidOrNot("6976546342");
	}
}
