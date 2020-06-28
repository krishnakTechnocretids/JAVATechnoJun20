/*Create a new method to print middle character of all words.

Input = "Harsh Maulik";
Output : r is middle character in Harsh
              u is middle character in Maulik 
*/

package nikhilMJun20;

public class MiddleCharacter {
	void displayMiddleChar(String[] strArray) {
		int midCharIndex = 0;
		for(int index=0; index<strArray.length; index++) {
			if(strArray[index].length()%2 == 0)
				midCharIndex = (strArray[index].length())/2 - 1;
			else
				midCharIndex = (strArray[index].length())/2;
			System.out.println("Middle chracter of String "+strArray[index]+": "+strArray[index].charAt(midCharIndex));
		}
	}
	
	public static void main(String[] args) {
		MiddleCharacter middleCharacter = new MiddleCharacter();
		
		String str = "Harsh Maulik";
		
		String[] strArray = str.split(" ");
		middleCharacter.displayMiddleChar(strArray);
	}
}
