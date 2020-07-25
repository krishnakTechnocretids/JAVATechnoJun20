package abhishekSJun20;
/*String input = "Globant";
output : Globant
         Globan
		 Globa
		 Glob
		 Glo
		 Gl
		 G*/

public class CodingExam_05 {
	void printString(String input) {
		for (int outerIndex = 0; outerIndex < input.length(); outerIndex++) {
			for (int innerIndex = 0; innerIndex < input.length() - outerIndex; innerIndex++) {
				System.out.print(input.charAt(innerIndex));
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		String input = "Globant";
		new CodingExam_05().printString(input);
	}
}
