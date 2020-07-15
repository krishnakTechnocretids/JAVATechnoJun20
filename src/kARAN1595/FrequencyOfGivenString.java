package kARAN1595;

public class FrequencyOfGivenString {
	void frequencyOfEveryWord(String word) {
		word = word.toLowerCase();
		String name = word.replace("_", "");
		String[] array = name.split(" ");
		for (int index = 0; index < array.length; index++) {
			int count = 1;
			if (!array[index].equals("*")) {
				for (int j = index + 1; j < array.length; j++) {
					if (array[index].equals(array[j])) {
						count++;
						array[j] = "*";
					}
				}
				System.out.println("Frequency of word :"+array[index] + " -> " + count);
			}
		}
	}

	public static void main(String[] args) {
		FrequencyOfGivenString frequencyOfGivenString = new FrequencyOfGivenString();
		String input = "Tech_no Hi T_EchNo H_I Tech hi_";
		frequencyOfGivenString.frequencyOfEveryWord(input);
	}

}

