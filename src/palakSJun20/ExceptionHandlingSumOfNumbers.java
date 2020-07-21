/* WAP to do sum of numbers in given statement. 
 (Use split method and Exception handling concept. Do not use character class methods and ascii concept.) 

Input : I have 5 Years 6 month of experience.
Output : 11*/
package palakSJun20;

public class ExceptionHandlingSumOfNumbers {

	void findSumOfNumbers(String input) {
		int sum = 0;
		String[] array = input.split(" ");
		for (int index = 0; index < array.length; index++) {
			try {
				sum += Integer.parseInt(array[index]);
			} catch (NumberFormatException nfe) {
				System.out.print("");
			}
		}
		System.out.println("Output: " + sum);
	}

	public static void main(String[] args) {
		ExceptionHandlingSumOfNumbers exceptionHandlingSumOfNumbers = new ExceptionHandlingSumOfNumbers();
		String input = "I have 5 Years 6 month of experience";
		System.out.println("Input : " + input);
		exceptionHandlingSumOfNumbers.findSumOfNumbers(input);
	}
}
