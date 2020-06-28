package madhuraMJun20.scannerClass;
/*Count total special characters like _ , [ { ] } from every word, do not use any loop.
Hint : Use replace method [Think about it, how it can help].

Input :  Kr[i{s]hn}_a,Tech
Output : total special characters are 6 */

public class CountSpecialChar {
	void totalSpChar(String input) {
		String replace = input.replace("[", "").replace("]", "").replace("{","").replace("}", "").replace("_", "").replace(",", "");
		System.out.println("Total special characters are " +(input.length()-replace.length()));
	}
	
	public static void main(String[] args) {
		CountSpecialChar countSpecialChar = new CountSpecialChar();
		String input = "Kr[i{s]hn}_a,Tech";
		countSpecialChar.totalSpChar(input);
	}
}
