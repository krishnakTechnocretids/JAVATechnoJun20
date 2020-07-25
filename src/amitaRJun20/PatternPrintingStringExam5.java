package amitaRJun20;

public class PatternPrintingStringExam5 {
	void display(String input) {

		char[] a = input.toCharArray();
		for (int index = a.length - 1; index >= 0; index--) {
			for (int innerIndex = 0; innerIndex <= index; innerIndex++) {
				System.out.print(a[innerIndex]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		String input = "Globant";
		new PatternPrintingStringExam5().display(input);
	}
}
