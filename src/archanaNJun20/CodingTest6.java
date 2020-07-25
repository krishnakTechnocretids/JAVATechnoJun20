package archanaNJun20;

public class CodingTest6 {
	void printPattern(String str) {
		for (int index = 0; index < str.length(); index++) {
			for (int innerindex = index; innerindex < str.length(); innerindex++) {
				if (innerindex == index) {
					char ch = str.charAt(innerindex);
					System.out.print(Character.toUpperCase(ch));
				} else
					System.out.print(str.charAt(innerindex));
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		CodingTest6 codingTest6=new CodingTest6();
		codingTest6.printPattern("Globant");
	}
}