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
		String temp = "0"; // Earlier tried with "" and null but had thrown exception so settled with 0 as
							// doing integer sum.
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				temp += ch;
			else {
				digitSum += Integer.parseInt(temp);
				temp = "0";
			}
		}
		int finalSum = digitSum + Integer.parseInt(temp);
		if (finalSum == 0 && str.contains("0"))
			System.out.println("Input String contains only '0' as digit");
		return finalSum;
	}

	public static void main(String[] args) {
		SumOfDigits sumOfDigits = new SumOfDigits();
		// A19di8t7i3112 , 1Adi22ti0
		String[] stringArray = { "A19di8t7i3112", "1Adi22ti0", "ADi31T08I", "112233", "000A111", "ADITI", "Ad0i0T0",
				"" };
		for (int index = 0; index < stringArray.length; index++) {
			System.out.println("\nThe given string is: " + stringArray[index]);
			System.out.println(
					"The sum of the digits in the string is: " + sumOfDigits.getSumofAllDigits(stringArray[index]));
		}
	}
}
