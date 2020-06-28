package amitaRJun20;

public class ReverseFullString {
	
	void stringReverse() {
		String input="Hello this is technocredits";
		System.out.println("Input String : "+input);
		String reverseWord="";
		for(int index=input.length()-1; index>=0; index--)
		{
			reverseWord=reverseWord+input.charAt(index);
		}	
		System.out.println("The reverse String is : "+reverseWord);
	}
	public static void main(String[] args) {
		ReverseFullString reversestring=new ReverseFullString();
		reversestring.stringReverse();
	}
}
