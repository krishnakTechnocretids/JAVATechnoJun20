//Count Special Character is given String

package aavrutiDJun20;

public class CountSpecialChar {
	
	void countSpecialCharacter(String input) {
		String replaceInput = input.replaceAll("[a-z]","");
		replaceInput = replaceInput.replaceAll("[A-Z]","");
		System.out.println("Input ---> " + input);
		System.out.println("Total special characters are " + replaceInput.length());
	}
	
	public static void main(String[] args) {
		CountSpecialChar countSpecialChar = new CountSpecialChar();
		
		String input = "Kr[i{s]hn}_a,Tech";
		countSpecialChar.countSpecialCharacter(input);
	}
}
