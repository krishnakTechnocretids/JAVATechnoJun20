/*Assignment 32 : 21st July 2020
WAP to do sum of numbers in given statement. (Use split method and Exception handling concept. Do not use character class methods and ascii concept.)

Input : I have 5 Years 6 month of experience.
Output : 11
*/

package nikhilMJun20;

public class SumOfNumbersInAString {
	double getSumOfNumbers (String str) {
		String[] strArray = str.split(" ");
		double sum = 0.0;
		for(int index = 0; index<strArray.length; index++) {
			try {
				sum += Double.parseDouble(strArray[index]);
			}catch(NumberFormatException nfe) {}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		String str = "I have 5 Years 6 month of experience.";
		System.out.println("Given string:-\n"+str+"\n\nSum of numerical values present in the string = "+new SumOfNumbersInAString().getSumOfNumbers(str));
	}
}
