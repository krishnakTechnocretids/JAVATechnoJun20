/*
Count total special characters like _ , [ { ] } from every word, do not use any loop.
Hint : Use replace method [Think about it, how it can help].

Input :  Kr[i{s]hn}_a,Tech
Output : total special characters are 6 
 */

package shrutiDJun20;

public class CountOfSplChar {
	
	void findSpecialChar(String input){
		int countspl = 0;
		for(int index=0; index<input.length(); index++){
		char ch = input.charAt(index);
		
		 if(!Character.isLetter(ch))
			 countspl++;
	}
		System.out.println("Count of Spl Char is "+countspl++);
	}
	
	public static void main(String[] args) {
		CountOfSplChar countOfSplChar = new CountOfSplChar();
		countOfSplChar.findSpecialChar("Kr[i{s]hn}_a,Tech");
		
	}

}
