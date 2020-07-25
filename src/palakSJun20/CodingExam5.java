/*String input = "Globant";
output : Globant
         Globan
		 Globa
		 Glob
		 Glo
		 Gl
		 G*/
package palakSJun20;

public class CodingExam5 {
	void PrintingPattern(String input) {
		System.out.println("String Input : "+input);
		System.out.println("String Output : ");
		for (int index = input.length(); index > 0 ; index--) {
			for (int innerindex = 0; innerindex < index; innerindex++) {
				System.out.print(input.charAt(innerindex));	
			}
			System.out.println();
		}	
	}
	
	public static void main(String[] args) {
		CodingExam5 codingExam5 = new CodingExam5();
		String input = "Globant";
		codingExam5.PrintingPattern(input);
	}
}
