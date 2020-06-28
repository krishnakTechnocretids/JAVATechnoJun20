package madhuraMJun20;
/*Write a program which print first and last index of every characters only if character has multiple occurrence.

Input : technocredits
Output :
t -> first index = 0 Last index = 11
e -> first index = 1 Last index = 8
c -> first index = 2 Last index = 6

Hint : To find first index of character --> indexOf() method
            To find last index of character --> lastIndexOf() method.

*/
public class IndexOfChar {
	void firstLastIndex(String str) {
		for(int index=0; index<str.length();index++) {
			char ch = str.charAt(index);
			if(index==str.indexOf(ch)) {
				if(str.indexOf(ch) !=  str.lastIndexOf(ch)) {
					System.out.println(ch+ "--> First index = " +str.indexOf(ch)+ " , Last index = "+str.lastIndexOf(ch));
				}
			}
		}			
	}
	
	public static void main(String [] args) {
		IndexOfChar indexOfChar = new IndexOfChar();
		String str = "technocredits";
		indexOfChar.firstLastIndex(str);
	}
}
