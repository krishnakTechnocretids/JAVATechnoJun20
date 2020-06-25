//Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

package ajitSJune20;

public class CountLetDigSpclChar {
	
	void displayCount(String str) {
		int upper = 0, lower = 0, digit = 0, special = 0; 
		
		for(int index=0;index<str.length();index++) {
			char ch=str.charAt(index);
			if(Character.isDigit(ch))
				digit++;
			else if(Character.isUpperCase(ch))
				upper++;
			else if(Character.isLowerCase(ch))
				lower++;
			else
				special++;
		}
		/*System.out.println("Total Digit:--------> "+digit);
		System.out.println("Total UpperCase:----> "+upper);
		System.out.println("Total LowerCase:----> "+lower);
		System.out.println("Total SpecialChar:--> "+special); */
		System.out.println("Total Digit:--------> "+digit + "\nTotal UpperCase:----> "+upper+"\nTotal LowerCase:----> "+lower+"\nTotal SpecialChar:--> "+special);
	}

	public static void main(String[] args) {
		CountLetDigSpclChar countLetDigSpclChar= new CountLetDigSpclChar();
		
		String str="1rRpd3F9#K(E";
		countLetDigSpclChar.displayCount(str);
	}
}
