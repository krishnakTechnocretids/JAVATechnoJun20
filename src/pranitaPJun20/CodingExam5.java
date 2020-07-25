package pranitaPJun20;

public class CodingExam5 {
	void printStringPattern(String input) {
		for (int outerIndex = 0; outerIndex < input.length(); outerIndex++) {
			for (int innerIndex = 0; innerIndex < input.length() - outerIndex; innerIndex++) {
				System.out.print(input.charAt(innerIndex));
			}
			System.out.println("");
		}
	}

	void printStringPatternUsingSubstring(String input) {
		for (int index = 0; index < input.length(); index++) {
			System.out.println(input.substring(0, input.length() - index));
		}
	}
	
	public static void main(String[] args) {
		String input ="Globant";
		CodingExam5 codingExam5 = new CodingExam5();
		codingExam5.printStringPattern(input);
		codingExam5.printStringPatternUsingSubstring(input);
	}
}

