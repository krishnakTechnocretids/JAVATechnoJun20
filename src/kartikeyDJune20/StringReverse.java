package kartikeyDJune20;

public class StringReverse {
	
	static void reverse(String input) {
		String rev="";
		
		for(int index=input.length()-1;index>=0;index--) {
			
			rev=String.valueOf(input.charAt(index));
			System.out.print(rev);
			
		} 
	}
		
		
	
	public static void main(String[] args) {
		String input="Hello this is technocredits";
		
		reverse(input);
		
		
	}

}
