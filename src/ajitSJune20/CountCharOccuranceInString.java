//Write a program which print first and last index of every characters only if character has multiple occurrence.

package ajitSJune20;

public class CountCharOccuranceInString {
	
	void displayCount(String input) {
		
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			if(index == input.indexOf(ch))
				if(input.indexOf(ch) != input.lastIndexOf(ch))
					System.out.println(ch+" -> First Index : "+input.indexOf(ch) +" Last Index : "+input.lastIndexOf(ch));
		}	
	}

	public static void main(String[] args) {
		CountCharOccuranceInString countCharOccuranceInString= new CountCharOccuranceInString();
		
		String input="technocredits";
		countCharOccuranceInString.displayCount(input);
	}

}
