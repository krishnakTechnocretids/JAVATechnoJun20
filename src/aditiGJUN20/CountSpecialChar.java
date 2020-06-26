/*
Count total special characters like _ , [ { ] } from every word, 
do not use any loop.
                                          
Hint : Use replace method [Think about it, how it can help].

Input :  Kr[i{s]hn}_a,Tech
Output : total special characters are 6
*/

package aditiGJUN20;

public class CountSpecialChar {
	
	/* Method gives count of Special characters in String.(To Achieve find the length of 
	 * original String and deduct string length after replacing all special char.) 
	 */ 
	void getSpecialCharCount(String str) {
		int spCharCount=0;
	
		spCharCount=str.length()-(str.replace("[","").replace("]","").
				replace("{","").replace("}","").replace(",","").
				replace("_","")).length();
		System.out.println("Total Special Characters are: "+spCharCount);	
	}
	
	public static void main(String[] args) {
		CountSpecialChar countSpecialChar= new CountSpecialChar();
		String str="Kr[i{s]hn}_a,Tech";
		System.out.println("Input String: "+str);
		
		countSpecialChar.getSpecialCharCount(str);
	}

}
