/*Assignment 26 : 9th July 2020
WAP to sum all the numbers in given string.
// str="P71Rr29T2E";
Ouput: Sum of all numbers in String is: 102

Input: P6Rr29T2E3
Ouput: Sum of all numbers in String is: 40
*/
package rachanaGJun20.String;

public class SumOfDigitsInSequence {

	void sumOfNumber(String str) {
		String temp = "";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				temp = String.valueOf(str.charAt(i));
				for (int j = i + 1; j < str.length(); j++) {
					if (Character.isDigit(str.charAt(j))) {
						temp = temp + str.charAt(j);
						i = j;
					} else {
						break;
					}
				}
				sum = sum + Integer.parseInt(temp);
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		SumOfDigitsInSequence sumofdigitsinsequence = new SumOfDigitsInSequence();
		System.out.println("Input: P71Rr29T2E");
		sumofdigitsinsequence.sumOfNumber("P71Rr29T2E");
		System.out.println("Input: P6Rr29T2E3");
		sumofdigitsinsequence.sumOfNumber("P6Rr29T2E3");

	}

}
