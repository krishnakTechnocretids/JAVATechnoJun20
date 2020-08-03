package vaishnaviVJun20_Collection;

/* Assignment-37 : 2nd Aug'2020

Input : Hi Globant techno Hi Hello Globant techno techno Globant techno
FR - 1 : freq of each word
FR - 2 : Maxmimum repeated word and its frequency

Output :  Hi -> 2
                Globant -> 3
		techno -> 4
		Hello -> 1
Maximum repeated word is techno having frequency 4. */

import java.util.LinkedHashMap;
import java.util.Set;

public class Frequency {

	void findfrequency(String str) {
		String[] array = str.split(" ");
		int max = 0;
		String maxWord = "";
		LinkedHashMap<String, Integer> lhsMap = new LinkedHashMap<String, Integer>();
		for (String str1 : array) {
			if (lhsMap.containsKey(str1)) {
				lhsMap.put(str1, (lhsMap.get(str1) + 1));
				if (lhsMap.get(str1) > max) {
					max = lhsMap.get(str1);
					maxWord = str1;
				}
			} else {
				lhsMap.put(str1, 1);
			}
		}
		Set<String> keys = lhsMap.keySet();
		for (String name : keys) {
			System.out.println(name + "-->" + lhsMap.get(name));
		}
		System.out.println("Maximum repeated word is " + maxWord + " having frequency " + max);
	}

	public static void main(String[] args) {
		String str = "Hi Globant techno Hi Hello Globant techno techno Globant techno";
		new Frequency().findfrequency(str);

	}

}
