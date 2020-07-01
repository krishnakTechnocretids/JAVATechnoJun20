/*
 * Assignment 22 : 1st Jul 2020


Program 2:
Verify given String is palindrome or not. 
Input: radar
Output : Given string radar is palindrome.

Input: technocredits
Output: Given string technocredits is not palindrome.
 */
package suparnaNJune20.Assignment22;

public class PalindromeString {

	void checkPalindromeStringMethod1(String str1) {
		String tempStr = "";
		char tempCh;
		int index = 1;
		while ((str1.length() - index) != -1) {
			tempCh = str1.charAt(str1.length() - index);
			tempStr = tempStr.concat(String.valueOf(tempCh));
			index++;
		}
		if (str1.equalsIgnoreCase(tempStr))
			// or if ((str1.compareToIgnoreCase(tempStr)) != 0)
			System.out.println(str1 + " is Palindrome String  ");
		else
			System.out.println(str1 + " is not Palindrome String ");
	}

	void checkPalindromeStringMethod2(String str1) {
		int lIndex = str1.length() - 1;
		int fIndex = 0;
		char ch1, ch2;
		if (lIndex / 2 != 0) {
			while (lIndex != fIndex) {
				ch1 = str1.charAt(lIndex);
				ch2 = str1.charAt(fIndex);
				if (ch1 != ch2) {
					System.out.println(str1 + " is not Palindrome String ");
					return;
				} 
				else {
					lIndex--;
					fIndex++;
				}
			}
			System.out.println(str1 + " is Palindrome String  ");
		} else {
			while (lIndex < fIndex) {
				ch1 = str1.charAt(lIndex);
				ch2 = str1.charAt(fIndex);
				System.out.println(ch1 + "ch1");
				System.out.println(ch2 + "ch2");
				if (ch1 != ch2) {
					System.out.println(str1 + " is not Palindrome String ");
					return;
				}
				else {
					lIndex--;
					fIndex++;
				}
			}
			System.out.println(str1 + " is Palindrome String  ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PalindromeString().checkPalindromeStringMethod1("Radar");
		new PalindromeString().checkPalindromeStringMethod2("Techno");
		new PalindromeString().checkPalindromeStringMethod2("madam");
	}

}
