/*Find Frequency of every word in a given String.
Rules:
a) Word should be compare without case sensitivity.
b) Word should be compare without special character. [use replace method]

Input = "Tech_no Hi T_EchNo H_I Tech hi_"
output : 
Frequency of every word:
              techno -> 2
              hi -> 3
              tech -> 1*/

package rachanaGJun20.String;

public class StringFreqOfWord {

	void findFreqOfWord(String str) {

		int count = 1;
		str = str.replaceAll("_", "").toLowerCase();
		String[] newStr = str.split(" ");
		System.out.println(str);
		System.out.println("Frequency of every word");
		for (int i = 0; i < newStr.length; i++) {
			if (!newStr[i].equals("*")) {
				for (int j = i + 1; j < newStr.length; j++) {

					if (newStr[i].equals(newStr[j])) {
						count++;
						newStr[j] = "*";
					}
				}
				System.out.println(newStr[i] + "-> " + count);
			}

		}
	}

	public static void main(String[] args) {
		StringFreqOfWord stringfreqOfword = new StringFreqOfWord();
		String str = "Tech_no Hi T_EchNo H_I Tech hi_";
		stringfreqOfword.findFreqOfWord(str);
	}

}
