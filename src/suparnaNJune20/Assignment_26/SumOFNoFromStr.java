/*
 * Assignment 26 : 9th July 2020
WAP to sum all the numbers in given string.

Input: P71Rr29T2E
Ouput: Sum of all numbers in String is: 102

Input: P6Rr29T2E3
Ouput: Sum of all numbers in String is: 40
 */
package suparnaNJune20.Assignment_26;

public class SumOFNoFromStr {
	void findSum(String str) {
			int sum = 0, tempNo = 0;
		for (int outerIndex = 0; outerIndex < str.length(); outerIndex++) {
			tempNo = 0;
			if (Character.isDigit(str.charAt(outerIndex))) {
				for (; outerIndex < str.length(); outerIndex++) {
					if (Character.isDigit(str.charAt(outerIndex))) {
						tempNo = tempNo * 10 + Character.getNumericValue(str.charAt(outerIndex));
					} else {
						sum = sum + tempNo;
						break;
					}
				}
			}
		}
		sum = sum + tempNo;
		System.out.println("sum =" + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input =  P71Rr29T2E");
		new SumOFNoFromStr().findSum("P71Rr29T2E");
		System.out.println("Input =  P6Rr29T2E3");
		new SumOFNoFromStr().findSum("P6Rr29T2E3");
	}

}
