/*
/*Assignment-37 : 2nd Aug'2020

Input : Hi Globant techno Hi Hello Globant techno techno Globant techno
FR - 1 : freq of each word
FR - 2 : Maxmimum repeated word and its frequency

Output : Hi -> 2
Globant -> 3
techno -> 4
Hello -> 1
Maximum repeated word is techno having frequency 4.*/

package swapnaWJun20;

import java.util.HashMap;

public class StringFreqCount {

	int maxCount;

	void findallCharFrequency(String input) {
		String[] arr = input.split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (String str : arr) {
			if (map.containsKey(str)) {
				map.put(str, map.get(str) + 1);
			} else {
				map.put(str, 1);
			}

			if (map.get(str) > maxCount) {
				maxCount = map.get(str);
			}
		}
		System.out.println(map);

		for (String name : map.keySet()) {
			if (map.get(name) == maxCount) {
				System.out.print("\nMaximum repeated word is " + name);
			}
		}
		System.out.print(" having frequency " + maxCount);
	}

	public static void main(String[] args) {
		new StringFreqCount().findallCharFrequency("Hi Globant techno Hi Hello Globant techno techno Globant techno");
	}
}