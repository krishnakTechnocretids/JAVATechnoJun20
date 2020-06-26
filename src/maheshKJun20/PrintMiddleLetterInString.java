/*
Create a new method to print middle character of all words.

Input = "Harsh Maulik";
Output : r is middle character in Harsh
         u is middle character in Maulik 
 */

package maheshKJun20;

public class PrintMiddleLetterInString {

	void displayMiddleLetterInWord(String str) {
		//Method to display middle letter of each work in String
		String[] strArray = str.split(" ");
		System.out.println("Output is below:");
		for (int index=0;index<strArray.length;index++) {
			System.out.println( strArray[index].charAt(((strArray[index].length()-1)/2)) + " is middle character in " + strArray[index]);
		}
		
	}
	
	public static void main(String[] args) {
		PrintMiddleLetterInString printMiddleLetterInString = new PrintMiddleLetterInString();
		String str = "Harsh Maulik";
		printMiddleLetterInString.displayMiddleLetterInWord(str);
	}
}
