/*Assignment-37 : 2nd Aug'2020
Input : Hi Globant techno Hi Hello Globant techno techno Globant techno
FR - 1 : freq of each word
FR - 2 : Maxmimum repeated word and its frequency

Output :  Hi -> 2
                Globant -> 3
		techno -> 4
		Hello -> 1
Maximum repeated word is techno having frequency 4.*/
package madhuraMJun20.assignment30Plus;

import java.util.HashMap;

public class FreqOfWords {
	void findFrequencyOfEachWord(String input) {
		int freq = 0;
		String maxRepeatWord = "";
		String[] inputArr = input.split(" ");
		HashMap<String, Integer> freqMap = new HashMap<String, Integer>();

		for (String word : inputArr) {
			if (freqMap.containsKey(word)) {
				freqMap.put(word, freqMap.get(word) + 1);
				if (freqMap.get(word) > freq) {
					freq = freqMap.get(word);
					maxRepeatWord = word;
				}
			} else
				freqMap.put(word, 1);
		}
		System.out.println(freqMap);
		System.out.println("Maximum repeated word is " + maxRepeatWord + " having frequency " + freq);
	}

	public static void main(String[] args) {
		FreqOfWords freqOfWords = new FreqOfWords();
		String input = "Hi Globant techno Hi Hello Globant techno techno Globant techno";
		freqOfWords.findFrequencyOfEachWord(input);
	}
}