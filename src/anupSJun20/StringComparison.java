package anupSJun20;
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

public class StringComparison {
	
	void findRotationRequired(String str1, String str2) {
		int count = 0;
		while(!str1.equalsIgnoreCase(str2)) {
			str1 = str1.substring(str1.length()-1, str1.length())+str1.substring(0,str1.length()-1);
			//System.out.println(str1);
			count++;
		}
		System.out.println("Total iterations is " +count);
	}
	
	public static void main(String[] args) {
		String input1 = "abcdef";
		String input2 = "defabc";
		StringComparison stringComparison = new StringComparison();
		stringComparison.findRotationRequired(input1, input2);
	}
}