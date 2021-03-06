/*/*Assignment-37 : 2nd Aug'2020

Input : Hi Globant techno Hi Hello Globant techno techno Globant techno
FR - 1 : freq of each word
FR - 2 : Maxmimum repeated word and its frequency

Output :  Hi -> 2
                Globant -> 3
		techno -> 4
		Hello -> 1
Maximum repeated word is techno having frequency 4*/
package amitaRJun20;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MaxRepeatedWordFreqUsingMap {
	static void findAllStringFreq(String input) {
		System.out.println("Input String is : "+input);
		String[] array = input.split(" ");
		LinkedHashMap<String, Integer> wordMap = new LinkedHashMap<String, Integer>();
		String temp = "";
		int count = 0;
		for (String word : array) {
			if (wordMap.containsKey(word)) {
				wordMap.put(word, wordMap.get(word) + 1);
				if (wordMap.get(word) > count) {
					temp = word;
					count = wordMap.get(word);
				}
			} else {
				wordMap.put(word, 1);
			}
		}
		//System.out.println(wordMap);
		System.out.println("Output:- ");
		for(String inputWord : wordMap.keySet()){
			System.out.println(inputWord+ " --> "+wordMap.get(inputWord));
		}
		System.out.println("Maximum repeated word is " + temp + " having frequency " + count + " times ");
	}

	public static void main(String[] args) {
		String input = "Hi Globant techno Hi Hello Globant techno techno Globant techno";
		//String[] array = { "Hi", "Globant", "Techno", "Hi", "Hello", "Globant", "Techno", "Techno", "Globant", "Techno"};
		findAllStringFreq(input);
	}
}