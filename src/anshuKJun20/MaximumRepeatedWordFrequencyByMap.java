/*Input : Hi Globant techno Hi Hello Globant techno techno Globant techno
FR - 1 : freq of each word
FR - 2 : Maxmimum repeated word and its frequency
Output :  Hi -> 2
                Globant -> 3
		techno -> 4
		Hello -> 1
Maximum repeated word is techno having frequency 4*/

package anshuKJun20;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class MaximumRepeatedWordFrequencyByMap {

	void findMaxRepeatedWordFrequency(String input) {
		String[] array = input.split(" ");
		int maxCount = 0;
		String maxFreqWord = "";
		LinkedHashMap<String, Integer> wordMap = new LinkedHashMap<String, Integer>();
		for (String word : array) {
			if (wordMap.containsKey(word)) {
				wordMap.put(word, wordMap.get(word) + 1);
				maxCount = wordMap.get(word) + 1;
				if (maxCount >= wordMap.get(word) + 1) {
					maxFreqWord = word;
				}
			} else {
				wordMap.put(word, 1);
			}
		}
		
		for( String str :wordMap.keySet()) {
			System.out.println(str+ " --> "+wordMap.get(str));
			
		}
		System.out.println(" Maximum frequency word is "+maxFreqWord);
	}

	public static void main(String[] args) {
		MaximumRepeatedWordFrequencyByMap maxReapeatedWordFreq = new MaximumRepeatedWordFrequencyByMap();
		String input = "Hi Globant techno Hi Hello Globant techno techno Globant techno";
		maxReapeatedWordFreq.findMaxRepeatedWordFrequency(input);
	}
}
