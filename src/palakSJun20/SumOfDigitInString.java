/*WAP to sum all the numbers in given string, without using Character class method. 
(Note : Use Ascii value concept) .

Input: J7u9y8h1h8j4b7j3j6
Ouput: Sum of all numbers in String is - 54.
Without Character Class Method */
package palakSJun20;

public class SumOfDigitInString {

	void sumOfDigit(String string) {
		int sum = 0;
		for (int index = 0; index < string.length(); index++) {
			char ch = string.charAt(index);
			if (ch >= 48 && ch <= 57) {
				sum = sum + Integer.parseInt(String.valueOf(string.charAt(index)));
			}
		}
		System.out.println("Given String is : " + string);
		System.out.println("Sum of Digits in string : " + sum);
	}

	public static void main(String[] args) {
		SumOfDigitInString sumOfDigitInString = new SumOfDigitInString();
		sumOfDigitInString.sumOfDigit("J7u9y8h1h8j4b7j3j6");
	}
}
