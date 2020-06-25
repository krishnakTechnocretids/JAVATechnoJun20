/* Assignment 17 : 25th Jun 2020

 * 2) Write a program which print first and last index of every characters only if character has multiple occurrence.

Input : technocredits
Output :
t -> first index = 0 Last index = 11
e -> first index = 1 Last index = 8
c -> first index = 2 Last index = 6

Hint : To find first index of character --> indexOf() method
            To find last index of character --> lastIndexOf() method.
 */
package pranitaPJun20;

public class IndexOfChar {
	
	void displayFirstLastIndexCharString(String input) {
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);			
			if(index==input.indexOf(ch)) {
				if (input.indexOf(ch)!=input.lastIndexOf(ch))
			System.out.println(ch+" -> first Index = "+input.indexOf(ch)+";" +" Last Index ="+input.lastIndexOf(ch));	
				}
			}
		}
			
	public static void main(String[] args) {
		IndexOfChar indexOfChar = new IndexOfChar();
		String input = "technocredits";
		indexOfChar.displayFirstLastIndexCharString(input);
	}
}
	