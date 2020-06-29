/*Program 3: WAP to revers number (Consider Input as Integer not as String).
Example:-
Input:- 12345
Output:- 54321*/

package amitaRJun20;

public class ReverseTheNumber {
	
	//method to dispaly reverse number of input number
	void displayReverseNumber(int number) {
		int reverseNum = 0;
		while(number > 0) {
			reverseNum = (reverseNum*10) + (number%10); 
			number = number/10;	
		}
		System.out.println("Reverse number is : "+reverseNum);
	}
	
	public static void main(String[] args) {
		ReverseTheNumber reverseNum=new ReverseTheNumber();
		int number = 12345;
		System.out.println("The Input number is : "+number);
		reverseNum.displayReverseNumber(number);
	}
}
