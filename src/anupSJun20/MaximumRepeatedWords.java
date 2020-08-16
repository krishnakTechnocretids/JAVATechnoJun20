package anupSJun20;
/*Input : Hi Globant techno Hi Hello Globant techno techno Globant techno
FR - 1 : freq of each word
FR - 2 : Maxmimum repeated word and its frequency

Output :  Hi -> 2
                Globant -> 3
		techno -> 4
		Hello -> 1
Maximum repeated word is techno having frequency 4.*/

import java.util.HashMap;

public class MaximumRepeatedWords {
	void findMaimumRepeatedWords(String input) {
		String[] array = input.split(" ");
		HashMap<String,Integer> listofWords = new HashMap<String,Integer>();
		int count = 0;
		String temp = null;
		for(String str : array) {
			if(listofWords.containsKey(str)) {
				listofWords.put(str, listofWords.get(str)+1);
				if(count < listofWords.get(str)) {
					temp = str;
					count = listofWords.get(str);
				}
			}
			else {
				listofWords.put(str, 1);
			}
		}
		System.out.println("The frequency of each word is : "  +listofWords);
		System.out.println("Maximum Repeated word is " + temp + " having frequency "+ count);
	}
	
	public static void main(String[] args) {
		MaximumRepeatedWords maximumRepeatedWords = new MaximumRepeatedWords();
		String input = "Hi Globant techno Hi Hello Globant techno techno Globant techno";
		maximumRepeatedWords.findMaimumRepeatedWords(input);
	}
}