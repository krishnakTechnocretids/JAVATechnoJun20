package vireshJJun20.assignment37;

import java.util.*;

public class GetWordFrequency {

	// This method will convert the string into HashMap. 
	//then iterate each map element to get the maximum repeated word.
	static void wordFrequency(String str) {
		System.out.println("Input String is : " + str);
		int max = 0, cnt = 0;
		String maxWord = "";
		String[] arr = str.split(" ");
		List<String> lst = new ArrayList<String>(Arrays.asList(arr));
		Map<String, Integer> mp = new HashMap<String, Integer>();

		for (String currentWord : lst) {
			if (mp.containsKey(currentWord)) {
				mp.put(currentWord, mp.get(currentWord) + 1);
			} else {
				mp.put(currentWord, 1);
			}
		}
		System.out.println("Resultant Map: " + mp);
		Set<String> set = mp.keySet();
		for (String word : set) {
			cnt++;
			if (mp.get(word) > max) {
				max = mp.get(word);
				maxWord = word;
			} else if (mp.get(word) == max && cnt == set.size())
				max = -1;
		}
		if (!(max == -1))
			System.out.println("The word: " + maxWord + " is repeated for maximum: " + max + " times.");
		else
			System.out.println("Multiple words with the same frequency.");
	}

	public static void main(String[] args) {
		String str = "Hi Globant Hello Globant Techno Techno Globant Globant Techno";
		wordFrequency(str);
		System.out.println("");
		str = "Hi Hi Hello Hello Globant Globant Hello Globant Hi";
		wordFrequency(str);
	}
}
