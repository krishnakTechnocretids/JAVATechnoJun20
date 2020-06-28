/* Find Frequency of every word in a given String.
Rules:
a) Word should be compare without case sensitivity.
b) Word should be compare without special character. [use replace method]

Input = "Tech_no Hi T_EchNo H_I Tech hi_"
output : 
Frequency of every word:
              techno -> 2
              hi -> 3
              tech -> 1*/

package palakSJun20;

public class FreqOfEveryWordInString {
	
	//Method to find Frequency of word in every word 
	void findfreqOfWord(String string){
		string = string.toLowerCase().replace("_", "");
		String[] words = string.split(" ");
		System.out.println("Frequency of every word: ");
			for (int index = 0; index < words.length; index++) {
				int count = 1;
				if(!(words[index] == "*")) {
					for (int j = index+1; j < words.length; j++) {
						if (words[index].equals(words[j])) {
							count++;
							words[j] = "*";
						}
					}
					System.out.println(words[index]+" -> " +count);
				}
			}
		}

	public static void main(String[] args) {
		FreqOfEveryWordInString freqOfEveryWordInString = new FreqOfEveryWordInString();
		String string ="Tech_no Hi T_EchNo H_I Tech hi_";
		System.out.println("Input : "+string);
		
		//Calling Method
		freqOfEveryWordInString.findfreqOfWord(string);
	}

}
