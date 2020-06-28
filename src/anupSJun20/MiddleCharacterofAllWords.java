package anupSJun20;
/*Program 2 : 
Create a new method to print middle character of all words.

Input = "Harsh Maulik";
Output : r is middle character in Harsh
              u is middle character in Maulik */

public class MiddleCharacterofAllWords {

	static void findMiddleCharacter(String str) {
		String[] newStr = str.split(" ");
		for(int index = 0;index<newStr.length;index++) {
			String allWords = (newStr[index]);
			int charLength;
			if(allWords.length()%2 ==0)
				charLength = (allWords.length()/2) - 1;
			else
				charLength = (allWords.length()/2);
			char ch = allWords.charAt(charLength);
			System.out.println(ch + " is middle character in " + allWords);
		}
	}
	public static void main(String[] args) {
		findMiddleCharacter("Harsh Maulik");
	}
}
