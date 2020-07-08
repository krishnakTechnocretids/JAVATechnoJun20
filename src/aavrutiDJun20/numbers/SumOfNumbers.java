/*sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Output: Sum of all numbers in String is: 53*/

package aavrutiDJun20.numbers;

public class SumOfNumbers {
	
	void sumOfDigit(String input) {
		int sum = 0;
		for(int index=0;index<input.length();index++) {
			if(Character.isDigit(input.charAt(index)))
				sum += Integer.parseInt(String.valueOf(input.charAt(index)));
		}
		System.out.println("Sum of all numbers in String is: " + sum);
	}
	
	public static void main(String[] args) {
		SumOfNumbers sumOfNumbers = new SumOfNumbers();
		String input = "J7yu9y8h1h8j4b7j3jjb6";
		sumOfNumbers.sumOfDigit(input);
	}
}