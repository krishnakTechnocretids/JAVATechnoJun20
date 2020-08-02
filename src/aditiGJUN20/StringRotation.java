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

package aditiGJUN20;

public class StringRotation {
	int getStringRotationCount(String input1, String input2) {
		int count = 0;
		if (input1.equals(null) || input2.equals(null) || input1.length() != input2.length())
			System.out.println("Strings are not matching with any rotation");
		else {
			while (!input1.equals(input2)) {
				input1 = input1.charAt(input1.length() - 1) + input1.substring(0, (input1.length() - 1));
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		StringRotation stringRotation = new StringRotation();
		String input1 = "abcdef";
		String input2 = "defabc";
		System.out.println("Total rotation required to match "+input1+" and "+input2+" : "+stringRotation.getStringRotationCount(input1, input2));
		String input3 = "abcdef";
		String input4 = "defabcaa";
		System.out.println("Total rotation required to match "+input3+" and "+input4+" : "+stringRotation.getStringRotationCount(input3, input4));
		
	}
}
