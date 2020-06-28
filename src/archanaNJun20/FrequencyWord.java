package archanaNJun20;

public class FrequencyWord {
	void countFrequencyWord(String input){
		input = input.toLowerCase().replace("_", "");
		System.out.println("Frequency of every word");
		while(input.length()>0) {
			String word = input.split(" ")[0];
			int oldsize = input.length();
			input = input.replace(word, "");
			int newsize = input.length();
			System.out.println(word + "-" + (oldsize-newsize)/word.length());
			input = input.trim();
		}
	}
	public static void main(String[] args) {
		FrequencyWord frequencyWord=new FrequencyWord();
		String input = "Tech_no Hi T_EchNo H_I Tech hi_";
		frequencyWord.countFrequencyWord(input);
	}
}
