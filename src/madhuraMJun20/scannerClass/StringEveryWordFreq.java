package madhuraMJun20.scannerClass;
/*Find Frequency of every word in a given String.
Rules:
a) Word should be compare without case sensitivity.
b) Word should be compare without special character. [use replace method]

Input = "Tech_no Hi T_EchNo H_I Tech hi_"
output : 
Frequency of every word:
              techno -> 2
              hi -> 3
              tech -> 1
*/
public class StringEveryWordFreq {
	private void findFreq(String input) {
		input = input.toLowerCase().replace("_", "");
		//System.out.println(input);
		System.out.println("Frequency of every word : ");
		String[] words= input.split(" ");
		for (int i=0; i<words.length;i++ ) {
			int count=1;
			if(!words[i].equals("*")) {
				for(int j=(i+1); j<words.length; j++) {
					if(words[i].equals(words[j])) {
						count++;
						words[j]="*";
					}
				}
				System.out.println(words[i]+ " -> " +count);
			}
		}
	}
	public static void main(String[] args) {
		StringEveryWordFreq stringEveryWordFreq = new StringEveryWordFreq();
		String input = "Tech_no Hi T_EchNo H_I Tech hi_";
		stringEveryWordFreq.findFreq(input);
	}

	

}
