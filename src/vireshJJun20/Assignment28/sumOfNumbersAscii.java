/*
WAP to sum all the numbers in given string, without using Character class method. 
(Note : Use Ascii value concept) .

Input: J7u9y8h1h8j4b7j3j6
Ouput: Sum of all numbers in String is - 53.
*/
package vireshJJun20.Assignment28;

public class sumOfNumbersAscii {

	void sumUsingAscii(String input) {
		int sum=0;
		boolean flag=false;
		for (int index= 0; index < input.length(); index++) {
			if (input.charAt(index)>=48 && input.charAt(index)<='9') { // we can compare the current index either with ASCII value or char. 
				sum += Integer.parseInt(String.valueOf(input.charAt(index)));
				flag= true;
			}
		}
		if (flag) 
			System.out.println("Sum of all available digits: " +sum);
		else 
			System.out.println("String does not contain any digit");
	}
	
	public static void main(String[] args) {
		String str= "J7u9y8h1h8j4b7j3j6"; // abCD // 1AB6c8d1 // J7u9y8h1h8j4b7j3j6
		System.out.println("Input String: " + str);
		System.out.println();
		new sumOfNumbersAscii().sumUsingAscii(str);
	}
}
