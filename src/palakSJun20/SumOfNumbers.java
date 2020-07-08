package palakSJun20;

/*Assignment 25 : 8th July 2020

WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Output: Sum of all numbers in String is: 53 
*/

public class SumOfNumbers {
	
	void findNumbersAndSum(String str) {
		int sum = 0; int num ;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				num = Integer.parseInt(String.valueOf(str.charAt(i)));
				sum = sum + num;
			}
		}
		System.out.println( "Given String "+str);
		System.out.println("Sum of all numbers in String is : "+ sum);
	}
	
	public static void main(String[] args) {
		SumOfNumbers numbers = new SumOfNumbers();
		String str = "J7yu9y8h1h8j4b7j3jjb6";
		numbers.findNumbersAndSum(str);

	}

}
