/*Count total special characters like _ , [ { ] } from every word, do not use any loop.
Hint : Use replace method [Think about it, how it can help].

Input :  Kr[i{s]hn}_a,Tech
Output : total special characters are 6 
*/

package nikhilMJun20;

public class SpecialCharCount {
	void displaySpCharCount(String str) {
		/*String str1 = str;
		
		str1 = str1.replace('[', ' ');
		str1 = str1.replace('{', ' ');
		str1 = str1.replace(']', ' ');
		str1 = str1.replace('}', ' ');
		str1 = str1.replace('_', ' ');
		str1 = str1.replace(',', ' ');
		
		String[] strArray = str1.split(" ");
		System.out.println("\nNo. of Special Characters: "+(strArray.length - 1));*/
		
		System.out.println("Input String: "+str+"\nNo. of Special Characters in the String = "+(str.length() - str.replace("[", "").replace("{", "").replace("]", "").replace("}", "").replace("_", "").replace(",", "").length()));
	}
	
	public static void main(String[] args) {
		SpecialCharCount specialCharCount = new SpecialCharCount();
		
		String str = "Kr[i{s]hn}_a,Tech";
		specialCharCount.displaySpCharCount(str);
	}
}
