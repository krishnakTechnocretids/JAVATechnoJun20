//Reverse the given String "Hello this is technocredits"

package aavrutiDJun20;

public class ReverseString {
	
	void stringReverse(String input) {
		
		int inputLength = (input.length()) - 1;
		String concatenateString ="";
		
		for(int index = inputLength;index>=0;index--) {
			char ch = input.charAt(index);
			concatenateString = concatenateString + ch;
		}
		System.out.println("Input String is   : " + input);
		System.out.println("Reverse String is : " + concatenateString);
	}
	
	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		
		String input = "Hello this is technocredits";
		reverseString.stringReverse(input);
		
	}

}
