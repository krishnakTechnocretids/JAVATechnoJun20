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

	public static void main(String[] args) {
		String input ="Globant";
		CodingExam5 codingExam5 = new CodingExam5();
		codingExam5.printStringPattern(input);
	}
}

