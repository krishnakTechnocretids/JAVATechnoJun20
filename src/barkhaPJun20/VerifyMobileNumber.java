package barkhaPJun20;

public class VerifyMobileNumber {
	
	void validMobileNumber(String num) {
		//Exa.+91 9765463742
		if (num.length()==14) {
			if (num.startsWith("+91")&& num.charAt(4)=='9'){
				boolean flag=true;
				for (int i=4;i<num.length();i++){
					if (Character.isAlphabetic(num.charAt(i))){
						flag=false;
						break;
					}
				}
				if (flag)
					System.out.println("Number is Valid");
				else 
					System.out.println("Number is Invalid");
			}else
				System.out.println("Number is Invalid");
		}
	//Exa.09765463742
	if (num.length()==11) {
		if (num.startsWith("0")&& num.charAt(1)=='9') {
	
			boolean flag=true;
			for (int index=4;index<num.length();index++){
				if (Character.isAlphabetic(num.charAt(index))){
					flag=false;
					break;
				}
			}
			if (flag)
				System.out.println("Number is Valid");
			else
				System.out.println("Number is Invalid");
		}else
			System.out.println("Number is Invalid");
	}
	//Exa.976 546 3742
	if (num.length()==12) {
		
		if ((num.startsWith("9"))&&num.charAt(3)==' ' && num.charAt(7)==' ')
			System.out.println("Number is Valid");
		else
			System.out.println("Number is Invalid");
	}	
	//	Exa.9765463742	
	if (num.length()==10)  {
		if (num.startsWith("9")) {
			boolean flag=true;
			for (int index=1;index<num.length();index++){
				if (Character.isAlphabetic(num.charAt(index))){
					flag=false;
					break;
				}
			}
			if (flag)
				System.out.println("Number is Valid");
			else 
				System.out.println("Number is Invalid");
		}else 
		System.out.println("Number is Invalid");
	}	
	//out of Desire Length
	if (num.length()>14  || num.length()<10)
		System.out.println("Number is Invalid");
	}	
	public static void main(String[] args) {
		VerifyMobileNumber  mobileNumber=new VerifyMobileNumber ();
		String mobileNum="9765463A42";
		System.out.println("Mobile Number provided to validate is: "+mobileNum);
		mobileNumber.validMobileNumber(mobileNum);
		
	}
}
