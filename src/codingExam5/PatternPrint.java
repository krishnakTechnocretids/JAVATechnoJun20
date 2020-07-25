package codingExam5;

public class PatternPrint {

	void printPattern(String str) {
		for (int outerIndex = 0; outerIndex < str.length(); outerIndex++) {
			for (int innerIndex = 0; innerIndex < str.length() - outerIndex; innerIndex++) {
				System.out.print(str.charAt(innerIndex));
			}
			System.out.println("");
		}
	}

	void printPattern1(String str) {
		for (int outerIndex = 0; outerIndex < str.length(); outerIndex++) {
			for (int innerIndex = outerIndex; innerIndex < str.length(); innerIndex++) {
				System.out.print(str.charAt(innerIndex));
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		//new PatternPrint().printPattern("Globant");
		new PatternPrint().printPattern1("Globant");
	}
}
