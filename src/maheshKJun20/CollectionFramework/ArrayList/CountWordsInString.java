package maheshKJun20.CollectionFramework.ArrayList;

import java.util.HashMap;

public class CountWordsInString {

	void wordCountInString(String str){
		String maxCountKey = ""; 
		int maxCountValue = 0;
		HashMap<String, Integer> map = new HashMap<>();
		for (String word: str.split(" ")) {
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
				if (maxCountValue<map.get(word)) {
					maxCountKey = word;
				}
			}else {
				map.put(word, 1);
			}
		}
		System.out.println(map);
		System.out.println("Maximum repeated word is " + maxCountKey + " having frequency " + map.get(maxCountKey));
	}
	
	public static void main(String[] args) {
		new CountWordsInString().wordCountInString("Hi Globant techno Hi Hello Globant techno techno Globant techno");
	}
}
