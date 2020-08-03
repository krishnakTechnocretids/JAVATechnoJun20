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
	static void findAllStringFreq(String[] input) {
		System.out.println("Input String is : "+Arrays.toString(input));
		LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
		String temp = "";
		int count = 0;
		for (String str : input) {
			if (hm.containsKey(str)) {
				hm.put(str, hm.get(str) + 1);
				if (hm.get(str) > count) {
					temp = str;
					count = hm.get(str);
				}
			} else {
				hm.put(str, 1);
			}
		}
		//System.out.println(hm);
		System.out.println("Output:- ");
		for(String str : hm.keySet()){
			System.out.println(str+ " --> "+hm.get(str));
		}
		System.out.println("Maximum repeated word is " + temp + " having frequency " + count + " timmes ");
	}

	public static void main(String[] args) {
		String[] array = { "Hi", "Globant", "Techno", "Hi", "Hello", "Globant", "Techno", "Techno", "Globant", "Techno"};
		findAllStringFreq(array);
	}
}