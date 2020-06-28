package abhishekSJun20;
/*Program 3 : 
Count total special characters like _ , [ { ] } from every word, do not use any loop.
Hint : Use replace method [Think about it, how it can help].

Input :  Kr[i{s]hn}_a,Tech
Output : total special characters are 6 
*/

public class CountSpecialCharacter {
//method to count Special Character
	void countSpecialCharactersInWord(String str) {
		int count = 0;
		String name = str.replace("[", "").replace("{", "").replace("]", "").replace("}", "").replace("_", "").replace(",", "");
		count = str.length() - name.length();
		System.out.println("Total special characters are: " + count);

	}

	public static void main(String[] args) {
		CountSpecialCharacter countSpecialCharacter = new CountSpecialCharacter();
		String input = "Kr[i{s]hn}_a,Tech";
		countSpecialCharacter.countSpecialCharactersInWord(input);

	}

}
