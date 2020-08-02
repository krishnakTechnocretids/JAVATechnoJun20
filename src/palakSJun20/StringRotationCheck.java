/*Coding test 10 :
Print minimum rotation required to compare both strings equality.
Example 2 :
String input1 = "adbcdef"; -> push right
fadbcde
efadbcd
defadbc
*/
package palakSJun20;

public class StringRotationCheck {

	public void findMinimumRotattion(String input1, String input2) {
		int count = 0;
		if (input1.length() != input2.length())
			System.out.println("String lengths are not same");
		else {
			while (!input1.equals(input2)) {

				input1 = input1.substring(input1.length() - 1) + input1.substring(0, input1.length() - 1);
				count++;
			}
			System.out.println("Minimum Rotation Required for Equality Check " + count);
		}
	}

	public static void main(String[] args) {
		String input1 = "adbcdef";
		String input2 = "defadbc";
		System.out.println("Input1 - "+input1 + "\nInput2 - " + input2);
		new StringRotationCheck().findMinimumRotattion(input1, input2);

	}
}
