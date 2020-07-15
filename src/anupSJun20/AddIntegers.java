package anupSJun20;
/*WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all numbers in String is: 53*/

public class AddIntegers {
	int sum = 0;
	void findSumOfIntegers(String str) {
		for(int index = 0;index<str.length();index++) {
			if(Character.isDigit(str.charAt(index))) {
				sum += Integer.parseInt(String.valueOf(str.charAt(index)));
			}
		}
		System.out.println("The sum of the numbers in the String : " + str + " is : "+ sum);
	}
	
	public static void main(String[] args) {
		AddIntegers addIntegers = new AddIntegers();
		String str = "J7yu9y8h1h8j4b7j3jjb6";
		addIntegers.findSumOfIntegers(str);
	}
}