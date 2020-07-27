package vaishnaviVJun20_Coding_Exams;

public class Pattern2 {
	void printGivenPattern(String str) {
		for (int index = 0; index < str.length(); index++) {
			String caps = str.substring(0+index);
			String str1 = str.substring(1+index);			
			System.out.println(Character.toUpperCase(caps.charAt(0)) + str1);
			
	}
}
	public static void main(String[] args) {
		new Pattern2().printGivenPattern("Globant");
	}

}