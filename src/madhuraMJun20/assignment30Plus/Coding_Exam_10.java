/*Print minimum rotation required to compare both strings equality.
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
output : 3*/
package madhuraMJun20.assignment30Plus;

public class Coding_Exam_10 {
	static int getMinimumRotation(String input1,String input2) {
		int rotationCount = 0;
		//String temp = "";
		while(!input1.equals(input2)) {
		
			input1 = input1.substring(input1.length()-1) + input1.substring(0,input1.length()-1);
			rotationCount++;
		}
		return rotationCount;
	}
	public static void main(String[] args) {
				
		String input1 = "abcdef";
		String input2 = "defabc";
		System.out.println(getMinimumRotation(input1, input2));
	}
}
