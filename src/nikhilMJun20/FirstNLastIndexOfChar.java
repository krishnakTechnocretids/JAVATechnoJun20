/*Write a program which print first and last index of every characters only if character has multiple occurrence.

Input : technocredits
Output :
t -> first index = 0 Last index = 11
e -> first index = 1 Last index = 8
c -> first index = 2 Last index = 6

Hint : To find first index of character --> indexOf() method
            To find last index of character --> lastIndexOf() method.
*/

package nikhilMJun20;

public class FirstNLastIndexOfChar {
	void displayFirstLastIndex(String str) {
		System.out.println("Input : "+str+"\nOutput:-");
		
		//This detects fist and last occurrence but, in reverse order i.e. c e t
		for(int index=0; index<str.length(); index++) {
			if(index == str.indexOf(str.charAt(index)) && str.indexOf(str.charAt(index)) < str.lastIndexOf(str.charAt(index))) {
				System.out.println((str.charAt(index))+" -> "+" First Index = "+(str.indexOf(str.charAt(index)))+" Last Index = "+(str.lastIndexOf(str.charAt(index))));
			}
		}
	}
	
	public static void main(String[] args) {
		FirstNLastIndexOfChar firstNLastIndexOfChar = new FirstNLastIndexOfChar();
		
		String str = "technocredits";
		firstNLastIndexOfChar.displayFirstLastIndex(str);
	}
}
