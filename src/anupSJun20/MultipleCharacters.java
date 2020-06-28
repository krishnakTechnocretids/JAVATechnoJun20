package anupSJun20;
/*2) Write a program which print first and last index of every characters only if character has multiple occurrence.

Input : technocredits
Output :
t -> first index = 0 Last index = 11
e -> first index = 1 Last index = 8
c -> first index = 2 Last index = 6

Hint : To find first index of character --> indexOf() method
            To find last index of character --> lastIndexOf() method.*/

public class MultipleCharacters {
	static void findMultipleCharacters(String str) {
		for(int index = 0; index<str.length();index++) {
			char ch = str.charAt(index);
			if(index != str.lastIndexOf(ch)) {
				System.out.println(ch + " --> "+" First Index " + str.indexOf(ch) + " Last Index " + str.lastIndexOf(ch) );
		}
		}
		
	}
	public static void main(String[] args) {
		String str = "technocredits";
		findMultipleCharacters(str);
	}

}
