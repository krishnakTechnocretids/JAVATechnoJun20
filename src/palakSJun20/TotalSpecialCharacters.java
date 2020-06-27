/*Count total special characters like _ , [ { ] } from every word, do not use any loop.
Hint : Use replace method [Think about it, how it can help].
Input :  Kr[i{s]hn}_a,Tech
Output : total special characters are 6 */
package palakSJun20;

public class TotalSpecialCharacters {
	
	void countTotalSpecialCharacter(String str1){
		String str2 = str1.replace("[", " ").replace("{", " ").replace("]", " ").replace("}", " ").replace("_", " ").replace(",", " ");
		System.out.println("Input : "+str2);
		String[] arr = str2.split(" ");
		System.out.println("Total Special Characters : "+(arr.length-1));
	}
	
	public static void main(String[] args) {
		TotalSpecialCharacters specialCharacters = new TotalSpecialCharacters();
		
		String str1 = "Kr[i{s]hn}_a,Tech";
		specialCharacters.countTotalSpecialCharacter(str1);
	}
	}
	
