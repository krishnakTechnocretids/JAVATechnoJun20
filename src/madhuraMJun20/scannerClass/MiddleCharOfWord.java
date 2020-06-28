package madhuraMJun20.scannerClass;
/*Create a new method to print middle character of all words.

Input = "Harsh Maulik";
Output : r is middle character in Harsh
              u is middle character in Maulik 
*/
public class MiddleCharOfWord {
	void midChar(String input) {
		String[] words = input.split(" ");
		int length = 0;
		for(int index=0;index<words.length;index++) {
			if(words[index].length()%2 != 0)
				length = words[index].length()/2;
			else
				length = (words[index].length()/2)-1;
			System.out.println( words[index].charAt(length)+ " is Middle character in " + words[index] );
		}
	}
	public static void main(String[] args) {
		MiddleCharOfWord middleCharOfWord = new MiddleCharOfWord();
		String input = "Harsh Maulik";
		middleCharOfWord.midChar(input);
	}
}
