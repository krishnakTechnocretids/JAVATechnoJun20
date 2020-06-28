package harshadBJun20;
/*Assignment 18 : 26th Jun 2020

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
              tech -> 1*/

public class FrequencyOfWordInString {
	
	void frequencyOfWord(String str) {
		
		str = str.toLowerCase().replace("_","");
		System.out.println(str);
		System.out.println("Frequency of every word: ");
		while(str.length()>0) {
			String str1 = str.split(" ")[0];
			int strLen = str.length();
			str = str.replace(str1, "");
			int str1Len = str.length();
			System.out.println(str1+" -> " +((strLen - str1Len)/str1.length()));
			str = str.trim();
		}
	}
	
	public static void main(String[] args) {
		FrequencyOfWordInString frequencyOfWordInString = new FrequencyOfWordInString();
		String str = "Tech_no Hi T_EchNo H_I Tech hi_";
		frequencyOfWordInString.frequencyOfWord(str);
	}
}
