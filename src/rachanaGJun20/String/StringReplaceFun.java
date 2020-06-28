/*Count total special characters like _ , [ { ] } from every word, do not use any loop.
Hint : Use replace method [Think about it, how it can help].

Input :  Kr[i{s]hn}_a,Tech
Output : total special characters are 6 */
package rachanaGJun20.String;

public class StringReplaceFun {

	// method will print special char count in a given string
	void countSpecialChar(String givenstr) {
		

		String newstr = givenstr;
		newstr = newstr.replace("Kr", "");
		newstr = newstr.replace("i", "");
		newstr = newstr.replace("s","");
		newstr = newstr.replace("hn","");
		newstr = newstr.replace("a","");
		newstr = newstr.replace("Tech","");

		System.out.println("Total Special Characters in a given string : " + newstr.length());

	}

	public static void main(String[] args) {

		StringReplaceFun stringreplacefun = new StringReplaceFun();
		String str = "Kr[i{s]hn}_a,Tech";
		System.out.println("Given string is : " + str);
		stringreplacefun.countSpecialChar(str);
	}

}
