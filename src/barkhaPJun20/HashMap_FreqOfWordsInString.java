/*Input : Hi Globant techno Hi Hello Globant techno techno Globant techno
FR - 1 : freq of each word
FR - 2 : Maxmimum repeated word and its frequency

Output :  Hi -> 2
                Globant -> 3
		techno -> 4
		Hello -> 1
Maximum repeated word is techno having frequency 4.*/
package barkhaPJun20;

import java.util.HashMap;

public class HashMap_FreqOfWordsInString {
	
	void printFreqOfWords(String input) {
		String[] array = input.split(" ");
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		
		int freqCount=0;
		String maxFreqName="";
		
		for (String name : array) {
			if (hashMap.containsKey(name)) {
				hashMap.put(name, hashMap.get(name) + 1);
				
				if(freqCount < hashMap.get(name)) {
					maxFreqName = name;
					freqCount = hashMap.get(name);
				}
				
			} else
				hashMap.put(name, 1);
		}
		System.out.println("The frequency of each word is : "  +hashMap);
		System.out.println("=============================================================================================");
		System.out.println("Maximum Repeated word in ("+input +")is " +maxFreqName + " having frequency "+ freqCount);
	}	
	public static void main(String[] args) {
		new HashMap_FreqOfWordsInString().printFreqOfWords("Hi Globant techno Hi Hello Globant techno techno Globant techno");
		}
}		