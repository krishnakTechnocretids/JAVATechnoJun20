/*WAP to sum all the numbers in given string, without using Character class method. 
(Note : Use Ascii value concept) .
Input: J7u9y8h1h8j4b7j3j6
Ouput: Sum of all numbers in String is - 54.
A-Z = 65-90
a-z = 97-122
0-9 = 48-57
*/
package madhuraMJun20;
public class SumOfNumbersASCII {
	void sumOfNumbersUsingAsciiValue(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) >= 48 && input.charAt(index) <= 57) {
				sum += Integer.parseInt(String.valueOf(input.charAt(index)));
			}
		}
		System.out.println("Sum of all numbers in String is : " + sum);
	}

	public static void main(String[] args) {
		SumOfNumbersASCII sumOfNumbersASCII = new SumOfNumbersASCII();
		sumOfNumbersASCII.sumOfNumbersUsingAsciiValue("J7u9y8h1h8j4b7j3j6");
	}
}