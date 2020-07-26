package abhishekSJun20;

public class Coding_Exam_6 {
	void printString2(String input) {
		for (int outerIndex = 0; outerIndex < input.length(); outerIndex++) {
			for (int innerIndex = outerIndex; innerIndex < input.length(); innerIndex++) {
				if (innerIndex == outerIndex)
					System.out.print(Character.toUpperCase(input.charAt(innerIndex)));
				else
					System.out.print(input.charAt(innerIndex));
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		String input = "Globant";
		new Coding_Exam_6().printString2(input);
	}
}
