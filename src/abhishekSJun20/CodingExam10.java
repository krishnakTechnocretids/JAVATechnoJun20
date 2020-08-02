package abhishekSJun20;

/*
 * Print minimum rotation required to compare both strings equality.

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
public class CodingExam10 {
	void findRotationRequired(String input1, String input2) {
		int count = 0;
		while (!input1.equals(input2)) {
			input1 = input1.substring(input1.length()-1, input1.length())+input1.substring(0,input1.length()-1);
			count++;
		}
		System.out.println("minimum rotation required : " + count);
	}

	public static void main(String[] args) {
		String input1 = "abcdef";
		String input2 = "defabc";
		System.out.println("Two Strings Input are : \n" + input1 + "\n" + input2);
		new CodingExam10().findRotationRequired(input1, input2);
	}
}
