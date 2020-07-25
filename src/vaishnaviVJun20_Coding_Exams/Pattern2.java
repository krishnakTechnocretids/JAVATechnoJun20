package vaishnaviVJun20_Coding_Exams;

public class Pattern2 {
	void printGivenPattern(String str) {
		for (int index = 0; index < str.length(); index++) {
			System.out.println(str.substring(0+index));
		}
	}

	public static void main(String[] args) {
		new Pattern2().printGivenPattern("Globant");
	}

}