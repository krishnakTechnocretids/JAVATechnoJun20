package kartikeyDJune20;

public class PhoneNumValidations {
	
		
		void phoneNumValidation(String number) {
			int numLength=number.length();
			boolean isNumValid=false;
			if(numLength>=10) {
				for(int index=0;index<number.length();index++) {			
					if(numLength==11 && number.charAt(0)=='0') {
						isNumValid=true;
					}else if(numLength==12 && number.charAt(3)==' ' && number.charAt(7)==' ' ) {
						isNumValid=true;
					}else if(numLength==14 && number.substring(0, 4).equals("+91 ")) {
						isNumValid=true;
					}else if(numLength==10 && Character.isDigit(number.charAt(index))==true &&(number.charAt(0)=='9' || number.charAt(0)=='8' || number.charAt(0)=='7'))  {
						isNumValid=true;
					}else {
						isNumValid=false;
						break;
					}			
				}
			}
			
			if(isNumValid==true)
				System.out.println(number+ " is valid");
			else {
				System.out.println(number+" is inValid");
			}
		}
		
		public static void main(String[] args) {
			PhoneNumValidations phoneNumberValidations= new PhoneNumValidations();
			String num="97116738n9";
			phoneNumberValidations.phoneNumValidation(num);
			
		}

	}
