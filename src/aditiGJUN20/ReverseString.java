/*
Print given string in reverse order.

Input : Hello this is technocredits
Output : stiderconhcet si siht olleH
*/

package aditiGJUN20;

public class ReverseString {
	
	// Used String Concatenation to reverse string. 
	void getReverseString(String str) {
		System.out.println("\nOutput String (Reverse String): ");
		
		for(int i=str.length()-1;i>=0;i--)
			System.out.print(str.charAt(i));
	}
	
	public static void main(String[] args) {
		ReverseString reverseString=new ReverseString();
		
		String str="Hello this is technocredits";
		System.out.println("Input String: \n"+str);
		reverseString.getReverseString(str);
	}

}
