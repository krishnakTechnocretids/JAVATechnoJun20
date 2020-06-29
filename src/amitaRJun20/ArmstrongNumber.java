/*WAP to check if a number is Armstrong or not.
Example:-
Input:- 153
Output:-153*/

package amitaRJun20;

public class ArmstrongNumber {
	
	//Method to find armstrong number
	void findNumberIsArmstrong(int number) {
		
		int temp = number, armstrongnum = 0;
		while(temp > 0) {
			armstrongnum = armstrongnum + ((temp % 10)*(temp % 10)*(temp % 10));
			temp = temp / 10;
		}
		if(number == armstrongnum) {
			System.out.println("The number "+number+" is armstrong number");
		}
		else {
			System.out.println("The number "+number+" is not armstrong number");
		}
	}

	public static void main(String[] args) {
		ArmstrongNumber amstrongNumber = new ArmstrongNumber();
		int number = 153;
		amstrongNumber.findNumberIsArmstrong(number);
	}
}
