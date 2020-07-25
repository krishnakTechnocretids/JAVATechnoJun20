package anshuKJun20;

public class Programme5 {
	void decreseStringLetter() {
		String input = "Globant";
		for (int outerIndex = 0; outerIndex < input.length(); outerIndex++) {
			for (int innerIndex = 0; innerIndex < input.length() - outerIndex; innerIndex++) {
				System.out.print(input.charAt(innerIndex));
			}
			System.out.println();
		}
	}
		
	public static void main(String[] args) {
		Programme5 programme5 = new Programme5();
		programme5.decreseStringLetter();
	}
}
