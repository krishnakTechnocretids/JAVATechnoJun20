/*
Find Frequency of every word in a given String.
Rules:
a) Word should be compare without case sensitivity.
b) Word should be compare without special character. [use replace method]

Input = "Tech_no Hi T_EchNo H_I Tech hi_"
output : 
Frequency of every word:
              techno -> 2
              hi -> 3
              tech -> 1
*/

package maheshKJun20;

public class WordFrequencyInString {
	
	void displayWordFrequency(String str) {
		//This Method was created before the explanation in the call. Keeping it just to get reviewed how efficient this logic is
		//Method to Count Frequency of all words in String
		String[] strArray = str.split(" ");
		for (int index=0; index<strArray.length;index++) {
			int countOfWord = 0;
			for (int innerIndex=0;innerIndex<strArray.length;innerIndex++) {
				if (strArray[index].equals(strArray[innerIndex])) {
					if (index > innerIndex) {
						break;
					}
					countOfWord++;
				}
			}
			if (countOfWord > 0) {
				System.out.println("Frequency of '" + strArray[index] + "' is: " + countOfWord);
			}
		}
	}
	
	void displayWordFrequencyNew(String str) {
		//This Method is created as per the explanation given by Maulik
		//Method to Count Frequency of all words in String
		String[] strArray = str.split(" ");
		for (int index=0; index<strArray.length;index++) {
			int countOfWord = 1;
			if (!strArray[index].equals("*")) {
				for (int innerIndex=(index+1);innerIndex<strArray.length;innerIndex++) {
					if (strArray[index].equals(strArray[innerIndex])) {
						countOfWord++;
						strArray[innerIndex] = "*";
					}
				}
				System.out.println("Frequency of '" + strArray[index] + "' is: " + countOfWord);
			}
			
		}
	}
	
	public static void main(String[] args) {
		WordFrequencyInString wordFrequencyInString = new WordFrequencyInString();
		String str = "Tech_no Hi T_EchNo H_I Tech hi_";
		wordFrequencyInString.displayWordFrequencyNew(str.toLowerCase().replace("_", ""));
	}

}
