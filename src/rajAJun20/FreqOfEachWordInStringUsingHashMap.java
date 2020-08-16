package rajAJun20;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class FreqOfEachWordInStringUsingHashMap {
	
	static void findFreqOfEachWordInString(String[] input) {
		System.out.println("Given String is : " +Arrays.toString(input));
		
		LinkedHashMap<String, Integer> inputWordsMap = new LinkedHashMap<String, Integer>();
		String temp = "";
		int maxValue = 0;
		for (String word : input) {
			if (inputWordsMap.containsKey(word)) {
				inputWordsMap.put(word, inputWordsMap.get(word) + 1);
				if (inputWordsMap.get(word) > maxValue) {
					temp = word;
					maxValue = inputWordsMap.get(word);
				}
			} else {
				inputWordsMap.put(word, 1);
			}
		}
		for(String inputWord : inputWordsMap.keySet()){
			System.out.println(inputWord+ " --> "+inputWordsMap.get(inputWord));
		}
		System.out.println("Maximum repeated word is " + temp + " having frequency " + maxValue + " times ");
	}
	public static void main(String[] args) {
		String[] array = { "Hi", "Globant", "Techno", "Hi", "Hello", "Globant", "Techno", "Techno", "Globant", "Techno"};
		findFreqOfEachWordInString(array);
	}
}
