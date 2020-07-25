package pranitaPJun20;

public class Coding_Exam_6 {
		void printStringPattern(String input) {
			for (int outerIndex = 0; outerIndex < input.length(); outerIndex++) {
				for (int innerIndex = outerIndex; innerIndex < input.length() ; innerIndex++) {
					System.out.print(input.charAt(innerIndex));
				}
				System.out.println("");
			}
		}
	
		void printStringPatternUsingSubstring(String input) {
			System.out.println("\nUsing substring method");
			for (int index = 0; index < input.length(); index++) {
				System.out.println(input.substring(0+index));
			}
		}
		
	public static void main(String[] args) {
		String input ="Globant";
		Coding_Exam_6 coding_Exam_6 = new Coding_Exam_6();
		coding_Exam_6.printStringPattern(input);
		coding_Exam_6.printStringPatternUsingSubstring(input);
	}
}
