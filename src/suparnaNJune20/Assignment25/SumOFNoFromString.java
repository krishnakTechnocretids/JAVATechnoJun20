/*
 * Assignment 25 : 8th July 2020

WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all numbers in String is: 53
 */
package suparnaNJune20.Assignment25;

public class SumOFNoFromString {
	void sumOfNo(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index)))
				sum += Integer.parseInt(str.valueOf(str.charAt(index)));
		}
		System.out.println("String = " + str);
		System.out.println("Sum = " + sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SumOFNoFromString().sumOfNo("J7yu9y8h1h8j4b7j3jjb6");
	}
}
