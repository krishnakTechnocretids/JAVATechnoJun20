/*
Assignement 30 : 18th July 2020
 
Replace second last globant with Technocredits. 
input-> Hi Globant Hello Globant Hi Globant GM Globant Hi Globant

output->  Hi Globant Hello Globant Hi Globant GM Technocredits Hi Globant
*/

package maheshKJun20.StringExamples;

public class SecondLastWordInString {
	
	void replaceSecondLastWord(String str, String wordToReplace, String newWord, int occurenceNum) {
		System.out.println("\nInput: " + str);
		String[] tempArray = str.split(" ");
		int count = 1;
		if (occurenceNum>0){
			for (int index=tempArray.length-1; index>=0;index--) {
				if (tempArray[index].equals(wordToReplace) ){
					if (count == occurenceNum) {
						tempArray[index] = newWord;
						System.out.println("Output: " + String.join(" ", tempArray));
						break;
					}
					count++;
				}
				if (index==0)
					System.out.println("Warning: We dont have " + occurenceNum + " occurence of " + wordToReplace);
			}
		}else {
			System.out.println("Error: Please provide valid Occurence of word '" + wordToReplace + "' to replace(Greater than 0)");
		}
	}
	
	public static void main(String[] args) {
		SecondLastWordInString secondLastWordInString = new SecondLastWordInString();
		secondLastWordInString.replaceSecondLastWord("Hi Globant Hello Globant Hi Globant GM Globant Hi Globant", "Globant", "Technocredits", 2);
		secondLastWordInString.replaceSecondLastWord("Hi Globant", "Globant", "Technocredits", 2);
		secondLastWordInString.replaceSecondLastWord("Hi Globant Hello Globant Hi Globant GM Globant Hi Globant", "Globant", "Technocredits", 0);
	}

}
