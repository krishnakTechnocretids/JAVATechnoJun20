package aditiGJUN20;

public class StringPattern2 {
	void printPattern(String str) {
		for (int index = 0; index < str.length(); index++) {
			System.out.println(str.substring(0+index));
		}
	}

	public static void main(String[] args) {
		String str = "Globant";
		new StringPattern2().printPattern(str);
	}
}
