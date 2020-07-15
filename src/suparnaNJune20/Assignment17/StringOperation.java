/*
 * Assignment 17 : 25th Jun 2020

1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2

2) Write a program which print first and last index of every characters only if character has multiple occurrence.

Input : technocredits
Output :
t -> first index = 0 Last index = 11
e -> first index = 1 Last index = 8
c -> first index = 2 Last index = 6

Hint : To find first index of character --> indexOf() method
            To find last index of character --> lastIndexOf() method.
 */
package suparnaNJune20.Assignment17;

public class StringOperation {

	void countAllTypeChar(String str) {
		int digitCnt = 0, letterCnt = 0, lowerCaseCnt = 0, upperCaseCnt = 0, SpecialCharCnt = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index)))
				digitCnt++;
			else if (Character.isLowerCase(str.charAt(index))) {
				letterCnt++;
				lowerCaseCnt++;
			} else if (Character.isUpperCase(str.charAt(index))) {
				letterCnt++;
				upperCaseCnt++;
			} else
				SpecialCharCnt++;
		}
		System.out.println("Input:" + str);
		System.out.println("Output : ");
		System.out.println("Total digit:" + digitCnt);
		System.out.println("Total Letters:" + letterCnt);
		System.out.println("Total Uppercase:" + upperCaseCnt);
		System.out.println("Total Lowercase:" + lowerCaseCnt);
		System.out.println("Total Special char:" + SpecialCharCnt);
	}

	void charMultiOccuranceCheck(String str) {
		System.out.println("Input : " + str + "\n" + "Output :");
		for (int index = 0; index < str.length();) {
			if ((str.indexOf(str.charAt(index)) != str.lastIndexOf(str.charAt(index)))
					&& (str.indexOf(str.charAt(index)) < str.lastIndexOf(str.charAt(index))))
				System.out.println(str.charAt(index) + "-> first index " + str.indexOf(str.charAt(index))
						+ " Last index = " + str.lastIndexOf(str.charAt(index)));
			str = str.substring(index + 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program to Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.");
		new StringOperation().countAllTypeChar("1rRpd3F9#K(E");
		System.out.println(" \n\nprogram which print first and last index of every characters only if character has multiple occurrence.");
		new StringOperation().charMultiOccuranceCheck("technocredits");
	}
}
