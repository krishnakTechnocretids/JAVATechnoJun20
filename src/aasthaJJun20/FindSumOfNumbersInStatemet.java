package aasthaJJun20;
/*Assignment 32 :   21st July 2020

WAP to do sum of numbers in given statement. (Use split method and Exception handling concept. Do not use character class methods and ascii concept.) 

Input : I have 5 Years 6 month of experience.
Output : 11*/

public class FindSumOfNumbersInStatemet {
	void findSumfromStatement(String statement) {
		String[] statementArray = statement.split(" ");
		int sum = 0;
		for (int index = 0; index < statementArray.length; index++) {
			try {
				sum += Integer.parseInt(statementArray[index]);
			} catch (NumberFormatException numberFormatException) {

			}
		}
		System.out.println("Input  : " + statement);
		System.out.println("Output : " + sum);
	}

	public static void main(String[] args) {
		new FindSumOfNumbersInStatemet().findSumfromStatement("I have 5 Years 6 month of experience.");
	}
}
