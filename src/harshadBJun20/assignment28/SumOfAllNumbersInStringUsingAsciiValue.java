package harshadBJun20.assignment28;

/*Assignment 28 : 16th July 2020

WAP to sum all the numbers in given string, without using Character class method. 
(Note : Use Ascii value concept) .

Input: J7u9y8h1h8j4b7j3j6
Ouput: Sum of all numbers in String is - 53.*/

public class SumOfAllNumbersInStringUsingAsciiValue {
	
	void calSumOfAllNumbers(String str) {
		int sumOfDigit=0;
		String digitValue="";
		for(int index=0;index<str.length();index++) {
			if(str.charAt(index)==48||str.charAt(index)==49||str.charAt(index)==50||str.charAt(index)==51||str.charAt(index)==52||str.charAt(index)==53||str.charAt(index)==54||str.charAt(index)==55||str.charAt(index)==56||str.charAt(index)==57) {
				digitValue += str.charAt(index);
			}else if(!digitValue.equals("")) {
					sumOfDigit += Integer.parseInt(digitValue);
					digitValue = "";
				}
		}
		if(!digitValue.equals("")) {
			sumOfDigit += Integer.parseInt(digitValue); 
		}
		
		System.out.println("Sum of all numbers in String "+str+" is: "+sumOfDigit);
	}
	public static void main(String[] args) {
		SumOfAllNumbersInStringUsingAsciiValue sumOfAllNumbersInStringUsingAsciiValue = new SumOfAllNumbersInStringUsingAsciiValue();
		//String str = "J7u9y8h1h8j4b7j3j6";
		sumOfAllNumbersInStringUsingAsciiValue.calSumOfAllNumbers("J7u9y8h1h8j4b7j3j6");
	}
}
