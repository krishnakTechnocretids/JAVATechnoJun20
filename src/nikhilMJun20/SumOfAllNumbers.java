/*
WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all numbers in String is: 54
*/

package nikhilMJun20;

public class SumOfAllNumbers {
	int getSumOfNumbers(String str) {
		int sum = 0;
		for(int index=0; index<str.length(); index++) {
			if(Character.isDigit(str.charAt(index))){
				//sum += Integer.parseInt(String.valueOf(str.charAt(index)));
				//Another shorter way...
				sum += Character.getNumericValue(str.charAt(index));
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		String str = "J7yu9y8h1h8j4b7j3jjb6";
		System.out.println("Given String: "+str+"\nSum of all numbers in the above string = "+(new SumOfAllNumbers().getSumOfNumbers(str)));
	}
}
