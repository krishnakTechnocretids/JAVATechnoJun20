/*
Count total special characters like _ , [ { ] } from every word, do not use any loop.
Hint : Use replace method [Think about it, how it can help].

Input :  Kr[i{s]hn}_a,Tech
Output : total special characters are 6 
 */
package maheshKJun20;

public class CountSpecialCharInWord {
	
	void displayCountOfSpecialWord(String str) {
		//Method to Display count of Special characters in a Word
		System.out.println("Total Special character are: " + (str.length() - str.replace("_", "").replace(",", "").replace("[", "").replace("{", "").replace("]", "").replace("}", "").length()));
	}
	
	public static void main(String[] args) {
		CountSpecialCharInWord countSpecialCharInWord = new CountSpecialCharInWord();
		String str = "Kr[i{s]hn}_a,Tech";
		countSpecialCharInWord.displayCountOfSpecialWord(str);
	}

}
