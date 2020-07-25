/*
 * Print first letter capital-Using substring method
Globant
Lobant
Obant
Bant
Ant
Nt
T

 */
package pranitaPJun20;

public class Coding_Exam_6 {
		/*void printStringPattern(String input) {
			System.out.println("\nPattern Print using loop");
			for (int outerIndex = 0; outerIndex < input.length(); outerIndex++) {
				for (int innerIndex = outerIndex; innerIndex < input.length() ; innerIndex++) {
					System.out.print(input.charAt(innerIndex));
				}
				System.out.println("");
			}
		}
	
		void printStringPatternUsingSubstring(String input) {
			System.out.println("\nPattern Print Using substring method");
			for (int index = 0; index < input.length(); index++) {
				System.out.println(input.substring(0+index));
				
			}
		}*/
		
	    void printStringPattrenFirstCapitalLetter(String input) {
	    	System.out.println("\nPrint first letter capital-Using substring method");
				for(int index=0; index < input.length(); index++) {
					String tempInput = input.substring(index, input.length());
					tempInput = tempInput.replace((tempInput.charAt(0)), Character.toUpperCase(tempInput.charAt(0)));
					System.out.println(tempInput);
				}
			}
	    
	public static void main(String[] args) {
		String input ="Globant";
		Coding_Exam_6 coding_Exam_6 = new Coding_Exam_6();
		//coding_Exam_6.printStringPattern(input);
		//coding_Exam_6.printStringPatternUsingSubstring(input);
		coding_Exam_6.printStringPattrenFirstCapitalLetter(input);
	}
}
