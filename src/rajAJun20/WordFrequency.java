package rajAJun20;

public class WordFrequency {
		void displayWordFreq(String[] strArray) {
			int wordCnt = 0;
			for(int index=0; index<strArray.length; index++) {
				wordCnt=0;
				String word = strArray[index];
				if(!strArray[index].equals("")) {
					for(int i=0; i<strArray.length; i++) {
						if (word.equals(strArray[i])) {
							strArray[i] = "";
							wordCnt++;
						}
					}			
					System.out.println("Word: "+word+" Frequency: "+wordCnt);
				}
			}
		}

		public static void main(String[] args) {
			WordFrequency wordFrequency = new WordFrequency();

			String str = "Tech_no Hi T_EchNo H_I Tech hi_";
			str = str.replace("_", "");

			String[] strArray = str.split(" ");
			for(int j=0; j<strArray.length; j++) {
				strArray[j] = strArray[j].toLowerCase();
			}
			wordFrequency.displayWordFreq(strArray);
		}
}
