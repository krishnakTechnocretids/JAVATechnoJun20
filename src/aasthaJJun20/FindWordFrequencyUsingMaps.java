package aasthaJJun20;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*Assignment-37 : 2nd Aug'2020

Input : Hi Globant techno Hi Hello Globant techno techno Globant techno
FR - 1 : freq of each word
FR - 2 : Maxmimum repeated word and its frequency

Output :  Hi -> 2
         Globant -> 3
		techno -> 4
		Hello -> 1
Maximum repeated word is techno having frequency 4.*/

public class FindWordFrequencyUsingMaps {
	void displayWordFrequencyAndMaxRepeated(String inputString) {
		System.out.println("Input : " + inputString);
		String[] input = inputString.split(" ");
		HashMap<String, Integer> outputMap = new LinkedHashMap<String, Integer>();
		int max = 1;
		for (String currentWord : input) {
			if (outputMap.containsKey(currentWord)) {
				outputMap.put(currentWord, outputMap.get(currentWord) + 1);
				if (max < outputMap.get(currentWord)) {
					max = outputMap.get(currentWord);
				}
			} else
				outputMap.put(currentWord, 1);
		}
		System.out.println(outputMap);
		for (String currentWord : outputMap.keySet()) {
			if (max == outputMap.get(currentWord))
				System.out.println("Maximum repeated word is \"" + currentWord + "\" having frequency " + max);
		}
	}

	public static void main(String[] args) {
		new FindWordFrequencyUsingMaps().displayWordFrequencyAndMaxRepeated(
				"Hi Globant techno Hi Hello Globant techno techno Globant techno");
		System.out.println("************************************************************************************");
		new FindWordFrequencyUsingMaps().displayWordFrequencyAndMaxRepeated(
				"Hi Globant techno Hi Hello Globant techno techno Globant techno Globant");
	}
}
