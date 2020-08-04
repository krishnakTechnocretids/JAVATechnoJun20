package abhishekSJun20;
/*Input : Hi Globant techno Hi Hello Globant techno techno Globant techno
FR - 1 : freq of each word
FR - 2 : Maxmimum repeated word and its frequency
Output :  Hi -> 2
                Globant -> 3
		techno -> 4
		Hello -> 1
Maximum repeated word is techno having frequency 4.*/

import java.util.HashMap;

public class FrequencyOfword {

	void printFreqOfWords(String input) {
		String[] array = input.split(" ");
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

		int freqCount = 0;
		String maxFreqName = "";

		for (String name : array) {
			if (hashMap.containsKey(name)) {
				hashMap.put(name, hashMap.get(name) + 1);

				if (freqCount < hashMap.get(name)) {
					maxFreqName = name;
					freqCount = hashMap.get(name);
				}

			} else
				hashMap.put(name, 1);
		}
		System.out.println("The frequency of each word in particular input:" + hashMap);
		System.out.println("Maximum Repeated word in " + maxFreqName + ":" + freqCount);
	}

	public static void main(String[] args) {
		String input = "Hi Globant techno Hi Hello Globant techno techno Globant techno";
		new FrequencyOfword().printFreqOfWords(input);
	}
}
