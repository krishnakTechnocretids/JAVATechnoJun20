package archanaNJun20;

public class CodingTest5 {
	void printPattern(String str) {
		for (int index = 0; index < str.length(); index++) {
			for (int innerindex = 0; innerindex < str.length()-index; innerindex++)
				System.out.print(str.charAt(innerindex));
			System.out.println();
		}
	}
	public static void main(String[] args) {
		CodingTest5 codingTest5 = new CodingTest5();
		codingTest5.printPattern("Globant");
	}
}
