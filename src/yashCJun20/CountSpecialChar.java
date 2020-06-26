package yashCJun20;

public class CountSpecialChar {
	
	void cntSpclChar (String name) {
		String uname;
		
		uname=name.replace("[", "");
		uname=uname.replace("{", "");
		uname=uname.replace("]", "");
		uname=uname.replace("}", "");
		uname=uname.replace("_", "");
		uname=uname.replace(",", "");
		int charCount=0;
		charCount=name.length()-uname.length();
		System.out.println("total special characters are " +charCount);
		
	}

	public static void main(String[] args) {
		
		CountSpecialChar countSpecialChar = new CountSpecialChar();
		String s = "Kr[i{s]hn}_a,Tech";
		countSpecialChar.cntSpclChar(s);

	}

}
