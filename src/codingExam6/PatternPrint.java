package codingExam6;

public class PatternPrint{
	void printPattern(String str) {
		for (int outerIndex = 0; outerIndex < str.length(); outerIndex++) {
			for (int innerIndex = outerIndex; innerIndex < str.length(); innerIndex++) {
				if(innerIndex == outerIndex)
					System.out.print(Character.toUpperCase(str.charAt(innerIndex)) );
				else
				System.out.print(str.charAt(innerIndex));
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		new PatternPrint().printPattern("Globant");
	}
}
