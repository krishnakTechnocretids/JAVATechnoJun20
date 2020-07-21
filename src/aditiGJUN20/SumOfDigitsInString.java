/*
 * WAP to do sum of numbers in given statement. 
 * (Use split method and Exception handling concept. Do not use character class methods and ASCII concept.) 
 * Input : I have 5 Years 6 month of experience.
 * Output : 11
 */

package aditiGJUN20;

public class SumOfDigitsInString {
	int getSumOfNumbers(String input) {
		int sum=0;
		String[] strArray=input.split(" ");
		for (int index = 0; index < strArray.length; index++) {
			try {
				sum+=Integer.parseInt(strArray[index]);
			} catch (NumberFormatException numberFormatException) {
				
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		String str="I have 5 Years 6 month of experience.";
		System.out.println("For input String: "+str+"\nAddition of all digits present in string is: "+new SumOfDigitsInString().getSumOfNumbers(str));
	}
}
