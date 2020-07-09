/*
WAP to sum all the numbers in given string.
Input: J7yu98y8h12h8j4b7j3jjb67
Ouput: Sum of all integers in String is: 214

Hint: 98 should b considered as integer, not as 9 and 8.
*/

package nikhilMJun20;

public class SumOfAllIntegers {
	int getSumOfAllIntegers(String str) {
		int sum=0;
		String strTemp="";
		for(int index=0; index<str.length(); index++) {
			if(Character.isDigit(str.charAt(index))) {
				strTemp += String.valueOf(str.charAt(index));
			}else {
				if(strTemp.length() != 0) {
					sum += Integer.parseInt(strTemp);
					strTemp="";
				}
			}
		}
		if(strTemp.length() != 0) {
			sum += Integer.parseInt(strTemp);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		String str = "J7yu98y8h12h8j4b7j3jjb67";
		System.out.println("Given string: "+str+"\nSum of all integers in the string = "+(new SumOfAllIntegers().getSumOfAllIntegers(str)));
	}
}
