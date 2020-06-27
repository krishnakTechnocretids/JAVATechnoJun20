package ajitSJune20;

public class FindFreqOfEveryWord {
	
	void findFreq(String input) {
		input=input.toLowerCase().replace("_", "");
		//System.out.println(input);
		String[] words=input.split(" ");
		System.out.println("Frequency of every word:");
		for(int outerIndex=0;outerIndex<words.length;outerIndex++) {
			int count=1;
			if(!words[outerIndex].equals("*")) {
				for(int innerIndex=outerIndex+1;innerIndex<words.length;innerIndex++) {
					if(words[outerIndex].equals (words[innerIndex])) {
						count++;
						words[innerIndex]="*";
					}
				}
				System.out.println(words[outerIndex]+" -> " +count);
			}
		}
		
	}

	public static void main(String[] args) {
		FindFreqOfEveryWord findFreqOfEveryWord=new FindFreqOfEveryWord();
		
		String input="Tech_no Hi T_EchNo H_I Tech hi_";
		findFreqOfEveryWord.findFreq(input);

	}

}
