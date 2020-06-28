//Count frequency of words in given string

package aavrutiDJun20;

public class CountWords {
	
	void countWordsInString(String[] arrayInput) {
		System.out.println("Frequency of every word:");
		for(int index=0;index<arrayInput.length;index++) {
			int wordsCnt = 1;
			if(!arrayInput[index].equals("*")) {
				for(int index2=index+1;index2<arrayInput.length;index2++) {
					if(arrayInput[index].equals(arrayInput[index2])) {
						wordsCnt++;	
						arrayInput[index2] = "*";
					}					
				}			
				System.out.println(arrayInput[index] + " --> " + wordsCnt);
			}
		}
	}

	public static void main(String[] args) {
		CountWords CountWords = new CountWords();
		
		String input = "Tech_no Hi T_EchNo H_I Tech hi_";
		input = input.toLowerCase().replace("_" , "");
		System.out.println(input);
		
		String[] arrayInput = input.split(" ");
		
		CountWords.countWordsInString(arrayInput);
		
	}
}
