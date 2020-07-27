package rajAJun20;

public class Exam5 {
	
	void findOutputOfString(String input) {
		for (int index = 0; index < input.length(); index++) {
			System.out.println(input.substring(0, input.length() - index));
		}
	}
	
	public static void main(String[] args) {
		String str = "Globant";
		new Exam5().findOutputOfString(str);	
	}
}
