package technoCredits.mapDemo;

import java.util.Map;
import java.util.TreeMap;

public class CharFreq {

	/*for(int index=0;index<input.length();index++) {
	char ch = input.charAt(index);
}*/
	static void findAllCharFreq(String input) {
		char[] arr = input.toCharArray();
		Map<Character,Integer> hm = new TreeMap<Character,Integer>();
		System.out.println(input);
		for(char ch : arr) {
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}else {
				hm.put(ch, 1);
			}
		}
		System.out.println(hm);
	}
	
	public static void main(String[] args) {
		findAllCharFreq("technocrcccceditttttts");
	}
	
}
