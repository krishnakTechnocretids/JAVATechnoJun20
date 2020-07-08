package archanaNJun20;

public class PhoneNumberValidation {
	void checkPhoneNumberValidation(String phoneNumber){
		boolean flag=true;
		int length=phoneNumber.length();
		switch (length) {
		case 10:
			if(phoneNumber.startsWith("9")||phoneNumber.startsWith("8")||phoneNumber.startsWith("7")) {
				for(int index=1;index<length;index++) {
					if(Character.isLetter(phoneNumber.charAt(index))==true || phoneNumber.charAt(index)==' '){	
						flag=false;
						break;
					}
				}
				if(flag==false)		
					System.out.println(phoneNumber +" InVaild number");
				else	
					System.out.println(phoneNumber +" Vaild number");
			}else
				System.out.println(phoneNumber +" InVaild number");
			break;
		case 11:
			if(phoneNumber.startsWith("0") && phoneNumber.charAt(1)=='9'|| phoneNumber.charAt(1)=='8' || phoneNumber.charAt(1)=='7'){
				for(int index=0;index<length;index++) {
					if(Character.isLetter(phoneNumber.charAt(index))==true || phoneNumber.charAt(index)==' ')
						flag=false;
				}
				if(flag==false)		
					System.out.println(phoneNumber +" InVaild number");
				else	
					System.out.println(phoneNumber +" Vaild number");
			}else
				System.out.println(phoneNumber +" InVaild number");
			break;
		case 12:

			if(phoneNumber.startsWith("9")||phoneNumber.startsWith("8")||phoneNumber.startsWith("7") && phoneNumber.charAt(3)==' ' && phoneNumber.charAt(7)==' '){
				for(int index=1;index<length;index++) {
					if(Character.isLetter(phoneNumber.charAt(index))==true)
						flag=false;
				}
				if(flag==false)		
					System.out.println(phoneNumber +" InVaild number");
				else	
					System.out.println(phoneNumber +" Vaild number");
			}else
				System.out.println(phoneNumber +" InVaild number");
			break;
		case 14:
			if(phoneNumber.startsWith("+91 ") && phoneNumber.charAt(4)=='9'|| phoneNumber.charAt(4)=='8'||phoneNumber.charAt(4)=='7' ){
				for(int index=4;index<length;index++) {
					if(Character.isLetter(phoneNumber.charAt(index))==true || phoneNumber.charAt(index)==' '){	
						flag=false;
						break;
					}
				}
				if(flag==false)		
					System.out.println(phoneNumber +" InVaild number");
				else	
					System.out.println(phoneNumber +" Valid number");
			}else
				System.out.println(phoneNumber +" InVaild number");
			break;

		default  :System.out.println(phoneNumber +" Invalid phone number");
		break;
		}
	}
	public static void main(String[] args) {
		PhoneNumberValidation phoneNumberValidation=new PhoneNumberValidation();
		String input[]= {"9028553461","90 8553461","90y8553461","2028553461","09028553461","90y8553461","1028553461","02028553461","090 8553461","902 855 3461"
				,"90i 855 3461","202 855 3461","+91 9028553461","+91 90 8553461","+91 90y8553461","+91 2028553461"};
		for(int index=0;index<input.length;index++)	{
			phoneNumberValidation.checkPhoneNumberValidation(input[index]);
		}
	}
}