/*Coding test 10 :

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
output : 3*/

package swapnaWJun20;

public class RotationEqualString {

	void stringRotation(String input1, String input2) {
		int index = 0;

		if (input1.equals(input2))
			System.out.println("Both inputs are same, Hence no rotation");
		else {
			while (index < input1.length()) {
				input1 = input1.substring(input1.length() - 1) + input1.substring(0, input1.length() - 1);
				System.out.println(input1 + " : at rotation " + index);
				if (input1.equals(input2)) {
					System.out.println("\nMinimum rotation required : " + (index + 1));
					return;
				}
				index++;
			}
		}
	}

	public static void main(String[] args) {
		String input1 = "adbcdef";
		String input2 = "defadbc";
		System.out.println("Input : " + input1 + "\nOutput Expected : " + input2+"\n");
		new RotationEqualString().stringRotation(input1, input2);
	}
}
