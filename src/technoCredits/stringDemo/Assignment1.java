package technoCredits.stringDemo;

public class Assignment1 {

	void findFreq(String input) {
		input = input.toLowerCase().replace("_", "");
		System.out.println(input);
		String[] words = input.split(" ");
		System.out.println("Frequency of every word:");
		for(int i=0;i<words.length;i++) {
			int count =1;
			if(!words[i].equals("*")) {
				for(int j=i+1;j<words.length;j++) {
					if(words[i].equals(words[j])) {
						count++;
						words[j] = "*";
					}
				}
				System.out.println(words[i] + "->" + count);
			}
		}
	}
	
	void extraMethod(String input) {
		input = input.toLowerCase().replace("_", "");
		System.out.println(input + ":" + input.length());
		while(input.length()>0) {
			String word = input.split(" ")[0];
			 int org_size = input.length();
			input = input.replace(word, "");
			int new_size = input.length();
			System.out.println(word + "->" + (org_size-new_size)/word.length());
			input = input.trim();
			
		}
	}
	
	public static void main(String[] args) {
		String input = "Tech_no Hi T_EchNo H_I Tech hi_";
		Assignment1 assignment1 = new Assignment1();
		//assignment1.findFreq(input);
		assignment1.extraMethod(input);
	}
}
