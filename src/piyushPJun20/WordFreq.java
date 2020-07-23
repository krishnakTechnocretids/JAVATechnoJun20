
public class WordFreq {

	void findFreq(String input) {
		input=input.toLowerCase().replace("_", "");
		String[] word = input.split(" ");
		System.out.println(" Frequency of Every Word is:");
		for(int index=0; index<word.length; index++) {
			int count=1;
			if(!word[index].equals("*")) {
				for(int index1=index+1;index1<word.length;index1++) {
					if(word[index].equals (word[index1])) {
						count++;
						word[index1]="*";
					}
				}
				System.out.println(word[index]+" -> " +count);
			}
		}

	}

	public static void main(String[] args) {
		WordFreq wordFreq = new WordFreq();

		String input="Tech_no Hi T_EchNo H_I Tech hi_";
		wordFreq.findFreq(input);

	}

}