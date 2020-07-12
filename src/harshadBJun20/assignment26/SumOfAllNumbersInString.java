package harshadBJun20.assignment26;

/*Assignment 26 : 9th July 2020
WAP to sum all the numbers in given string.

Input: P71Rr29T2E
Ouput: Sum of all numbers in String is: 102

Input: P6Rr29T2E3
Ouput: Sum of all numbers in String is: 40*/

public class SumOfAllNumbersInString {

	void calSumOfAllNumbers(String str) {
		int sumOfDigit=0;
		String digitValue="";
		for(int index=0;index<str.length();index++) {
			if(Character.isDigit(str.charAt(index))) {
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
		SumOfAllNumbersInString sumOfAllNumbersInString = new SumOfAllNumbersInString();
		sumOfAllNumbersInString.calSumOfAllNumbers("P71Rr29T2E");
		sumOfAllNumbersInString.calSumOfAllNumbers("P6Rr29T2E3");
	}
}
