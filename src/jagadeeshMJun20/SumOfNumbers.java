/* WAP to sum all the numbers in given string, without using Character class method. 
(Note : Use Ascii value concept) .

Input: J7u9y8h1h8j4b7j3j6
Ouput: Sum of all numbers in String is - 54. */
package jagadeeshMJun20;

public class SumOfNumbers {
	void displaySum(String inputStr) {
		int sum = 0;
		for (int index = 0; index < inputStr.length(); index++) {
			int x = inputStr.charAt(index);
			if (x > 47 && x < 58) {
				sum = sum + Character.getNumericValue(x);
			}
		}
		System.out.println("Sum of all numbers in String is - "+sum);
		
	}
	public static void main(String[] agrs) {
		String inputStr="J7u9y8h1h8j4b7j3j6";
		new SumOfNumbers().displaySum(inputStr);
	}
}
