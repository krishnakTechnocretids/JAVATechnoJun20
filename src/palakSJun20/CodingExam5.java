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
	
	//Using 2 Loop
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
	
	//Using 1 Loop
	void PrintingPatter() {
		String input = "Globant";
		System.out.println("\nString Input : "+input);
		System.out.println("String Output : ");
		for (int index = 0; index < input.length(); index++) {
			System.out.println(input.substring(0, input.length()-index));
		}
	}
	public static void main(String[] args) {
		CodingExam5 codingExam5 = new CodingExam5();
		String input = "Globant";
		codingExam5.PrintingPattern(input);
		codingExam5.PrintingPatter();
	}
}
