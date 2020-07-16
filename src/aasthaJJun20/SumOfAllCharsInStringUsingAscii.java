package aasthaJJun20;
/*Assignment 28 : 16th July 2020

WAP to sum all the numbers in given string, without using Character class method. 
(Note : Use Ascii value concept) .

Input: J7u9y8h1h8j4b7j3j6
Output: Sum of all numbers in String is - 53.*/

public class SumOfAllCharsInStringUsingAscii {
	void findSumOfAllNumbers(String input){
		int sum = 0;
		for(int index = 0; index < input.length(); index++){
			if(input.charAt(index) >= '0' && input.charAt(index) <= '9'){
				sum += Integer.parseInt(String.valueOf(input.charAt(index)));
			} 
		}
		System.out.println("Sum of all the numbers in given string " + input + " = " + sum);
	}
	
	public static void main(String[] args){
		new SumOfAllCharsInStringUsingAscii().findSumOfAllNumbers("J7u9y8h1h8j4b7j3j6");
	} 	
}
