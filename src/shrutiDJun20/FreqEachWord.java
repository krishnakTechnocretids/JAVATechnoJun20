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

package shrutiDJun20;

public class FreqEachWord {
	
	void findFreqOfEachWord(String input){
	input = input.replace("_", "").toLowerCase(); // will replace _ from each words
		String[] arr = input.split(" "); //will create array of given string
		System.out.println(input); //techno hi techno hi tech hi
		
		for(int outerIndex=0;outerIndex<arr.length;outerIndex++){
			int count = 1;
			if(!arr[outerIndex].equals("*")){
			for(int innerindex=(outerIndex+1);innerindex<arr.length;innerindex++){
				if(arr[outerIndex].equals(arr[innerindex])){
					count++;
					arr[innerindex]= "*" ;
					}
				}
			System.out.println(arr[outerIndex]+ "-->"+ count);
			}	
			
		}
	}	
	public static void main(String[] args) {
		FreqEachWord freqEachWord =new FreqEachWord();
		freqEachWord.findFreqOfEachWord("Tech_no Hi T_EchNo H_I Tech hi_");
		
	}
}




