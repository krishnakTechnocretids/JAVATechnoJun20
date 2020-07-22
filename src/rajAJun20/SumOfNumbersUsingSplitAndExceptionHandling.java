/*
  WAP to do sum of numbers in given statement. 
  (Use split method and Exception handling concept. Do not use character class methods and ASCII concept.) 
  Input : I have 5 Years 6 month of experience.
  Output : 11
 */

package rajAJun20;

public class SumOfNumbersUsingSplitAndExceptionHandling {
	
	void findSumOfNumbers(String input) {
		String[] array = input.split(" ");
		int sum = 0 ;
		for(int index = 0 ; index < array.length ; index++) {
			try {
				sum = sum + Integer.parseInt(array[index]);
			}
			catch(NumberFormatException ne){
			}
		}
		System.out.println("Sum of numbers in given string is : " +sum);
	}
	
	public static void main(String[] args) {
		new SumOfNumbersUsingSplitAndExceptionHandling().findSumOfNumbers("I have 5 Years 6 month of experience");
	}
}
