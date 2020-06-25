/*2) Write a program which print first and last index of every characters only if character has multiple occurrence.

Input : technocredits
Output :
t -> first index = 0 Last index = 11
e -> first index = 1 Last index = 8
c -> first index = 2 Last index = 6

Hint : To find first index of character --> indexOf() method
       To find last index of character --> lastIndexOf() method.*/
package rachanaGJun20.String;

public class StringIndexOfChar {

	void printFirstAndLastIndexOfChar(String str) { // method will print first and last index of a char if char
													// occurrence is more than one

		for (int i = 0; i < str.length(); i++) {
			int charcount = 0;
			if (i == str.indexOf(str.charAt(i))) {
				for (int j = 0; j < str.length(); j++) {
					if (str.charAt(i) == str.charAt(j))
						charcount++;
				}
			}
			if (charcount > 1)
				System.out.println(str.charAt(i) + "-> First index = " + str.indexOf(str.charAt(i)) + "Last index = "
						+ str.lastIndexOf(str.charAt(i)));

		}
	}

	public static void main(String[] args) {
		StringIndexOfChar stringindexofchar = new StringIndexOfChar();
		String str = "technocredits";
		System.out.println("input String is: " + str);
		stringindexofchar.printFirstAndLastIndexOfChar(str);
	}

}
