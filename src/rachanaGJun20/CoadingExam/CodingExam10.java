/*Coding test 10 :

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
output : 3*/
package rachanaGJun20.CoadingExam;

public class CodingExam10 {
	
	static void compareString() {
		String input1 = "abcdef";
		String input2 = "defabc";
		int iterationCount = 0;
		if (input1.length() == input2.length()) {
			while (!input1.equals(input2)) {
				input1 = input1.charAt(input1.length() - 1) + input1.substring(0, input1.length() - 1);
				iterationCount++;
				System.out.println(input1);
			}
			System.out.println("total iterationcount = "+iterationCount);
		} else
			System.out.println("Strings are not of same length could not compare");
	}

	public static void main(String[] args) {
		compareString();

	}
}
