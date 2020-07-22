package harshadBJun20.assignment32;

/*Assignment 32 :   21st July 2020

WAP to do sum of numbers in given statement. (Use split method and Exception handling concept. Do not use character class methods and ascii concept.) 

Input : I have 5 Years 6 month of experience.
Output : 11*/

public class SumOfNumbersFromGivenStatement {

	void calSumOfNumbers(String str) {
		String[] strArray = str.split(" ");
		int sum=0;
		for(int index=0;index<strArray.length;index++) {
			try {
				sum += Integer.parseInt(strArray[index]);
			} catch (NumberFormatException ne) {

			}
		}
		System.out.println("Sum of numbers in a given statement is: "+sum);
	}
	public static void main(String[] args) {
		String statement="I have 5 Years 6 month of experience. ";
		System.out.println("Given statement: "+statement);
		new SumOfNumbersFromGivenStatement().calSumOfNumbers(statement);
	}
}
