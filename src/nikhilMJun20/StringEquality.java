/*
Coding test 10 :

Print minimum rotation required to compare both strings equality.

Example 1 :
String input1 = "abcdef";
String input2 = "defabc";
output : 3

Example 2 :
String input1 = "adbcdef"; -> push right
fadbcde
efadbcd
defadbc
String input2 = "defadbc";
output : 3
*/

package nikhilMJun20;

public class StringEquality {
	int getRotationCount(String input1, String input2) {
		int count = 0;
		while(! input1.equals(input2)) {
			input1 = input1.charAt(input1.length()-1) + input1.substring(0, (input1.length()-1));
			count++;
		}		
		return count;
	}
	
	public static void main(String[] args) {
		String input1 = "abcdef";
		String input2 = "defabc";
		System.out.println("Given strings:-\n"+input1+"\n"+input2);
		System.out.println("\nNo. of rotations required for making both strings equql = "+new StringEquality().getRotationCount(input1, input2));
	}
}
