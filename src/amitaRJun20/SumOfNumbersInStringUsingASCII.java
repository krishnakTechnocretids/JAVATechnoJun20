/*Assignment 28 : 16th July 2020

WAP to sum all the numbers in given string, without using Character class method. 
(Note : Use Ascii value concept) .

Input: J7u9y8h1h8j4b7j3j6
Ouput: Sum of all numbers in String is - 54.*/
package amitaRJun20;

public class SumOfNumbersInStringUsingASCII {
	
	void getSumOfNumbers(String input){
		
		int sum = 0;
		for(int index=0;index<input.length();index++){
			if(input.charAt(index)>='0' && input.charAt(index)<='9'){ //method 1
			 	sum += Character.getNumericValue(input.charAt(index));
			/*	if (input.charAt(index) >= 48 && input.charAt(index) <= 57){ //method 2
				  	sum += Integer.parseInt(String.valueOf(input.charAt(index)));*/
					/*if (input.charAt(index) >= '0' && input.charAt(index) <= '9') { //method 3
						sum += (input.charAt(index) - '0');*/
				}	
		}
		System.out.println("Sum of numbers in the String is :"+sum);
	}

	public static void main(String[] args) {
		String input = "J7u9y8h1h8j4b7j3j6";
		System.out.println("The input String is : "+input);
		new SumOfNumbersInStringUsingASCII().getSumOfNumbers(input);
	}
}