/*
Coding test 10 :

Print minimum rotation required to compare both strings equality.

Example 1  : 
String input1 = "abcdef";
fabcde
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


package vireshJJun20.codingExam10;

public class StringMatch {

	static void printRotationCount(String input1, String input2) {
		String temp="", temp2=""; 
		int count=0;
		if(input1.length()==input2.length()) {
			for(int index=0; index < input1.length(); index++) {
				temp = input1.substring(0, input1.length()-1);
				temp2=input1.substring(input1.length()-1);
				input1= temp2 + temp;
				count++;
				if (input1.equals(input2)) {
					System.out.println(count);
				}
			}
		}
		else
			System.out.println("Strings can not be made indentical");
	}
	
	public static void main(String[] args) {
		String input1 = "adbcdef";
		String input2 = "defadbc";
		printRotationCount(input1, input2);
		
	}
}
