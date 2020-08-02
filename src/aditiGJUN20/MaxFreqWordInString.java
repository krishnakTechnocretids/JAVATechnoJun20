/*
Input : Hi Globant techno Hi Hello Globant techno techno Globant techno
FR - 1 : freq of each word
FR - 2 : Maxmimum repeated word and its frequency

Output :  Hi -> 2
          Globant -> 3
          techno -> 4
          Hello -> 1
Maximum repeated word is techno having frequency 4.
*/

package aditiGJUN20;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MaxFreqWordInString {
	void findFreqOfEachWord(String inputStr) {
		if (inputStr == null)
			System.out.println("Can not find word frequency for NULL input String");
		else if (inputStr.isEmpty())
			System.out.println("Can not find word frequency for Empty input String");
		else {
			String[] input = inputStr.split(" ");
			int count = 0;
			Map<String, Integer> wordMap = new LinkedHashMap<String, Integer>();
			for (String name : input) {
				if (wordMap.containsKey(name)) {
					// count = wordMap.get(name);
					wordMap.put(name, wordMap.get(name) + 1);
				} else {
					wordMap.put(name, 1);
				}
			}
			Set<String> nameKey = wordMap.keySet();
			Iterator<String> itr = nameKey.iterator();
			String word = "";
			System.out.println("Frequency of each word");
			while (itr.hasNext()) {
				String currentWord = itr.next();
				System.out.println(currentWord + "-> " + wordMap.get(currentWord));
				if (count <= wordMap.get(currentWord)) {
					word = currentWord;
					count = wordMap.get(currentWord);
				}
			}
			System.out.println("Maximum repeated word is " + word + " having frequency -> " + count);
		}
	}

	// For this method - Used ternary operator to find frequency of each word and to create Linked HashMap
	// To retrieve maximum word count - New Interface Map.Entry and method entrySet() is used
	// Handles Null and empty string scenario using try-catch and runtime exception
	/*void findFreqOfEachWordUsingTryCatch(String inputStr) {
		try {
			if (inputStr.isEmpty())
				throw new RuntimeException();
			String[] input = inputStr.split(" ");
			// Integer count;
			Map<String, Integer> wordMap = new LinkedHashMap<String, Integer>();
			for (String w : input) {
				Integer count = wordMap.get(w);
				count = (count == null) ? 1 : ++count;
				wordMap.put(w, count);
			}
			System.out.println("\n" + wordMap);
			String key = "";
			int countValue = 0;
			for (Map.Entry<String, Integer> temp : wordMap.entrySet()) {
				if (temp.getValue() > countValue) {
					countValue = temp.getValue();
					key = temp.getKey();
				}
			}
			System.out.println("Maximum repeated word is " + key + " having frequency -> " + countValue);
		} catch (NullPointerException e) {
			System.out.println("Can not find word frequency for NULL input String");
		} catch (RuntimeException e) {
			System.out.println("Can not find word frequency for Empty input String");
		}
	}*/

	public static void main(String[] args) {
		MaxFreqWordInString maxFreqWordInString = new MaxFreqWordInString();
		String input1 = "Hi Globant techno Hi Hello Globant techno techno Globant techno";
		String input2 = null, input3 = "";
		System.out.println("\nInput: " + input1);
		maxFreqWordInString.findFreqOfEachWord(input1);
		System.out.println("\nInput: " + input2);
		maxFreqWordInString.findFreqOfEachWord(input2);
		System.out.println("\nInput: " + input3);
		maxFreqWordInString.findFreqOfEachWord(input3);
		/*
		System.out.println("\nOutput for Commented Method - \n-------------------------");
		System.out.println("\nInput: " + input1);
		maxFreqWordInString.findFreqOfEachWordUsingTryCatch(input1);
		System.out.println("\nInput: " + input2);
		maxFreqWordInString.findFreqOfEachWordUsingTryCatch(input2);
		System.out.println("\nInput: " + input3);
		maxFreqWordInString.findFreqOfEachWordUsingTryCatch(input2);
		*/
	}
}
