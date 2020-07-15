/*Assignment 26 : 9th July 2020
WAP to sum all the numbers in given string.

Input: P71Rr29T2E
Ouput: Sum of all numbers in String is: 102

Input: P6Rr29T2E3
Ouput: Sum of all numbers in String is: 40
*/
package archanaNJun20;
public class SumOfNumbers {
	void printSumOfNumber(String input){
		String temp="0";
		int sum=0;
		for (int index=0;index<input.length();index++){	
			if(Character.isDigit(input.charAt(index))) {
				temp+=input.charAt(index);
			}
			else{
				sum+=Integer.parseInt(temp);
				temp="0";
			}
		}
		if(!temp.equals("0"))
			sum += Integer.parseInt(temp);
		System.out.println("Sum of all numbers in String is: "+sum);
	}
	public static void main(String[] args) {
		SumOfNumbers sumOfNumbers=new SumOfNumbers();
		sumOfNumbers.printSumOfNumber("P71Rr29T2E");
		sumOfNumbers.printSumOfNumber("P6Rr29T2E3");
	}
}
