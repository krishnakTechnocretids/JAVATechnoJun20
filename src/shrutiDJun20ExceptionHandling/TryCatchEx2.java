/*WAP to do sum of numbers in given statement. (Use split method and Exception handling concept. Do not use character class methods and ascii concept.) 

Input : I have 5 Years 6 month of experience.
Output : 11*/
package shrutiDJun20ExceptionHandling;

public class TryCatchEx2 {

	void findSumOfDigit(String input) {
		String[] inputArr = input.split(" ");
		int sum = 0;
		for (int index = 0; index < inputArr.length; index++) {
			try {
				if (Integer.parseInt(inputArr[index]) > 0)
					sum += Integer.parseInt(inputArr[index]);
			} catch (NumberFormatException nf) {
			}
		}
		System.out.println("Sum of numbers present in input '"+ input+ "'is " + sum);
	}
	public static void main(String[] args) {
		TryCatchEx2 TryCatchEx2 = new TryCatchEx2();
		String input = "I have 5 Years 6 month of experience";
		TryCatchEx2.findSumOfDigit(input);

	}
}
