/*
 * Coding test 10 :

Print minimum rotation required to compare both strings equality.

Example 1  : 
String input1 = "abcdef";
String input2 = "defabc";
output : 3

Example 2  : 
String input1 = "adbcdef"; -> push right
fadbcde
efadbcd
defadbc
String input2 = "defadbc";
output : 3
 */
package pranitaPJun20;

public class Coding_Exam_10 {

	void CompareStringsAndfindMinimunRotation(String input1, String input2) {
		int rotationCount = 0;
		while (!input1.equals(input2)) {
			input1 = input1.charAt(input1.length() - 1) + input1.substring(0, input1.length() - 1);
			// input = input.substring(input.length()-1).concat(input.substring(0,input.length()-1));
			rotationCount++;
		}

		System.out.println("Total Rotation count required is: " + rotationCount);
	}

	public static void main(String[] args) {
		String input1 = "abcdef";
		String input2 = "defabc";
		new Coding_Exam_10().CompareStringsAndfindMinimunRotation(input1, input2);

	}
}
