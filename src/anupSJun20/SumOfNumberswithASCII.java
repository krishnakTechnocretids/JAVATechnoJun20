package anupSJun20;
/*Assignment 28 : 16th July 2020

WAP to sum all the numbers in given string, without using Character class method. 
(Note : Use Ascii value concept) .

Input: J7u9y8h1h8j4b7j3j6
Ouput: Sum of all numbers in String is - 54.*/

public class SumOfNumberswithASCII {
	int sum = 0;
	int sumofNumbersinString(String str) {
		for(int index = 0;index<str.length();index++) {
			char ch = str.charAt(index);
			if(ch>=48 && ch<=57) {
				sum +=ch - 48;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		SumOfNumberswithASCII sumofNumberswithASCII = new SumOfNumberswithASCII();
		String str = "J7u9y8h1h8j4b7j3j6";
		System.out.println("The input string is " + str);
		System.out.println("The sum is :"+sumofNumberswithASCII.sumofNumbersinString(str));
	}
}
