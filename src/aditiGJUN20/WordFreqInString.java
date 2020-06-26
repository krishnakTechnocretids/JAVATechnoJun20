
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

package aditiGJUN20;

public class WordFreqInString {
	
//	void getWordFreq(String str) {
//		str=str.toLowerCase().replace("_","");
//		System.out.println(str);
//		String[] inputArray=str.split(" ");
//
//		System.out.println("Frequency of every word: ");
//
//		for(int i=0;i<inputArray.length;i++) {
//			int count=1;
//			if(!inputArray[i].equals("*")) {
//				for(int j=i+1;j<inputArray.length;j++) {
//					if(inputArray[i].equals(inputArray[j])) {
//						count++;
//						inputArray[j]="*";
//					}
//				}
//				System.out.println(inputArray[i]+"-->"+count);
//			}
//		}
//	}
	
	void getWordFreq(String str) {
		str=str.toLowerCase().replace("_","");
		System.out.println("Frequency of every word: ");
		while(str.length()>0){
			String word=str.split(" ")[0];
			int org_size=str.length();
			str=str.replace(word,"");
			int newSize=str.length();
			System.out.println(word+"->"+(org_size-newSize)/word.length());
			str=str.trim();
		}
	}
	
	public static void main(String[] args) {
		WordFreqInString wordFreqInString= new WordFreqInString();
		
		String str="Tech_no Hi T_EchNo H_I Tech hi_";
		wordFreqInString.getWordFreq(str);
		
	}
}
