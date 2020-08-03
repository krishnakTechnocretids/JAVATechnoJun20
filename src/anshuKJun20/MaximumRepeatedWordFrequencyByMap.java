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
		System.out.println(wordMap + "'\n' and maximum frequency word is " + maxFreqWord);

	}

	public static void main(String[] args) {
		MaximumRepeatedWordFrequencyByMap maxReapeatedWordFreq = new MaximumRepeatedWordFrequencyByMap();
		String input = "Hi Globant techno Hi Hello Globant techno techno Globant techno";
		maxReapeatedWordFreq.findMaxRepeatedWordFrequency(input);
	}
}
