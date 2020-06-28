package yashCJun20;

public class StringReverse {
	
	void strRev(String name) {
		
		char uname;
		
		for(int i=name.length();i>0;i--) {
			uname =name.charAt(i-1);
			//System.out.print(name.charAt(i));
			System.out.print(uname);
			
			
		}
	}

	public static void main(String[] args) {
		
		StringReverse stringReverse=new StringReverse();
		String s="Hello this is technocredits";
		stringReverse.strRev(s);

	}

}
