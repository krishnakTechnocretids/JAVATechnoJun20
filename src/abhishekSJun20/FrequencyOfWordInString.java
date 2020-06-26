package abhishekSJun20;

/*Program 1 :Find Frequency of every word in a given String.
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
public class FrequencyOfWordInString {

	void findFreqOfEveryWord(String s) {
		s = s.toLowerCase();
		String name = s.replace("_", "");
		String[] array = name.split(" ");
		System.out.println("Frequency of every word:");
		for (int index = 0; index < array.length; index++) {
			int count = 1;
			if (!array[index].equals("*")) {
				for (int i = index + 1; i < array.length; i++) {
					if (array[index].equals(array[i])) {
						count++;
						array[i] = "*";
					}
				}
				System.out.println(array[index] + " -> " + count);
			}
		}
	}

	public static void main(String[] args) {
		FrequencyOfWordInString frequencyOfWordInString = new FrequencyOfWordInString();
		String input = "Tech_no Hi T_EchNo H_I Tech hi_";
		frequencyOfWordInString.findFreqOfEveryWord(input);
	}

}
