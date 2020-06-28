package yashCJun20;
public class FrqOfWord {

	void findFreq(String name) {
		name = name.toLowerCase().replace("_", "");
		System.out.println(name);
		String[] words = name.split(" ");
		System.out.println("Frequency of every word:");
		for(int j=0;j<words.length;j++) {
			int count =1;
			if(!words[j].equals("*")) {
				for(int k=j+1;k<words.length;k++) {
					if(words[j].equals(words[k])) {
						count++;
						words[k] = "*";
					}
				}
				System.out.println(words[j] + "->" + count);
			}
		}
	}
	
	
	public static void main(String[] args) {
		String input = "Tech_no Hi T_EchNo H_I Tech hi_";
		FrqOfWord frqOfWord = new FrqOfWord();
		frqOfWord.findFreq(input);
		
	}
}
