package anupSJun20;
/*Program 1 :
Find Frequency of every word in a given String.
Rules:
a) Word should be compare without case sensitivity.
b) Word should be compare without special character. [use replace method]

Input = "Tech_no Hi T_EchNo H_I Tech hi_"
output : 
Frequency of every word:
              techno -> 2
              hi -> 3
              tech -> 1*/

public class FrequencyOfWord {
	static void findFrequencyOfWord(String str) {
		String newStr = str.replace("_", "");
		String[] newWord = newStr.toUpperCase().split(" ");
		for(int index = 0;index<newWord.length;index++) {
			int count = 1;
			if(!newWord[index].equals("*")) {
			for(int innerloop = index+1;innerloop<newWord.length;innerloop++) {
			if(newWord[index].equals(newWord[innerloop])) {
				count++;
			    newWord[innerloop] = "*";
			}
			}
			System.out.println("Frequency of every word : " + newWord[index] + " --> " + count);
			}	
		}
		
	}
	public static void main(String[] args) {
		findFrequencyOfWord("Tech_no Hi T_EchNo H_I Tech hi_");
	}

}
