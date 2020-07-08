/*
 WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all numbers in String is: 53
 */

package shrutiDJun20Assignments;

public class SumOfStringNum {

public static void main(String[] args) {
	SumOfStringNum sumOfStringNum = new SumOfStringNum();
	sumOfStringNum.sumOfdigitd("J7yu9y8h1h8j4b7j3jjb6");	
}

void sumOfdigitd(String input){
	 int sum = 0;
	for(int index = 0; index<input.length();index++){
		if(Character.isDigit(input.charAt(index))){		
		sum = sum+ Integer.parseInt(input.valueOf(input.charAt(index)));
		}
	}
	System.out.println("Sum of all the digits present in String --> "+input+" is "+sum);
}
}
