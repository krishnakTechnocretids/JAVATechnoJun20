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

import java.util.HashMap;

public class Frequency {

	void findfrequency(String str) {
		String[] array = str.split(" ");
		int max = 0;
		String maxWord = "";
		HashMap<String, Integer> hsMap = new HashMap<String, Integer>();
		for (String str1 : array) {
			if (hsMap.containsKey(str1)) {
				hsMap.put(str1, (hsMap.get(str1) + 1));
				if (hsMap.get(str1) > max) {
					max = hsMap.get(str1);
					maxWord = str1;
				}
			} else {
				hsMap.put(str1, 1);
			}
		}
		System.out.println("Frequency is: " + hsMap);
		System.out.println("Maximum repeated word is " + maxWord + " having frequency " + max);
	}

	public static void main(String[] args) {
		String str = "Hi Globant techno Hi Hello Globant techno techno Globant techno";
		new Frequency().findfrequency(str);

	}

}
