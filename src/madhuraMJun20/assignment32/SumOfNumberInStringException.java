/*WAP to do sum of numbers in given statement. (Use split method and Exception handling concept. 
 Do not use character class methods and ascii concept.)
 Input : I have 5 Years 6 month of experience. 
 Output : 11*/
package madhuraMJun20.assignment32;

public class SumOfNumberInStringException {
	void sumOfNumbers(String input) {
		String[] arr = input.split(" ");
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			try {
				sum += Integer.parseInt(arr[index]);
			} catch (NumberFormatException ne) {
				
			}
		}
		System.out.println("Input : " + input);
		System.out.println("Sum : " + sum);
	}

	public static void main(String[] args) {
		SumOfNumberInStringException sumOfNumberInStringException = new SumOfNumberInStringException();
		String input = "I have 5 Years 6 month of experience.";
		sumOfNumberInStringException.sumOfNumbers(input);
	}
}