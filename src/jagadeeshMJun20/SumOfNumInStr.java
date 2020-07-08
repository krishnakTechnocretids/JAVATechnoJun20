/*Assignment 25 : 8th July 2020

WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all numbers in String is: 53 */
package jagadeeshMJun20;

public class SumOfNumInStr {
	void displayOutput(String inputStr) {
		int sum =0;
		for(int index=0;index<inputStr.length();index++) {
		char ch = inputStr.charAt(index);
		if(Character.isDigit(ch))
			sum = sum+Integer.parseInt(String.valueOf(ch));
	}
		System.out.println("Sum of all numbers in String: "+inputStr+" is --> " +sum);
	}
	public static void main(String[] args) {
		String inputStr ="J7yu9y8h1h8j4b7j3jjb6";
		new SumOfNumInStr().displayOutput(inputStr);
	}

}
