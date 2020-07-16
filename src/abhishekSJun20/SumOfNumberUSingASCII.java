package abhishekSJun20;

/*WAP to sum all the numbers in given string, without using Character class method. 
(Note : Use Ascii value concept) .

Input: J7u9y8h1h8j4b7j3j6
Ouput: Sum of all numbers in String is - 54.
*/
public class SumOfNumberUSingASCII {
	void sumOfAllIntegersInAStringUsingAscii(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) >= 48 && input.charAt(index) <= 57) {
				sum += input.charAt(index) - '0';
			}
		}
		System.out.println("Sum of all numbers in String is: " + sum);
	}

	public static void main(String[] args) {
		new SumOfNumberUSingASCII().sumOfAllIntegersInAStringUsingAscii("J7u9y8h1h8j4b7j3j6");
	}
}
