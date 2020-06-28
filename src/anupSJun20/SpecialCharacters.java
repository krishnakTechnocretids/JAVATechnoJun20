package anupSJun20;
/*Program 3 : 
Count total special characters like _ , [ { ] } from every word, do not use any loop.
Hint : Use replace method [Think about it, how it can help].

Input :  Kr[i{s]hn}_a,Tech
Output : total special characters are 6 */

public class SpecialCharacters {
	static void findSpecialCharacters(String str) {
		int strLength =  str.length() - str.replace("[", "").replace("{", "").replace("]", "").replace("}", "").replace("_", "").replace(",", "").length();
		System.out.println("total special characters are " + strLength);
	}
	public static void main(String[] args) {
		findSpecialCharacters("Kr[i{s]hn}_a,Tech");
	}

}
