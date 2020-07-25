package anshuKJun20;

public class Programme6 {
	void StringPatternLetter() {
		String input = "Globant";

		for (int outerIndex = 0; outerIndex < input.length(); outerIndex++) {
			String str = input.substring(outerIndex, input.length());
			str = str.replace(str.charAt(0), Character.toUpperCase(str.charAt(0)));
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		Programme6 programme6 = new Programme6();
		programme6.StringPatternLetter();
	}
}
