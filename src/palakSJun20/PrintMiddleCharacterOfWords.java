/*Create a new method to print middle character of all words.
Input = "Harsh Maulik";
Output : r is middle character in Harsh
         u is middle character in Maulik */
package palakSJun20;

public class PrintMiddleCharacterOfWords {
	
	void findMiddleCharacterOfWord(String str2){
		String[] arr1 = str2.split(" ");
		int position = 0;
		for (int i = 0; i < arr1.length; i++) {
			if(arr1[i].length() % 2 == 0) {
				 position = arr1[i].length()/2 - 1;
			}
			else {
				position = arr1[i].length()/2;
			}
			System.out.println(arr1[i].charAt(position) +" is the middle character in "+arr1[i]);
		}
	}
	public static void main(String[] args) {
		
		PrintMiddleCharacterOfWords characterOfWords = new PrintMiddleCharacterOfWords();
		String string ="Harsh Maulik";
		characterOfWords.findMiddleCharacterOfWord(string);
	}

}
