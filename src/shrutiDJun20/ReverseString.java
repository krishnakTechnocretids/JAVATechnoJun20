package shrutiDJun20;

public class ReverseString {
//Hello this is technocredits
//0123456789
//stiderconhcet si siht olleH
	void findReverseofString(String input){
		int length = input.length();
		String reverse= "";
		
		for(int i=(length-1); i>=0 ; i--){
			reverse = reverse+input.charAt(i);
		}
		System.out.println(reverse);
	}
	public static void main(String[] args) {
		ReverseString reverseString= new ReverseString();
		reverseString.findReverseofString("Hello this is technocredits");
		
	}
	
	
	
}
