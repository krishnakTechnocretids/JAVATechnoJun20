package swapnaWJun20;

public class WordFrequency {

	void findFrequency(String input)
	{
		System.out.println("Input : "+input);
		input = input.toLowerCase().replace("_", "");
		String[] inpArray = input.split(" ");

		System.out.println("Frequency of every word: ");

		for(int i=0;i<inpArray.length;i++) {
			int count = 1;

			if(!inpArray[i].equals("*")) {
				for(int j=i+1;j<inpArray.length;j++) {
					if(inpArray[i].equals(inpArray[j])) {
						count++;
						inpArray[j] = "*";
					}
				}
				System.out.println(inpArray[i] + "->" + count);
			}
		}
	}

	public static void main(String[] args) {

		String input = "Tech_no Hi T_EchNo H_I Tech hi_";
		WordFrequency wordFrequency =  new WordFrequency();
		wordFrequency.findFrequency(input);
	}
}
