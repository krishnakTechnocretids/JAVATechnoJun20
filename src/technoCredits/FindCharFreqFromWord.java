package technoCredits;

public class FindCharFreqFromWord {
	
	void findFreq(String word, char ch) {
		int orgLength = word.length();
		word = word.replace(String.valueOf(ch), "");
		int newLength = word.length();
		System.out.println("Freq of char " + ch + " is "+ (orgLength-newLength));
	}
	
	void findFreq1(String word, char ch) {
		int cnt = word.contains(String.valueOf(ch)) ? 1 : 0;
		while(word.indexOf(ch) != word.lastIndexOf(ch)) {
			word = word.substring(word.indexOf(ch)+1);
			cnt++;
		}
		System.out.println(cnt);
	}
	
	public static void main(String[] args) {
		new FindCharFreqFromWord().findFreq1("technocrecdcictcsc", 'c');
	}
}
