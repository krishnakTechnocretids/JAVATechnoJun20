/*Count total special characters like _ , [ { ] } from every word, do not use any loop.
Hint : Use replace method [Think about it, how it can help].

Input :  Kr[i{s]hn}_a,Tech
Output : total special characters are 6 */

package swapnaWJun20;

public class ReplaceSpecialChar {

	void CountSpecialChar(String input)	{
		
		int count = (input.replace("[", "").replace("{", "").
				replace("]", "").replace("}","").
				replace("_", "").replace(",", "")).length();
		
		System.out.println("Total special characters are "+(input.length()-count));
	}

	public static void main(String[] args) {
		String input = "Kr[i{s]hn}_a,Tech";

		ReplaceSpecialChar replaceSpecialChar = new ReplaceSpecialChar();
		replaceSpecialChar.CountSpecialChar(input);
	}
}
