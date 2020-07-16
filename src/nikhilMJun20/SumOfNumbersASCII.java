/*
WAP to sum all the numbers in given string, without using Character class method.
(Note : Use Ascii value concept) .

Input: J7u9y8h1h8j4b7j3j6
Ouput: Sum of all numbers in String is - 53.
*/

package nikhilMJun20;

public class SumOfNumbersASCII {
	int getSumOfNums(String str) {
		int sum = 0;
		for(int index = 0; index<str.length(); index++) {
			if(str.charAt(index)>='0' && str.charAt(index)<='9') {
			//if(str.charAt(index)>=48 && str.charAt(index)<=57) {
				//sum += Integer.parseInt(String.valueOf(str.charAt(index)));
				//sum += (str.charAt(index) - 48);
				sum += (str.charAt(index) - '0');
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		String str = "J7u9y8h1h8j4b7j3j6";
		System.out.println("Given string : "+str+"\nSum of numbers in the given string = "+new SumOfNumbersASCII().getSumOfNums(str));
	}
}
