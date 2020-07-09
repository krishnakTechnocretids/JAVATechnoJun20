// Find sum of all digits in given string. (Consider consecutive digits till next character as single number)

package aditiGJUN20;

public class SumOfDigits {
	int getSumofAllDigits(String str) {
		// Condition for empty String
		if (str.isEmpty()) {
			System.out.println("Null String");
			return 0;
		}
		int digitSum = 0;
		String temp = "";
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index)))
				temp += str.charAt(index);
			else {
				if (temp.length() != 0) {
					digitSum += Integer.parseInt(temp);
					temp = "";
				}
			}
		}
		if (temp.length() != 0) {
			digitSum += Integer.parseInt(temp);
		}
		return digitSum;
	}

	public static void main(String[] args) {
		SumOfDigits sumOfDigits = new SumOfDigits();
		String[] stringArray = { "A19di8t7i3112", "1Adi22ti0", "ADi31T08I", "112233", "000A111", "ADITI", "Ad0i0T0",
				"" };
		for (int index = 0; index < stringArray.length; index++) {
			System.out.println("\nThe given string is: " + stringArray[index]);
			System.out.println(
					"The sum of the digits in the string is: " + sumOfDigits.getSumofAllDigits(stringArray[index]));
		}
	}
}