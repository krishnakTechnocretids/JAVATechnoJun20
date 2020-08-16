package aasthaJJun20;

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
public class FindMinimumRotations {
	void displayMinimumRotations(String input1, String input2) {
		System.out.println("String input1 = " + input1);
		System.out.println("String input2 = " + input2);
		if (input1.length() == input2.length()) {
			int count = 0;
			while (!input1.equals(input2)) {
				input1 = input1.substring(input1.length() - 1) + input1.substring(0, input1.length() - 1);
				count++;
				System.out.println(input1 + " - Rotation " + count);
				if (count >= input1.length()) {
					System.out.println("Maximum rotations attempted - Strings doesn't match");
					return;
				}
			}
			System.out.println("Output : " + count);
		} else
			System.out.println("Both strings are different in length");
	}

	public static void main(String[] args) {
		new FindMinimumRotations().displayMinimumRotations("abcdef", "defabc");
		System.out.println();
		new FindMinimumRotations().displayMinimumRotations("adbcdef", "defadbc");
		System.out.println();
		new FindMinimumRotations().displayMinimumRotations("adbcdef", "adbcdef");
		System.out.println();
		new FindMinimumRotations().displayMinimumRotations("abcdef", "defrbc");
		System.out.println();
		new FindMinimumRotations().displayMinimumRotations("pqrst", "pqrzst");
	}
}
