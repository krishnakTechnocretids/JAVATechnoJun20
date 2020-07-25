package aditiGJUN20;

public class StringPattern2 {
	void printPattern(String str) {
		for (int index = 0; index < str.length(); index++) {	
			String temp = (str.substring(index, index+1).toUpperCase());
			System.out.println(temp + str.substring(index+1, str.length()));
		}
	}

	public static void main(String[] args) {
		String str = "Globant";
		new StringPattern2().printPattern(str);
	}
}
