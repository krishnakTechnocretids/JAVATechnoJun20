package madhuraMJun20.assignment30Plus;
/*String input = "Globant";
output : Globant
         Globan
		 Globa
		 Glob
		 Glo
		 Gl
		 G
Branch Name : Nikhil_Coding_Exam_5	 */
public class Coding_Exam_5 {
	void printStringDecreasing(String input) {
		int len =input.length();
		for(int index=len; index>0;index--) {
			for (int innerIndex=0 ;innerIndex<index; innerIndex++) {
				System.out.print(input.charAt(innerIndex));
			}
			System.out.println();
			
		}
	}
	public static void main(String [] args) {
		new Coding_Exam_5().printStringDecreasing("Globant");
	}
}
