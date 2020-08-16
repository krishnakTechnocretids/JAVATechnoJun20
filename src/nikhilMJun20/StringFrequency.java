/*
Assignment-37 : 2nd Aug'2020

Input : Hi Globant techno Hi Hello Globant techno techno Globant techno
FR - 1 : freq of each word
FR - 2 : Maxmimum repeated word and its frequency

Output : Hi -> 2
Globant -> 3
techno -> 4
Hello -> 1
Maximum repeated word is techno having frequency 4.
*/

package nikhilMJun20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class StringFrequency {
	void findFrequency(String input) {
		ArrayList<String> strList = new ArrayList<String> (Arrays.asList(input.split(" ")));
		LinkedHashMap<String, Integer> wordFreq = new LinkedHashMap<String, Integer> ();
		int maxFreq = 0;
		String maxFreqWord = "";
		for(String word : strList) {
			if(wordFreq.containsKey(word)) {
				wordFreq.put(word, wordFreq.get(word)+1);
				if(wordFreq.get(word) > maxFreq) {
					maxFreqWord = word;
					maxFreq = wordFreq.get(word);
				}
			}else {
				wordFreq.put(word, 1);
			}
		}
		System.out.println("Given string:-\n"+input+"\n\nWords and their frequencies in the given string are:-");
		for(String word : wordFreq.keySet()) {
			System.out.println(word+" --> "+wordFreq.get(word));
		}
		System.out.println("\nMaximum repeated word is "+maxFreqWord+" having frequency of "+maxFreq);
	}
	
	public static void main(String[] args) {
		String input = "Hi Globant techno Hi Hello Globant techno techno Globant techno";
		new StringFrequency().findFrequency(input);		
	}
}
