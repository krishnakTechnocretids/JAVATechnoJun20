/*
 * Assignment 18 : 26th Jun 2020

Program 1 :
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
package pranitaPJun20;

public class FreqOfEveryWordInString18 {
	void findFreqOfWord(String input) {
		String[] words = input.split(" ");
		System.out.println("Frequency of every word:");
			for(int i =0;i<words.length;i++) {
				int count=1;
				if(!words[i].equals("*")) {
				for(int j=i+1;j<words.length;j++) {
					if(words[i].equals(words[j])) {
						count++;
						words[j] = "*";
					}
				}
				System.out.println(words[i]+ "-->" + count);
			
		}
			}
		
	}
	
	void extraMethod(String input) {
		System.out.println(input+ ":" + input.length());
		while(input.length()>0) {
			String word = input.split(" ")[0];
			int org_size = input.length();
			input=input.replace(word, "");
			int new_size= input.length();
			System.out.println(word + "-->" + (org_size-new_size)/word.length());
			input = input.trim();
		}
	}
	
	
	public static void main(String[] args) {
		String input = "Tech_no Hi T_EchNo H_I Tech hi_";
		input=input.toLowerCase().replace("_", "");
		System.out.println(input);
		FreqOfEveryWordInString18 freqOfEveryWordInString18 = new FreqOfEveryWordInString18();
		freqOfEveryWordInString18.findFreqOfWord(input);
		//freqOfEveryWordInString18.extraMethod(input);
	}
}