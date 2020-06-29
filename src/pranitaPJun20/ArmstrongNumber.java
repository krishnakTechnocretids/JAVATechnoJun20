/*
 * Program 4: WAP to check if a number is Armstrong or not.
Example:-
Input:- 153
Output:-153
hint:- (1*1*1)+(5*5*5)+(3*3*3)
1+125+27
153
 */
package pranitaPJun20;

public class ArmstrongNumber {
	//Method to find Armstrong Number
	void findArmstrongNumber(int input) {
		int numExpected= input;
		int numActual=0;
		while(input>0) {
			numActual += Math.pow((input % 10), 3);
			input=input/10;
		}
		if(numExpected==numActual) {
			System.out.println("Given number "+numExpected+" is Armstrong number");
		}
		else
			System.out.println("Given number "+numExpected+" is not Armstrong number");
	}
	
	public static void main(String[] args) {
		int input=153;
		ArmstrongNumber armstrongNumber = new ArmstrongNumber();
		armstrongNumber.findArmstrongNumber(input);
	}

}
