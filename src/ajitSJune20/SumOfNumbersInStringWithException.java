/*Assignment 32
WAP to do sum of numbers in given statement. (Use split method and Exception handling concept.
Do not use character class methods and ascii concept.) 
Input : I have 5 Years 6 month of experience.
Output : 11
*/
package ajitSJune20;

public class SumOfNumbersInStringWithException {
	
	int getSumOfNumbersFromString(String input){
		int sum = 0;
		String[] array = input.split(" ");
		for(int index=0; index<array.length; index++){
			try{
				sum += Integer.parseInt(array[index]);			
			}catch(NumberFormatException ne){
			}
		}	
		return sum;		
	}	
	public static void main(String[] args) {
		String input = "I have 5 Years 6 month of experience";
		System.out.println("The given statement is : "+input);
		System.out.println("Sum of numbers in given statement is :"+new SumOfNumbersInStringWithException().getSumOfNumbersFromString(input));
	}
}