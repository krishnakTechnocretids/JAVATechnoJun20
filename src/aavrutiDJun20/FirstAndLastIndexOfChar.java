//Print First Index and last Index of every char of input 'technocredits'

package aavrutiDJun20;

public class FirstAndLastIndexOfChar {
	
	void calcFirstAndLastIndex(String input) {
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(input.indexOf(ch) != input.lastIndexOf(ch) && index == input.indexOf(ch))
				System.out.println(ch + " -> first index = " + (input.indexOf(ch)) + " Last index = " + input.lastIndexOf(ch));
		}
	}

	public static void main(String[] args) {
		FirstAndLastIndexOfChar firstAndLastIndexOfChar = new FirstAndLastIndexOfChar();
		
		String input = "technocredits";
		firstAndLastIndexOfChar.calcFirstAndLastIndex(input);
	}
}
