package barkhaPJun20;

public class VerifyMobileNumber {
	private boolean isNumber(String num){
		for (int index = 0; index < num.length(); index++) {
			if (Character.isAlphabetic(num.charAt(index)))
				return false;                                 // if return false then not a number.(include alphabet)
		}
		return true;
	}
	void validMobileNumber(String num) {
		System.out.println("Mobile Number provided to validate is: "+num);
		//Exa.+91 9765463742
		if (num.length()==14) {
			if (num.startsWith("+91")&& num.charAt(4)=='9' && isNumber(num.substring(4)) && isNumber(num)) {
				
					System.out.println("Number is Valid");
			} else 
					System.out.println("Number is Invalid");
		}	
		//Exa.09765463742
		else if (num.length()==11) {
			if (num.startsWith("0")&& num.charAt(1)=='9' && isNumber(num)) {
				
					System.out.println("Number is Valid");
			} else 
					System.out.println("Number is Invalid");
		}
		//Exa.976 546 3742
		else if (num.length()==12) {
			if ((num.startsWith("9"))&&num.charAt(3)==' ' && num.charAt(7)==' ' && isNumber(num.replace(" ", "")))
				System.out.println("Number is Valid");
			else
				System.out.println("Number is Invalid");
		}				
		//	Exa.9765463742	
		else if (num.length()==10)  {
			if (num.startsWith("9") && isNumber(num)) {
				
					System.out.println("Number is Valid");
			} else 
					System.out.println("Number is Invalid");
		}
		//out of Desire Length
		else 
			System.out.println("Number is Invalid");
		}	
public static void main(String[] args) {
		VerifyMobileNumber  mobileNumber=new VerifyMobileNumber ();
		//String mobileNum="+91 9765463742";
		//System.out.println("Mobile Number provided to validate is: "+mobileNum);
		mobileNumber.validMobileNumber("907 65 46372");
	}
}	