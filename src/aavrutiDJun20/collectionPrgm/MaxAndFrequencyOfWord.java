package aavrutiDJun20.collectionPrgm;

import java.util.*;

public class MaxAndFrequencyOfWord {
	
	int maxValue;
	Map<String,Integer> inputMap = new LinkedHashMap<String,Integer>();

	void findCountOfWord(String[] arrInput) {		
		
		for(String input : arrInput) {
			if(inputMap.containsKey(input)) {
				inputMap.put(input, inputMap.get(input) + 1);
			}
			else {
				inputMap.put(input, 1);
			}
			if(inputMap.get(input) > maxValue) {
				maxValue = inputMap.get(input);
			}
		}
		System.out.println(inputMap);
	}
	
	void findMaxRepeatedWord() {
		System.out.print("Max repeated word is ");
		
		for(String name : inputMap.keySet()) {
			if(inputMap.get(name) == maxValue) {
				System.out.print(name + ", ");
			}
		}
		System.out.print("with frequency " + maxValue);
	}
	
	public static void main(String[] args) {
		MaxAndFrequencyOfWord maxAndFrequencyOfWord = new MaxAndFrequencyOfWord();
		
		String input = "Hi Globant techno Hi Hello Globant techno Globant techno Globant techno";
		String[] arrInput = input.split(" ");
		
		maxAndFrequencyOfWord.findCountOfWord(arrInput);
		maxAndFrequencyOfWord.findMaxRepeatedWord();
	}
}