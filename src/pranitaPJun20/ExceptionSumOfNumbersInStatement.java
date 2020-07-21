/* Assignment 32 :   21st July 2020

WAP to do sum of numbers in given statement. (Use split method and Exception handling concept. Do not use character class methods and ascii concept.) 

Input : I have 5 Years 6 month of experience.
Output : 11
 */
package pranitaPJun20;

public class ExceptionSumOfNumbersInStatement {
	void findSumOfNumbers(String input) {
		int sum = 0;
		String[] array = input.split(" ");
		for (int index = 0; index < array.length; index++) {
			try {
				sum += Integer.parseInt(array[index]);
			} catch (NumberFormatException nfe) {
				
			}
		}
		System.out.println("Input statement is: " + input);
		System.out.println("Sum of numbers in given statement is: " + sum);
	}

	public static void main(String[] args) {
		String input = "I have 5 Years 6 month of experience.";
		new ExceptionSumOfNumbersInStatement().findSumOfNumbers(input);
	}
}