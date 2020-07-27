/*String input = "Globant";
output : Globant
         Globan
		 Globa
		 Glob
		 Glo
		 Gl
		 G */

package barkhaPJun20;

public class CodingExam_5 {
	
	void printStatement(String input) {
		for (int index=0; index<input.length(); index++) {
			System.out.println(input.substring(0,(input.length()-index)));
		}
	}
	public static void main(String[] args) {
		new CodingExam_5().printStatement("Globant");
	}
}		