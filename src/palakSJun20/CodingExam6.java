package palakSJun20;

public class CodingExam6 {
	void PrintingPattern(String input) {
		System.out.println("String Input : "+input);
		System.out.println("String Output : ");
		for (int index = 0; index < input.length() ; index++) {
			for (int innerindex = index; innerindex < input.length(); innerindex++) {
				System.out.print(input.charAt(innerindex));	
			}
			System.out.println();
		}	
	}
	public static void main(String[] args) {
		CodingExam6 codingExam6 = new CodingExam6();
		String input = "Globant";
		codingExam6.PrintingPattern(input);
	}

}
