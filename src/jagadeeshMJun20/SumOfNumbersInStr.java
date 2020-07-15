/*Assignment 26 : 9th July 2020
WAP to sum all the numbers in given string.

Input: P71Rr29T2E
Ouput: Sum of all numbers in String is: 102

Input: P6Rr29T2E3
Ouput: Sum of all numbers in String is: 40 */
package jagadeeshMJun20;
public class SumOfNumbersInStr {
	void displaySum(String inputStr) {
		int sum = 0;
		String tempStr = "0";
		for (int index = 0; index < inputStr.length(); index++) {
			if (Character.isDigit(inputStr.charAt(index)))
				tempStr = tempStr + Character.getNumericValue(inputStr.charAt(index));
			else {
				sum = sum + Integer.parseInt(tempStr);
				tempStr = "0";
			}
		}
		if (tempStr.length() != 0)
			sum = sum + Integer.parseInt(tempStr);
		System.out.println("Sum of all numbers in String " + inputStr + " is : " + sum);
	}
	
	public static void main(String[] agrs) {
		String inputStr = "P71Rr29T12E302";
		new SumOfNumbersInStr().displaySum(inputStr);
	}

}
