/*Assignment-37 : 2nd Aug'2020

 * Input : Hi Globant techno Hi Hello Globant techno techno Globant techno
FR - 1 : freq of each word
FR - 2 : Maxmimum repeated word and its frequency
Output :  Hi -> 2
          Globant -> 3
          techno -> 4
          Hello -> 1
Maximum repeated word is techno having frequency 4.
*/

package pranitaPJun20;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MaxFreqWordString_Collections {

	void findMaxRepeatedWordFrequency(String input) {
		String[] inputArray = input.split(" ");
		int count = 0;
		Map<String, Integer> wordMap = new LinkedHashMap<String, Integer>();
		for (String name : inputArray) {
			if (wordMap.containsKey(name)) {
				wordMap.put(name, wordMap.get(name) + 1);
			} else {
				wordMap.put(name, 1);
			}
		}
		Set<String> nameKey = wordMap.keySet();
		Iterator<String> itr = nameKey.iterator();
		String maxFreqword = "";
		while (itr.hasNext()) {
			String word = itr.next();
			System.out.println(word + "-> " + wordMap.get(word));
			if (count <= wordMap.get(word)) {
				maxFreqword = word;
				count = wordMap.get(word);
			}
		}
		System.out.println("\nMaximum repeated word is " + maxFreqword + " having frequency -> " + count);
	}


	public static void main(String[] args) {
		MaxFreqWordString_Collections maxFreqWordString_Collections = new MaxFreqWordString_Collections();
		String input = "Hi Globant techno Hi Hello Globant techno techno Globant techno";
		maxFreqWordString_Collections.findMaxRepeatedWordFrequency(input);
	}
}