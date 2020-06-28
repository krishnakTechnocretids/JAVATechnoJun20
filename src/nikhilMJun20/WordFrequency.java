/*Find Frequency of every word in a given String.
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

package nikhilMJun20;

public class WordFrequency {
	void displayWordFreq(String str) {
		str = str.toLowerCase().replace("_", "");
		String[] strArray = str.split(" ");
		int wordCnt = 0;
		
		System.out.println("Input String: "+str+"\n\nFrequency of Every Word:-");
		for(int index=0; index<strArray.length; index++) {
			wordCnt=1;
			if(!strArray[index].equals("*")) {
				for(int innerIndex=index+1; innerIndex<strArray.length; innerIndex++) {
					if (strArray[index].equals(strArray[innerIndex])) {
						strArray[innerIndex] = "*";
						wordCnt++;
					}
				}			
				System.out.println(strArray[index]+" --> "+wordCnt);
			}
		}
	}
	
	public static void main(String[] args) {
		WordFrequency wordFrequency = new WordFrequency();
		String str = "Tech_no Hi T_EchNo H_I Tech hi_";
		
		wordFrequency.displayWordFreq(str);
	}
}
