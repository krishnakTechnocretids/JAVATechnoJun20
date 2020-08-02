/*Input : Hi Globant techno Hi Hello Globant techno techno Globant techno
FR - 1 : freq of each word
FR - 2 : Maxmimum repeated word and its frequency

Output :Hi -> 2
        Globant -> 3
		techno -> 4
		Hello -> 1
Maximum repeated word is techno having frequency 4.*/
package palakSJun20;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapFreqOfEachWord {

	void findFreqOfWord(String input) {
		String[] array = input.split(" ");
		System.out.println("Input String is : "+input);
		Map<String, Integer> arrayMap = new LinkedHashMap<String, Integer>();
		int count = 0;
		Integer temp;
		for (String string : array) {
			if (arrayMap.containsKey(string)) {
				temp = arrayMap.get(string);
				arrayMap.put(string, (temp) + 1);
			} else
				arrayMap.put(string, 1);
		}

		Set<String> keys = arrayMap.keySet();
		Iterator<String> itr = keys.iterator();
		String string = "";
		System.out.println("Output :");
		while (itr.hasNext()) {
			String key = itr.next();
			System.out.println(key + "-> " + arrayMap.get(key));
			if (count <= arrayMap.get(key)) {
				string = key;
				count = arrayMap.get(key);
			}
		}
		System.out.println("Maximum repeated word is " + string + " having frequency " + count);
	}

	public static void main(String[] args) {
		String input = "Hi Globant techno Hi Hello Globant techno techno Globant techno";
		new HashMapFreqOfEachWord().findFreqOfWord(input);
	}
}
