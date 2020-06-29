/*Program 3: WAP to reverse number (Consider Input as Integer not as String).
Example:-
Input:- 12345
Output:- 54321*/
package palakSJun20;

public class ReverseIntegerNumbers {

	//Method to Reverse the integer Numbers
	void reverseInteger(int number) {
		int reverse = 0; 
		int temp = number;
		while (temp > 0) {
			reverse = reverse*10+(temp % 10);	
			temp = temp / 10;
		}
		System.out.print(reverse);
	}
	public static void main(String[] args) {
		ReverseIntegerNumbers integerNumbers = new ReverseIntegerNumbers();
		int number = 12345;
		System.out.print("Input : " +number +"\nOutput : ");
		integerNumbers.reverseInteger(number);
	}
}
